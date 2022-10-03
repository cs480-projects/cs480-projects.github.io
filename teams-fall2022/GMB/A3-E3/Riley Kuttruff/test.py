from flask import Flask, request
import uuid
import json

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
