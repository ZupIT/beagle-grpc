# **Open source library to use Beagle with gRPC**

## **Table of Contents**

### 1.[**How to build and publish the library**](#how-to-build-and-publish-the-library)
> #### 1.1. [**Requirements**](#requirements)
> #### 1.2. [**Steps to build and publish**](#steps-to-build-and-publish)
### 3. [**Documentation**](#documentation)
### 4. [**Contributing**](#contributing)
### 5. [**Code of Conduct**](#code-of-conduct)
### 6. [**License**](#license)
### 7. [**Community**](#community)

## **How to build and publish this library locally?**

### **Requirements** 

- JDK 8+

### **Steps to build and publish**

Follow the steps below: 
### **Step 1.** Build

To build the application, open your terminal and run **```./gradlew build```**

### **Step 2.** Publish locally

To publish this lib locally, run **```./gradlew publishToMavenLocal```**

### **Step 3.** Import the library in your project:

**Gradle example:**

```
dependencies { 
    ...
    implementation("br.com.zup.beagle:beagle-grpc-backend:1.0.0")
}
```

**Maven example:**

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

## **Documentation**

You can find Beagle's documentation on our [**website**][site].

Beagle's documentation discusses components, APIs, and topics that are specific to [**Beagle documentation**][b-docs].

[site]: https://usebeagle.io/
[b-docs]: https://docs.usebeagle.io/


## **Contributing**

If you want to contribute to this module, access our [**Contributing Guide**][contribute] to learn about our development process, how to propose bug fixes and improvements, and how to build and test your changes to Beagle.

[contribute]: https://github.com/ZupIT/beagle/blob/main/CONTRIBUTING.md

### **Developer Certificate of Origin - DCO**

 This is a security layer for the project and for the developers. It is mandatory.
 
 Follow one of these two methods to add DCO to your commits:
 
**1. Command line**
 Follow the steps: 
 **Step 1:** Configure your local git environment adding the same name and e-mail configured at your GitHub account. It helps to sign commits manually during reviews and suggestions.

 ```
git config --global user.name “Name”
git config --global user.email “email@domain.com.br”
```

**Step 2:** Add the Signed-off-by line with the `'-s'` flag in the git commit command:

```
$ git commit -s -m "This is my commit message"
```

**2. GitHub website**
You can also manually sign your commits during GitHub reviews and suggestions, follow the steps below: 

**Step 1:** When the commit changes box opens, manually type or paste your signature in the comment box, see the example:

```
Signed-off-by: Name < e-mail address >
```

For this method, your name and e-mail must be the same registered on your GitHub account.

## **Code of Conduct**

Please read the [**code of conduct**](https://github.com/ZupIT/beagle/blob/main/CODE_OF_CONDUCT.md).

## **License**

[**Apache License 2.0**](https://github.com/ZupIT/beagle-grpc/blob/master/LICENSE).

## **Community**
Do you have any question about Beagle? Let's chat in our [**forum**](https://forum.zup.com.br/).