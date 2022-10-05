from flask import Flask


app =   Flask(__name__)
  
@app.route("/")
def message():
    return "Hello World!, I am Phuong Thai."
    
if __name__=='__main__':
    app.run(debug=True) 
