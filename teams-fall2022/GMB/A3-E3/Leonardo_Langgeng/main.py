from flask import Flask
app = Flask('app')

@app.route('/')
def hello_world():
  return 'This is main page for Leonardo Langgeng<br>'

@app.route('/<user>')
def say_hi(user):
  return 'Hi' + user + 'welcome to the website'

app.run(host='0.0.0.0', port=8080)
