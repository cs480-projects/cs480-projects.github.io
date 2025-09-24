from flask import Flask

app = Flask(__name__)

# New endpoint
@app.route('/hello', methods=['GET'])
def hello():
    return "Hello from Andrew's new endpoint!"

@app.route('/ianpoint', methods=['GET'])
def hello():
    return "Hello from Ian's new endpoint!"

# Optional: root for testing
@app.route('/', methods=['GET'])
def root():
    return "MAJI backend running!"

if __name__ == '__main__':
    app.run(debug=True)
