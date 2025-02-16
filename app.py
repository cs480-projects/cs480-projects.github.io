from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/api/hello', methods=['GET'])
def hellow_world():
    return jsonify({"message": "Hellow from NutriByte API!"})

if __name__ == '__main__':
    app.run(debug=True)
