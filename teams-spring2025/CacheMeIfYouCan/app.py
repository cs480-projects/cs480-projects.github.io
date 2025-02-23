from flask import Flask
app = Flask(__name__)
@app.route('/')
def home():
    return "Hello, World!"
@app.route('/api/message')
def api_message():
    return {"team members": "My Lien Tan, Brandon Vo, Gian David Marquez, Cheyenne Chavis"}
if __name__ == "__main__":
    app.run(debug=True)
