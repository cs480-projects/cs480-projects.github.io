from flask import Flask
app = Flask('app')

@app.route('/')
def welcome():
  return 'Welcome To Our Team Page'

@app.route('/hello')
def hello_world():
	return 'Hello World!'

@app.route('/aboutus')
def about():
  return 'SunBreakers About Us Page!'



app.run(host='0.0.0.0')