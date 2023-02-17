from flask import Flask, request
import uuid
import json
import re
import requests
from bs4 import BeautifulSoup as BS

app = Flask(__name__)

queue = []

@app.route("/enqueue")
def enqueue():
	name = request.args.get('name')
	iid = str(uuid.uuid4())
	item = {'name': name, 'id': iid}

	global queue

	queue.append(item)

	return json.dumps(
		{
			"response": 200,
			"id": iid
		}
	)

@app.route('/next')
def next():
	global queue

	if len(queue) == 0:
		return json.dumps({"response": 202, "message": "Queue is empty"}), 202

	item = queue.pop(0)

	
	return json.dumps(
		{
			"response": 200,
			"name": item['name'],
			"id": item['id']
		}
	)
	
	
@app.route('/scrape')
def scrape():
	url = request.args.get('url')
	uniq = request.args.get('uniq') is not None
	sort = request.args.get('sort') is not None
	
	ret = {"code": None}
	
	try:
		response = requests.get(url)
		
		if response.status_code != 200:
			server_error = response.status_code >= 500
			
			ret['code'] = response.status_code
			ret["message"] = "Could not retrieve the webpage"
			
			return json.dumps(ret), 500 if server_error else 400
			
		html = response.text
		
	except Exception as e:
		ret['code'] = 400
		ret["message"] = str(e)
		
		return json.dumps(ret), 400
		
	soup = BS(html, 'html.parser')
	
	links = [e.get('href') for e in soup.find_all(["a", "img"], attrs={'href': re.compile("^(https?://)|/[^/]")})]
	
	for i, link in enumerate(links):
		if link[0] == '/':
			if url[-1] == '/':
				links[i] = url + link[1:]
			else:
				links[i] = url + link
				
	if uniq:
		links = list(set(links))
		
	if sort:
		links.sort()
				
	ret['code'] = 200
	ret['count'] = len(links)
	ret['links'] = links
	
	return json.dumps(ret), 200


app.run(host="0.0.0.0")
