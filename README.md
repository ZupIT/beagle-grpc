# Beagle gRPC

## What is gRPC?

It is an open source framework to perform RPC (Remote Call Procedure) calls, through the HTTP2 protocol in a two-way streaming format, using Protobufs as interfaces between client and server.

Protobufs, or Protocol Buffers, are a structured data serialization mechanism created by Google, which aims to keep contracts always valid and consistent, regarding the implementations that consumes a gRPC service.

Proto files, in their content, are very similar to any interface we are used to on the daily basis, but with the .proto extension, where we define which objects and methods are likely to be used in the service's communication.

[Learn more...](https://grpc.io/)

## What will you find here?

Here you will find the libraries that allows you to integrate the gRPC to your Beagle project, like:

- **Library for Backend**, where it will make all the hard work, non-intrusively, to establish a gRPC connection between your Backend and Frontend.
- **Library for Android**, a non-intrusive library where will handle the gRPC connection, allowing to use Beagle normally.
- **Library for iOS**, a non-intrusive library where will handle the gRPC connection, allowing to use Beagle normally.
- **Library for Web**, one library that can be used inside Beagle Web Angular and Beagle Web React, even though gRPC is not possible to be implemented on the web scenario, this library allows you to use gRPC on web, making one BFF possible for all.
