package org.sid.examen03.web.grpc.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.glassfish.jersey.internal.inject.ParamConverters;
import org.sid.examen03.entities.Radar;
import org.sid.examen03.mappers.RadarMapperImpl;
import org.sid.examen03.repositories.RadarRepository;
import org.sid.examen03.web.grpc.stub.RadarOuterClass;
import org.sid.examen03.web.grpc.stub.RadarServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class RadarGrpcServiceImpl extends RadarServiceGrpc.RadarServiceImplBase {
    @Autowired
    private RadarRepository radarRepository;

    @Autowired
    private RadarMapperImpl radarMapper;

    @Override
    public void getListRadar(RadarOuterClass.GetListRadarRequest request, StreamObserver<RadarOuterClass.GetListRadarResponse> responseObserver) {
        List<Radar> radars = radarRepository.findAll();
        List<RadarOuterClass.Radar> grpcRadarList = radars.stream().map(radar -> radarMapper.fromRadar(radar)).collect(Collectors.toList());
        RadarOuterClass.GetListRadarResponse listRadarResponse = RadarOuterClass.GetListRadarResponse.newBuilder()
                .addAllRadar(grpcRadarList)
                .build();
        responseObserver.onNext(listRadarResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getRadar(RadarOuterClass.GetRadarRequest request, StreamObserver<RadarOuterClass.GetRadarResponse> responseObserver) {
        Long id = request.getId();
        Radar radar = radarRepository.findById(id).orElse(null);
        if (radar!= null){
            RadarOuterClass.Radar radar1 = radarMapper.fromRadar(radar);
            RadarOuterClass.GetRadarResponse radarResponse = RadarOuterClass.GetRadarResponse.newBuilder()
                    .setRadar(radar1)
                    .build();
            responseObserver.onNext(radarResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void speedViolation(RadarOuterClass.speedViolationRequest request, StreamObserver<RadarOuterClass.speedViolationResponse> responseObserver) {

        RadarOuterClass.speedViolationResponse speedViolationResponse;
        Long speed = request.getSpeed();
        if (speed>120){
            speedViolationResponse = RadarOuterClass.speedViolationResponse.newBuilder()
                    .setSpeedViolationConfirmationValue(RadarOuterClass.SpeedViolationConfirmation.VIOLATED_VALUE)
                    .build();
            responseObserver.onNext(speedViolationResponse);
            responseObserver.onCompleted();
        }
        else{
            speedViolationResponse = RadarOuterClass.speedViolationResponse.newBuilder()
                    .setSpeedViolationConfirmationValue(RadarOuterClass.SpeedViolationConfirmation.NOT_VIOLATED_VALUE)
                    .build();
            responseObserver.onNext(speedViolationResponse);
            responseObserver.onCompleted();
        }

    }
}
