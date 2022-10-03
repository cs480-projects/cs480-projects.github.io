from flask import Flask
app = Flask('app')

@app.route('/')
def welcome():
  return 'Welcome'

@app.route('/hi')
def hello_world():
	return 'Hello World!'

@app.route('/about')
def about():
  return 'This is a new page'

@app.route('/guest/<guest>')
def hello_guest(guest):
   return 'Hello ' + guest


app.run(host='0.0.0.0')
