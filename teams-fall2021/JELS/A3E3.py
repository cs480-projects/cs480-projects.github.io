from flask import Flask


app=Flask(__name__)


@app.route("/help")
def help():
    return "Help! I've fallen and I can't get up"

app.run(host="0.0.0.0")