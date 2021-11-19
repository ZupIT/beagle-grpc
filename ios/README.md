
# **Beagle iOS gRPC**

## **Table of Contents**

### 1. [**About**](#about)
### 2. [**Usage**](#usage)
> #### 2.1. [**Requirements**](#requirements)
> #### 2.2. [**Generate the proto code**](#generate-the-proto-code)
### 3. [**Documentation**](#documentation)
### 4. [**Contributing**](#contributing)
### 5. [**Code of Conduct**](#code-of-conduct)
### 6. [**License**](#license)
### 7. [**Community**](#community)

## **About**
This framework provides a client to communicate with Beagle using gRPC.

## **Usage**

### **Requirements**

- Protocol Buffer Compiler `protoc`, binary releases are available on [GitHub][protobuf-releases].
- [gRPC-Swift][grpc-swift] plugins `protoc-gen-swift` and `protoc-gen-grpc-swift`, [see how to build them][grpc-plugins].

### **Generate the `proto` code**

Run the following commands to generate the code:

```bash
protoc {messages,screen}.proto \
  --proto_path=../backend/src/main/proto \
  --swift_out=Sources \
  --swift_opt=Visibility=Public \
  --grpc-swift_out=Sources \
  --grpc-swift_opt=Visibility=Public,Client=true,TestClient=true,Server=false
```

[**Check the documentation**][plugin-options] to see all available options.

[protobuf-releases]: https://github.com/protocolbuffers/protobuf/releases
[grpc-swift]: https://github.com/grpc/grpc-swift
[grpc-plugins]: https://github.com/grpc/grpc-swift#getting-the-protoc-plugins
[plugin-options]: https://github.com/grpc/grpc-swift/blob/main/docs/plugin.md#plugin-options

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