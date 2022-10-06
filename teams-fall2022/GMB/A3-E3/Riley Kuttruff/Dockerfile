FROM python:3.8.10

COPY requirements.txt requirements.txt
COPY test.py test.py

RUN pip install -r requirements.txt

CMD ["python", "test.py"]