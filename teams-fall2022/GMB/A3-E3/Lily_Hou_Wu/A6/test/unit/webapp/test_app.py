import unittest
import app


class FlaskTestCase(unittest.TestCase):

    def setUp(self):
        app.app.testing = True
        self.app = app.app.test_client()

    def test_landing(client):
        landing = client.get("/")
        html = landing.data.decode()

        # Check that links to `home` and `login` pages exist
        assert "<a href=\"/\">Home</a>" in html
        assert " <a href=\"/login/\">Login</a>" in html
        assert landing.status_code == 200


    def test_landing_aliases(client):
        landing = client.get("/")
        assert client.get("/index/").data == landing.data


if __name__ == '__main__':
    unittest.main()
