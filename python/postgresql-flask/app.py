from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

isLogged = True

connections = []
@app.route("/")
def main():
    
    addConnection('purchases db')
    addConnection('finance db')
    addConnection('scotiabank db')
    if isLogged:
        return render_template('index.html', connections=connections) 
    return redirect(url_for('login'))

@app.route('/login', methods=['POST', 'GET'])
def login():
    error = None
    
    if isLogged is True:
        return redirect('/')
    else:
        if request.method == 'POST':
            if valid_login(request.form['username'], request.form['password']):
                return log_the_user_in(request.form['username'])
            else:
                error = 'Invalid username/password'
    return render_template('login.html', error=error)    

@app.route('/logout', methods=['GET'])
def logout():
    isLogged = False
    return redirect(url_for('login'))   

def addConnection(name):
    first_column = DBTableColumn()
    first_column.id = '1'
    first_column.column_name = 'col_1'
    first_column.value = 'val_1'
    second_column = DBTableColumn()
    second_column.id = '2'
    second_column.column_name = 'col_2'
    second_column.value = 'val_2'
    demoTable = DataBaseTable()
    demoTable.id = '1'
    demoTable.table_name = 'tb_demo'
    demoTable.columns = [first_column, second_column]
    
    
    newDataBase = DataBase()
    newDataBase.id = str(len(connections) + 1)
    newDataBase.name = name
    newDataBase.tables = [demoTable]
    connections.append(newDataBase)
    return newDataBase

def getConnectionById(id):
    return [d for d in connections if d.id==id].pop()



@app.route('/hello/')
@app.route('/hello/<name>')
def hello(name=None):
    return render_template('hello.html', name=name)

@app.route('/db/<id>')
def databases(id=None):
    return render_template('db.html', database=getConnectionById(id))

@app.route('/db/<db_id>/table/<table_id>')
def database_tables(db_id=None, table_id=None):
    database = getConnectionById(db_id)
    table = [d for d in database.tables if d.id==table_id].pop()
    return render_template('db_table.html', table=table)

class DataBase():
    def __init__(self):
        self.id = None
        self.name = None
        self.tables = []
        
class DataBaseTable():
    def __init__(self):
        self.id = None
        self.table_name = None
        self.columns = []

class DBTableColumn():
    def __init__(self):
        self.id = None
        self.column_name = None
        self.type = None