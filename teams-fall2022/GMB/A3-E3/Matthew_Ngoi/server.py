from flask import Flask

app = Flask(__name__)

@app.route("/")
def home():
    return "Welcome to Matthew's Homepage"

@app.route("/hello/")
def hello():
    return "Hello World!"

@app.route("/hello/<name>")
def greeting(name):
    return "Hello " + name

app.run(host='0.0.0.0')