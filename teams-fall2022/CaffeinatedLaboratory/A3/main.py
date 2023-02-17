from flask import Flask,request
import json, time
import datetime
app = Flask(__name__)


@app.route('/', methods=['GET'])
def home_page():
	data_set = {'Page': 'Home',
             f'Message': 'Hello Anonymous!', 'Timestamp': time.time()}
	return json.dumps(data_set)

@app.route('/name/', methods=['GET'])
def name_page():
	name_query = str(request.args.get('name'))  # /name/?name=SOMENAME
	data_set = {'Page': 'Welcome',
             f'Message': f'Hello {name_query}!', 'Timestamp': time.time()}
	return json.dumps(data_set)
@app.route('/timezone', methods=['GET'])
def timezone():
	now = datetime.datetime.now()
	local = now.astimezone()
	timezone = local.tzinfo
	data_set = {'Server Time Zone':timezone}
	return json.dumps(data_set)

if __name__ == '__main__':
	app.run(port=8080)
 
print("Hello World")
#ngrok http 127.0.0.1:8080 --host-header="127.0.0.1:8080"
