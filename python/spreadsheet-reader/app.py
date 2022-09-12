from flask import Flask, render_template, request
import  pandas as pd
app = Flask(__name__)

@app.route('/', methods=['GET', 'POST'])
def index():
    data = []
    if request.method == "POST":
        try:
            file = request.files['fileselected']
            if file.mimetype == "text/csv":
                data = pd.read_csv(file)
            else:
                data = pd.read_excel(file)
        except Exception as e:
            print("FILE ERROR::::: ")
            print(e)
        print(data.columns.ravel()) # will bee depreated
        print(list(data.keys()))
        ## print(data.sheet_names)
        
    return render_template('index.html', data=data)