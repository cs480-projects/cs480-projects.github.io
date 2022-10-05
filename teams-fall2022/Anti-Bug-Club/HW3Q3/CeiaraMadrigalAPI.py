from flask import Flask
import random

app =   Flask(__name__)
  
@app.route("/")
def webpage():
    return "Hello World!, I am Ceiara Madrigal."

@app.route("/lucky")
def get_lucky_number():
    num = random.randint(1,100)
    return "Your lucky number is: " + str(num)

app.run(host="0.0.0.0")