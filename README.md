# **Beagle gRPC**

## **Table of Contents**

### 1. [**About**](#about)
### 2. [**Usage**](#usage)
### 3. [**Documentation**](#documentation)
### 4. [**Contributing**](#contributing)
### 5. [**Code of Conduct**](#code-of-conduct)
### 6. [**License**](#license)
### 7. [**Community**](#community)

## **About**
gRPC is an open source framework to perform RPC (Remote Call Procedure) calls, through the HTTP2 protocol in a two-way streaming format, using Protobufs as interfaces between client and server.

Protobufs, or Protocol Buffers, are a structured data serialization mechanism created by Google, which aims to keep contracts always valid and consistent, regarding the implementations that consume a gRPC service.

Proto files, in their content, are very similar to any interface we are used to on the daily basis, but with the **.proto** extension, where we define which objects and methods are likely to be used in the service's communication.

[**For more information, check out the website**](https://grpc.io/).

## **Usage**
### What will you find here?

You will find libraries that allows you to integrate the gRPC to your Beagle project, see them below:

- **Library for Backend**: It will make all the hard work, non-intrusively, to establish a gRPC connection between your Backend and Frontend.
- **Library for Android**: A non-intrusive library where will handle the gRPC connection, allowing to use Beagle normally.
- **Library for iOS**: A non-intrusive library where will handle the gRPC connection, allowing to use Beagle normally.
- **Library for Web**: One library that can be used inside Beagle Web Angular and Beagle Web React, even though gRPC is not possible to be implemented on the web scenario, this library allows you to use gRPC on web, making one BFF possible for all.

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