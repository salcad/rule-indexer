FROM python:3.11-slim

WORKDIR /usr/src/app

RUN apt-get update && apt-get install -y --no-install-recommends gcc libc-dev libffi-dev && rm -rf /var/lib/apt/lists/*

RUN pip install --upgrade pip setuptools wheel && pip install pipenv

COPY Pipfile* ./

RUN pipenv install --deploy --ignore-pipfile

COPY . .

CMD ["pipenv", "run", "python", "main.py"]
