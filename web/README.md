# **Beagle WEB gRPC**

## **Table of Contents**

### 1. [**About**](#about)
### 2. [**Usage**](#usage)
> #### 2.1. [**gRPC for Beagle Web**](#gRPC-for-beagle-web)
> #### 2.2. [**Requirements**](#requirements)
> #### 2.3. [**Installation**](#installation)
### 3. [**Configuration**](#configuration)
### 4. [**CLI**](#cli)
### 5. [**Documentation**](#documentation)
### 6. [**Contributing**](#contributing)
### 7. [**Code of Conduct**](#code-of-conduct)
### 8. [**License**](#license)
### 9. [**Community**](#community)

## **About**
It is an open source framework to perform RPC (Remote Call Procedure) calls, through the HTTP2 protocol in a two-way streaming format. It uses Protobufs as interfaces between client and server.

Protobufs or Protocol Buffers are a structured data serialization mechanism created by Google. It aims to keep contracts always valid and consistent, regarding the implementations that consume a gRPC service.

Proto files in their content are very similar to any interface we are used to on the daily basis, but with the .proto extension. We define which objects and methods are likely to be used in the service's communication.

[**For more information, acess the website**](https://grpc.io/).

## **Usage**
### **gRPC for Beagle Web**

gRPC is a technology that makes use of the **HTTP 2** protocol, however, this technology is not compatible with the current Web structure, so the structure created uses a Client and a CLI, where the CLI is responsible for handling gRPC connections through a Proxy, written with Go, and the Client is responsible for handling all requests made by Beagle to the Proxy.

### **Requirements**

- [**Git CLI**](https://git-scm.com/): Used internally as a proxy dependency. 
- [**Go CLI**](https://golang.org/): Language which the proxy is written. 
- [**Dep CLI**](https://github.com/golang/dep): Go's dependency manager, where it checks that everything is installed and working as expected. 
- [**Protoc CLI**](https://github.com/protocolbuffers/protobuf): Used by protobufs and necessary for code generation through a **`.proto`** file. 

### **Installation**
To install the library:
1. Install it globally for a better experience with the CLI;
2. Install it in your project using the following commands: 

```bash
npm install -g beagle-web-grpc
npm install --save-dev beagle-web-grpc
```

or if you use yarn:
```bash
yarn global add beagle-web-grpc
yarn add --dev beagle-web-grpc
```

## **Configuration**

1. After installing the library in the project and globally, create the configuration file in the project's root folder, using: `beagle-web-grpc init` and then configure the attributes according to your needs. 
2. Then import the gRPC Client:
   - **React:** ./src/beagle/beagle-service.ts
     ```typescript
     import { createBeagleUIService } from '@zup-it/beagle-react'
     import { usingBeagleGrpcClient } from 'beagle-web-grpc'

     export default createBeagleUIService({
       baseUrl: 'grpc://',
       components: {},
       fetchData: usingBeagleGrpcClient({ proxyAddress: 'http://localhost:8081' })
     })
     ```
   - **Angular:** ./src/app/beagle.module.ts
     ```typescript
     import { BeagleModule } from '@zup-it/beagle-angular'
     import { usingBeagleGrpcClient } from 'beagle-web-grpc'

     @BeagleModule({
       baseUrl: 'grpc://',
       module: {
         path: './beagle-components.module',
         name: 'BeagleComponentsModule',
       },
       components: {},
       fetchData: usingBeagleGrpcClient({ proxyAddress: 'http://localhost:8081' })
     })
     export class Beagle {}
     ```
3. Start your proxy running the following command on the root of the project: `beagle-web-grpc start-proxy` or `beagle-web-grpc spx` or `beagle-web-grpc start-proxy --mode your-mode`.
4. Use the Beagle Web as usually.

> **Note:**
> Make sure that your BFF Application is running.

## **CLI**

As gRPC is not compatible with the current structure of the Web, to support the technology, it is necessary to use a proxy to establish the communication between the REST application and the gRPC backend application, so we created a CLI (command-line interface), **beagle-web-grpc**, to facilitate the use of the proxy and provide all the necessary settings.

#### **Available commands for **beagle-web-grpc**

| Command       | Alias      | Options     | Description                                                                                       |
| ------------- | ---------- | ----------- | ------------------------------------------------------------------------------------------------- |
| `init`        | `i`        |             | Creates the configuration file which defines the settings to be used by the Beagle Web gRPC Proxy. |
| `start-proxy` | `spx`      | *-m, --mode <mode>*, set the mode to be used on the configuration file, the default mode is **development**     | Start the gRPC Proxy service, on the port defined in the configuration file, to handle requests between your gRPC server and your application using Beagle Web Frontend (IMPORTANT: You must have all requirements installed) . |

#### **Configuration file *./beagle-grpc.config.json***

After running `beagle-web-grpc init` the file *./beagle-grpc.config.json* will be created where the command was executed, generating a file with this content:

```json
{
  "configs": [
    {
      "mode": "development",
      "grpcBackendAddress": "localhost:50051",
      "tlsCertificatePath": "",
      "tlsKeyPath": "",
      "runProxyOnPort": 8081
    },
    {
      "mode": "production",
      "grpcBackendAddress": "https://my-grpc.backend.com/address",
      "tlsCertificatePath": "",
      "tlsKeyPath": "",
      "runProxyOnPort": 8081
    }
  ]
}
```

### **Attributes of the configuration file *./beagle-grpc.config.json***

| Attribute               | Description                                                                   | 
| ----------------------- | ----------------------------------------------------------------------------- |
| `mode`                  | Defines the mode name for the settings to be used when running the gRPC Proxy |
| `grpcBackendAddress`    | Defines the address of the backend server that communicates using gRPC. Keep it mind that all requests that match this route will be redirected to the proxy |
| `tlsCertificatePath`    | Sets the path to the TLS Certificate location                                          |
| `tlsKeyPath`            | Sets the path to the TLS Key location                                                  |
| `runProxyOnPort`        | Defines the Port on which the gRPC Proxy will run                             |

### **Client**


The gRPC Client for Beagle Web redirects gRPC requests to the proxy. The client is used through `BeagleService` in React and the `Beagle` module in Angular, using the `fetchData` property. Beagle allows you to create custom HTTP requests, so the use goes like this: 

```typescript
import { usingBeagleGrpcClient } from 'beagle-web-grpc'

// { ... } - your module or service code
{
  // { ... } - other attributes
  fetchData: usingBeagleGrpcClient({ proxyAddress: 'http://localhost:8081' })
}
```

The gRPC client has the following initialization options (`BeagleGrpcClientOptions`):

| Attribute             | Required?       | Default Value   | Description                                                                           |
| --------------------- | --------------- | --------------- | ------------------------------------------------------------------------------------- |
| `proxyAddress`        | Yes             |                 | Address where the proxy will be running for the client to communicate with the proxy  |
| `redirectGrpcFrom`    | No              | `grpc://`       | If this attribute is informed, all requests that the url starts with the informed value will be redirected to the gRPC Proxy, otherwise they will be forwarded normally |
| `customHttpClient`    | No              | `undefined`     | If this attribute is informed, it will still work as a function to perform custom HTTP requests, however, only if the condition of being a gRPC request is not met  |

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