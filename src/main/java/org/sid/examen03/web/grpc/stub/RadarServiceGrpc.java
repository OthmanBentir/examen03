package org.sid.examen03.web.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: radar.proto")
public final class RadarServiceGrpc {

  private RadarServiceGrpc() {}

  public static final String SERVICE_NAME = "RadarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest,
      org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse> getGetRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRadar",
      requestType = org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest.class,
      responseType = org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest,
      org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse> getGetRadarMethod() {
    io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest, org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse> getGetRadarMethod;
    if ((getGetRadarMethod = RadarServiceGrpc.getGetRadarMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getGetRadarMethod = RadarServiceGrpc.getGetRadarMethod) == null) {
          RadarServiceGrpc.getGetRadarMethod = getGetRadarMethod = 
              io.grpc.MethodDescriptor.<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest, org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarService", "getRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("getRadar"))
                  .build();
          }
        }
     }
     return getGetRadarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest,
      org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse> getGetListRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListRadar",
      requestType = org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest.class,
      responseType = org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest,
      org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse> getGetListRadarMethod() {
    io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest, org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse> getGetListRadarMethod;
    if ((getGetListRadarMethod = RadarServiceGrpc.getGetListRadarMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getGetListRadarMethod = RadarServiceGrpc.getGetListRadarMethod) == null) {
          RadarServiceGrpc.getGetListRadarMethod = getGetListRadarMethod = 
              io.grpc.MethodDescriptor.<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest, org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarService", "getListRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("getListRadar"))
                  .build();
          }
        }
     }
     return getGetListRadarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest,
      org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse> getSpeedViolationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "speedViolation",
      requestType = org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest.class,
      responseType = org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest,
      org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse> getSpeedViolationMethod() {
    io.grpc.MethodDescriptor<org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest, org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse> getSpeedViolationMethod;
    if ((getSpeedViolationMethod = RadarServiceGrpc.getSpeedViolationMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getSpeedViolationMethod = RadarServiceGrpc.getSpeedViolationMethod) == null) {
          RadarServiceGrpc.getSpeedViolationMethod = getSpeedViolationMethod = 
              io.grpc.MethodDescriptor.<org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest, org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarService", "speedViolation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("speedViolation"))
                  .build();
          }
        }
     }
     return getSpeedViolationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarServiceStub newStub(io.grpc.Channel channel) {
    return new RadarServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRadar(org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRadarMethod(), responseObserver);
    }

    /**
     */
    public void getListRadar(org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListRadarMethod(), responseObserver);
    }

    /**
     */
    public void speedViolation(org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSpeedViolationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest,
                org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse>(
                  this, METHODID_GET_RADAR)))
          .addMethod(
            getGetListRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest,
                org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse>(
                  this, METHODID_GET_LIST_RADAR)))
          .addMethod(
            getSpeedViolationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest,
                org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse>(
                  this, METHODID_SPEED_VIOLATION)))
          .build();
    }
  }

  /**
   */
  public static final class RadarServiceStub extends io.grpc.stub.AbstractStub<RadarServiceStub> {
    private RadarServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRadar(org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRadarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListRadar(org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListRadarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void speedViolation(org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpeedViolationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadarServiceBlockingStub extends io.grpc.stub.AbstractStub<RadarServiceBlockingStub> {
    private RadarServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse getRadar(org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRadarMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse getListRadar(org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListRadarMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse speedViolation(org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSpeedViolationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarServiceFutureStub extends io.grpc.stub.AbstractStub<RadarServiceFutureStub> {
    private RadarServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse> getRadar(
        org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRadarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse> getListRadar(
        org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListRadarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse> speedViolation(
        org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSpeedViolationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RADAR = 0;
  private static final int METHODID_GET_LIST_RADAR = 1;
  private static final int METHODID_SPEED_VIOLATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RADAR:
          serviceImpl.getRadar((org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetRadarResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_RADAR:
          serviceImpl.getListRadar((org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.GetListRadarResponse>) responseObserver);
          break;
        case METHODID_SPEED_VIOLATION:
          serviceImpl.speedViolation((org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.examen03.web.grpc.stub.RadarOuterClass.speedViolationResponse>) responseObserver);
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

  private static abstract class RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.examen03.web.grpc.stub.RadarOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarService");
    }
  }

  private static final class RadarServiceFileDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier {
    RadarServiceFileDescriptorSupplier() {}
  }

  private static final class RadarServiceMethodDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarServiceFileDescriptorSupplier())
              .addMethod(getGetRadarMethod())
              .addMethod(getGetListRadarMethod())
              .addMethod(getSpeedViolationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
