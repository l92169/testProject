# Task task Readme

## Project Purpose:

The primary objective of this project is to provide a service for getting frequency of symbols in string

This is a brief guide on how to set up and run the project. Please follow the instructions below to get started.



## Testing

To run tests for your project, you can use the following command:

```bash
mvn test
```

This will execute the project's test suite and display the results.

## Deployment

### Using Docker and Docker Compose

If you have Docker and Docker Compose installed on your system, you can easily deploy the project. Run the following command from the root of the project:

```bash
mvn clean package
docker-compose up
```

## Local Deployment

If you want to deploy the project locally

```bash
mvn clean package
java -jar target/*.jar 
```

### Swagger 
`http://localhost:8081/swagger-ui/index.html#/Frequency%20of%20symbols/getFrequencyCharacter`

### Example curl
```bash
curl --header "Content-Type: application/json" --request POST --data '{"line": "aaaaBBcb"}' http://localhost:8081/line
```