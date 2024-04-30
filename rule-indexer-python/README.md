# Rule Indexer

Create an indexing process for a search system your team is building. It should read files (provided to it as arguments) and output according to the following business rules:
1. Output the number of words that start with an uppercase letter in each file.
2. List all the words that are longer than 5 characters in each file.

## Prerequisites

Before you begin, ensure you meet the following requirements:
- Python 3.x installed (recommend Python 3.8 or newer)

You can download and install the latest version of Python 3 from the official Python website. Here’s the link to get you started:

[Download Python](https://www.python.org/downloads/)

After installing Python 3, you'll need to set up a new environment. If you were using pipenv with Python 2.7, you would follow these steps to set up a new project with Python 3:

1. Navigate to your project directory.
2. Initialize a new pipenv environment with Python 3 using:

    ```bash
    pipenv --python 3.x
    ```
    Replace "3.x" with the version of Python 3 you installed.

3. Install your dependencies again using:

    ```bash
    pipenv install
    ```

## Run

To run the application and the unit tests, follow these instructions:

1. Run application:
    ```bash
    python main.py
    ```

2. Run unit test:
    ```bash
    python -m unittest discover -s tests -v
    ```

## Build and Run Docker container

1. To build Docker image, run the following command:

    ```bash
    docker build -t rule-indexer-python .
    ```

2. To run your Docker container using the newly created image:

    ```bash
    docker run rule-indexer-python
    ```