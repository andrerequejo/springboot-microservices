In order to test the Jetty project the dependency *spring-boot-starter-web* should be provided.
But if you want test the project itselft it should be commented.

```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <scope>provided</scope>
    </dependency>
```