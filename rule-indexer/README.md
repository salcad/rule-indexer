# Rule Indexer

Create an indexing process for a search system your team is building. It
should read files (provided to it as arguments) and output according to the following
business rules:
1. Output the number of words that start with upper case letter in each file
2. List all the words that are longer than 5 characters long in each file

## Prerequisites

Before you begin, ensure you meet the following requirements:
- Java JDK 21.0.2 or above
- Maven 3.8.6 or above

## Build & run

1. Build project:
   ```bash
    ./mvnw clean install -DskipTests

2. Run application:
    ```bash
     java -jar target/rule-indexer-0.0.1-SNAPSHOT.jar samples/file1.txt samples/file2.html
   
3. Or run unit test:
    ```bash
    ./mvnw test

## Buil and Run Docker container

1. To build Docker image, run the following command:

    ```bash
    docker build -t java-rule-indexer .

2. To run your Docker container using the newly created image:

    ```bash
    docker run java-rule-indexer

    