from flask import Flask


app =   Flask(__name__)
  
  
@app.route("/")
def webpage():
    return "Hi, my name is Saul Barajas and this is my webpage."

@app.route("/<name>/")
def yourWebpage(name):
    return f"Hi, my name is {name} and this is my webpage."

  
  
  
if __name__=='__main__':
    app.run(debug=True) #http://127.0.0.1:5000/