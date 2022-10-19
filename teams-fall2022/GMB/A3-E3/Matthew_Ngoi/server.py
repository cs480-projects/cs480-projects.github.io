from flask import Flask
from pymongo import MongoClient

app = Flask(__name__)

client = MongoClient("mongodb+srv://mfngoi:UUkHZnMzVW6x9jIo@cluster0.ltgs7ps.mongodb.net/?retryWrites=true&w=majority")
db = client.queues

@app.route("/")
def home():
    return "Welcome to Matthew's Homepage"

@app.route("/hello/")
def hello():
    return "Hello World!"

@app.route("/hello/<name>")
def greeting(name):
    return "Hello " + name

@app.route("/mongo")
def mongo():
    return db.list_collection_names()

app.run(host='0.0.0.0')