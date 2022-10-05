from flask import Flask

app = Flask(__name__)

@app.route("/")
def intro():
    return "This is Brianne's homepage."

@app.route("/hello/<world>")
def hello(world):
    return "Hello" + world + "welcome to my website"

app.run(host='0.0.0.0')

