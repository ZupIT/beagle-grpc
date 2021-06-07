package beagle;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: screen.proto")
public final class ScreenServiceGrpc {

  private ScreenServiceGrpc() {}

  public static final String SERVICE_NAME = "beagle.ScreenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<beagle.Messages.ScreenRequest,
      beagle.Messages.ViewNode> getGetScreenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getScreen",
      requestType = beagle.Messages.ScreenRequest.class,
      responseType = beagle.Messages.ViewNode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<beagle.Messages.ScreenRequest,
      beagle.Messages.ViewNode> getGetScreenMethod() {
    io.grpc.MethodDescriptor<beagle.Messages.ScreenRequest, beagle.Messages.ViewNode> getGetScreenMethod;
    if ((getGetScreenMethod = ScreenServiceGrpc.getGetScreenMethod) == null) {
      synchronized (ScreenServiceGrpc.class) {
        if ((getGetScreenMethod = ScreenServiceGrpc.getGetScreenMethod) == null) {
          ScreenServiceGrpc.getGetScreenMethod = getGetScreenMethod =
              io.grpc.MethodDescriptor.<beagle.Messages.ScreenRequest, beagle.Messages.ViewNode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getScreen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  beagle.Messages.ScreenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  beagle.Messages.ViewNode.getDefaultInstance()))
              .setSchemaDescriptor(new ScreenServiceMethodDescriptorSupplier("getScreen"))
              .build();
        }
      }
    }
    return getGetScreenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScreenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScreenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScreenServiceStub>() {
        @java.lang.Override
        public ScreenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScreenServiceStub(channel, callOptions);
        }
      };
    return ScreenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScreenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScreenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScreenServiceBlockingStub>() {
        @java.lang.Override
        public ScreenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScreenServiceBlockingStub(channel, callOptions);
        }
      };
    return ScreenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScreenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScreenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScreenServiceFutureStub>() {
        @java.lang.Override
        public ScreenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScreenServiceFutureStub(channel, callOptions);
        }
      };
    return ScreenServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ScreenServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getScreen(beagle.Messages.ScreenRequest request,
        io.grpc.stub.StreamObserver<beagle.Messages.ViewNode> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScreenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetScreenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                beagle.Messages.ScreenRequest,
                beagle.Messages.ViewNode>(
                  this, METHODID_GET_SCREEN)))
          .build();
    }
  }

  /**
   */
  public static final class ScreenServiceStub extends io.grpc.stub.AbstractAsyncStub<ScreenServiceStub> {
    private ScreenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScreenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScreenServiceStub(channel, callOptions);
    }

    /**
     */
    public void getScreen(beagle.Messages.ScreenRequest request,
        io.grpc.stub.StreamObserver<beagle.Messages.ViewNode> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScreenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScreenServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScreenServiceBlockingStub> {
    private ScreenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScreenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScreenServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public beagle.Messages.ViewNode getScreen(beagle.Messages.ScreenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScreenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScreenServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ScreenServiceFutureStub> {
    private ScreenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScreenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScreenServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<beagle.Messages.ViewNode> getScreen(
        beagle.Messages.ScreenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScreenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SCREEN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScreenServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScreenServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SCREEN:
          serviceImpl.getScreen((beagle.Messages.ScreenRequest) request,
              (io.grpc.stub.StreamObserver<beagle.Messages.ViewNode>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ScreenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScreenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return beagle.Screen.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScreenService");
    }
  }

  private static final class ScreenServiceFileDescriptorSupplier
      extends ScreenServiceBaseDescriptorSupplier {
    ScreenServiceFileDescriptorSupplier() {}
  }

  private static final class ScreenServiceMethodDescriptorSupplier
      extends ScreenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScreenServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ScreenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScreenServiceFileDescriptorSupplier())
              .addMethod(getGetScreenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
