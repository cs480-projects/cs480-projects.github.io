from flask import Flask
import random

app =   Flask(__name__)
  
@app.route("/")
def webpage():
    return "Hello World!, I am Phuong Thai."
    
if __name__=='__main__':
    app.run(debug=True) 