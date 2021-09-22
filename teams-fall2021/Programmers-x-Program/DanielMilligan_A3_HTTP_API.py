from flask import Flask 

app = Flask(__name__)

@app.route('/DanielMilligan')
def Daniel():
    return "<p>Welcome to Daniel Milligan's Page</p><img src='https://www.dictionary.com/e/wp-content/uploads/2019/04/Screen-Shot-2019-07-05-at-12.20.52-PM.png'/>"

@app.route('/')
def index():
    return 'Hello World!\nWeb App with Python Flask'

app.run(host = '127.0.0.1', port = 91)