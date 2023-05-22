package org.sid.examen03.web.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.sid.examen03.web.grpc.stub.RadarOuterClass;
import org.sid.examen03.web.grpc.stub.RadarServiceGrpc;

public class RadarClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",9998)
                .usePlaintext().build();
        RadarServiceGrpc.RadarServiceBlockingStub blockingStub = RadarServiceGrpc.newBlockingStub(managedChannel);

        RadarOuterClass.speedViolationRequest speedViolationRequest = RadarOuterClass.speedViolationRequest.newBuilder()
                .setSpeed(130)
                .build();

        RadarOuterClass.speedViolationResponse speedViolationResponse = blockingStub.speedViolation(speedViolationRequest);
        System.out.println(speedViolationResponse);


        RadarOuterClass.GetListRadarRequest getListRadarRequest = RadarOuterClass.GetListRadarRequest.newBuilder().build();

        RadarOuterClass.GetListRadarResponse listRadar = blockingStub.getListRadar(getListRadarRequest);
        System.out.println(listRadar.getRadarList());
    }
}
