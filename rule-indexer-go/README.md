# Rule Indexer

Create an indexing process for a search system your team is building. It should read files (provided to it as arguments) and output according to the following business rules:
1. Output the number of words that start with an uppercase letter in each file.
2. List all the words that are longer than 5 characters in each file.

## Prerequisites

Before you begin, ensure you meet the following requirements:
- Go 1.18 or newer installed

You can download and install the latest version of Go from the official Go website. Here’s the link to get you started:

[Download Go](https://golang.org/dl/)

## Setup

1. Navigate to your project directory.
2. Initialize a new Go module using:

    ```bash
    go mod init your_project_name
    ```

## Run

To run the application and the unit tests, you should execute the following command on terminal folder src/main:

1. Run application:
    ```bash
    go run ./src/main/main.go
    ```

2. Run unit tests:
    ```bash
    go test -v -count=1 ./src/tests  
    ```

## Build and Run Docker container

1. To build Docker image, run the following command on terminal folder src:

    ```bash
    docker build -t rule-indexer-go .
    ```

2. To run your Docker container using the newly created image:

    ```bash
    docker run rule-indexer-go
    ```


