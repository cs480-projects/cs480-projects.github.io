from flask import Flask
app = Flask('app')

@app.route('/')
def welcome():
  return 'Welcome GrocEasy! :D'

@app.route('/cool')
def hello_world():
	return 'Very cool!'

@app.route('/cart')
def about():
  return 'Bunch of items you added lol'



app.run(host='0.0.0.0')