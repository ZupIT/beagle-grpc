# Open source library to use Beagle with gRPC

## How to build and publish this library locally

### Requirements 

- JDK 8+

#### Step 1

- build: To build application, open your terminal and run ```./gradlew build```

#### Step 2

- publish locally: To publish this lib locally, just run ```./gradlew publishToMavenLocal```

---

Done! Now, you can import the library in your project:

Gradle example:

```
dependencies { 
    ...
    implementation("br.com.zup.beagle:beagle-grpc-backend:1.0.0")
}
```

Maven example:

```
    <dependencies>
        ...
        <dependency>
            <groupId>br.com.zup.beagle</groupId>
            <artifactId>beagle-grpc-backend</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
```