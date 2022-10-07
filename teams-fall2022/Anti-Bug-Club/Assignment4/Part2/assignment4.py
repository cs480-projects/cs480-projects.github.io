from flask import Flask, redirect
import requests
from bs4 import BeautifulSoup


app = Flask(__name__)

@app.route('/')
def get_title():
    # Get the html page with provided url and use Beautiful Soup to prase data 
    url = "https://giphy.com/explore/pug"
    headers = {'user-agent': 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36'}
    r = requests.get(url, headers=headers)
    data = r.text
        
    #Get the title from the url page
    soup = BeautifulSoup(data, 'html.parser')
    title = soup.find('title')
    return "Title of pug gifs website: " + title.get_text()

@app.route('/gifs')
def get_pug_gifs():
    # Get the html page with provided url and use Beautiful Soup to prase data 
    url = "https://giphy.com/explore/pug"
    headers = {'user-agent': 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36'}
    r = requests.get(url, headers=headers)
    data = r.text
    
    #Get pug gifs from html page
    soup = BeautifulSoup(data, 'html.parser')
    gif_tag = soup.find('link', attrs={'rel': 'amphtml'})
    print(gif_tag)

    #Get link from html tag
    gif_link = gif_tag['href']
    return redirect(str(gif_link))

app.run(host="0.0.0.0")

