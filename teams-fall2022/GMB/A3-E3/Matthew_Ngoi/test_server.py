import pytest
import requests

response = requests.get("http://127.0.0.1:5000/mongo")

print(response.json()[0])

def test_mongo():
    response = requests.get("http://127.0.0.1:5000/mongo")
    assert response.status_code == 200
    assert response.json()[0] == "table_tennis"