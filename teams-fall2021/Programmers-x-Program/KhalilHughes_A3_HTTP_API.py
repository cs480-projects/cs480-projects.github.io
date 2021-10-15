from flask import Flask 

app = Flask(__name__)

@app.route('/Khalil')
def Khalil():
    return "khalil's HTTP API"

@app.route('/')
def index():
    return 'Hello World!\nWeb App with Python Flask'

app.run(host = '0.0.0.0', port = 91)
