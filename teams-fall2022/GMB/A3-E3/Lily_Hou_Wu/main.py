from flask import Flask, render_template
from datetime import datetime
import re
app = Flask(__name__)

@app.route('/')
def welcome():
    return 'Welcome to a new page!'

@app.route('/hi')
def hello_world():
    return 'Hello World!'

@app.route('/guest/<guest>')
def hello_guest(guest):
    return 'Hello ' + guest + 'welcome to this new page!'

@app.route('/index')
def index():
    return render_template('index.html')

app.run(host='0.0.0.0')
