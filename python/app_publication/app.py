from re import I
from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

isLogged = False

PUBLICATIONS = []
@app.route("/")
def main():
    global isLogged
    if isLogged:
        return render_template('index.html', publications=PUBLICATIONS) 
    return redirect(url_for('login'))

def valid_login(username, password):
    isValid = username is not None and username != "" and password is not None and password != ""
    if isValid:
        log_the_user_in()
        return isValid
    return False

def log_the_user_in():
    global isLogged
    isLogged = True

@app.route('/login', methods=['POST', 'GET'])
def login():
    error = None
    global isLogged
    
    if isLogged is True:
        return redirect(url_for('main'))
    else:
        if request.method == 'POST':
            if valid_login(request.form['username'], request.form['password']):
                return redirect(url_for('main'))
            else:
                error = 'Invalid username/password'
    return render_template('login.html', error=error)    



@app.route('/logout', methods=['GET'])
def logout():
    global isLogged
    isLogged = False
    return redirect(url_for('login'))   

def addPublication(publication):
    global PUBLICATIONS
    PUBLICATIONS.append(publication)

def addCommentToPublication(publication, commentary):
    global PUBLICATIONS
    for pub in PUBLICATIONS:
        if pub.id is publication.id:
            pub.comments.append(commentary)


def getPublicationById(id):
    instances = [d for d in PUBLICATIONS if str(d.id)==str(id)]
    if len(instances) > 0:
        return instances.pop()
    return None



@app.route('/form-publication', methods=['POST', 'GET'])
def form_publication(error=None):
    error = None
    global isLogged
    
    if isLogged is True:
        if request.method == 'POST':
            if request.form['title'] != "":
                publication = Publication()
                publication.id = len(PUBLICATIONS) + 1
                publication.title = request.form['title']
                publication.content = request.form['content']

                comment = Comment()
                comment.id = 1
                comment.text = "default comment"

                publication.comments.append(comment)
                addPublication(publication)
                return redirect(url_for('main'))
            else:
                error = 'Title is required'
        
    else:
        return redirect('/login')
        
    return render_template('form_publication.html', error=error)    


@app.route('/publication/<publication_id>',)
def publication(publication_id=None):
    resp = None

    global isLogged
    
    if isLogged is True:
        resp = getPublicationById(publication_id)
        
    else:
        return redirect('/login')
    return render_template('publication.html', resp=resp) 


class Publication():
    def __init__(self):
        self.id = None
        self.title = None
        self.content = None
        self.comments = []
class Comment():
    def __init__(self):
        self.id = None
        self.text = None
