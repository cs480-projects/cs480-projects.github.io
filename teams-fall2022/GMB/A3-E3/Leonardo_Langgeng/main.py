from flask import Flask, render_template
import os
from PIL import Image
from decision_tree import decision_tree
from datetime import datetime

app = Flask('app')


print('main')
time = datetime.now()
print(time)

@app.route('/')
def index():
  #return str(time) + 'This is main page for Leonardo Langgeng<br>'
  return render_template('index.html')

@app.route('/ml')
def ml():
  decision_tree()
  
  IMG_FOLDER = os.path.join('static' )
  app.config['UPLOAD_FOLDER'] = IMG_FOLDER
  Plot = os.path.join(app.config['UPLOAD_FOLDER'], 'plot.png')
  
  return render_template("index.html", user_image = Plot)



@app.route('/<user>')
def say_hi(user):
  print(user)
  return str(time) + 'Hi ' + user + ' welcome to the website'



app.run(host='0.0.0.0', port=8080)
