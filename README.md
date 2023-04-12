# Spring Boot Kafka Producer and Consumer Example
Spring Boot Kafka Producer and Consumer Example tutorial from scratch.
https://www.netsurfingzone.com/kafka/spring-boot-kafka-producer-and-consumer-example-step-by-step-guide/

This tutorial covers below points.

1. How to install apache kafka.
2. How to start zookeeper and kafka.
3. How to create topic.
4. How to configure spring and apache kafka.
5. How to create kafka producer to send string and json type messages.
6. How to create kafka consumer to receive string and json message.

Sample request
POST: localhost:8000/produce/message/
```json
{
    "id": 54235345,
	"name": "Charles",
	"rollNumber": "42423"
}
```
Note that when you build a multi-module maven project, follow these steps:
1. `"Unable to find main class" with Maven on spring-boot project ` indicates that your spring boot app MUST HAVE an entry point to start. To override this behavior, check the SO answer [here](https://stackoverflow.com/a/56535517)
2. `Failed to read artifact descriptor for`. This error may occur due to variety of reasons, such as incorrect version or artifact names, missing dependencies, or incorrect repository setting.
TL;DR: <small>To resolve this issue, you can try checking and updating the artifact and version names as necessary. You may also need to check your dependency tree to ensure that all required dependencies are correctly specified.</small>
If these configurtion are matches, but if still doesn't fix the problem, try refreshing the project. Build the required project first, then the parent project, finally the dependant projects.

