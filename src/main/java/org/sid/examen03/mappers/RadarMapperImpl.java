package org.sid.examen03.mappers;

import org.sid.examen03.entities.Radar;
import org.sid.examen03.web.grpc.stub.RadarOuterClass;
import org.springframework.stereotype.Service;

@Service
public class RadarMapperImpl {
    public RadarOuterClass.Radar fromRadar(Radar radar){
        RadarOuterClass.Radar radar1 = RadarOuterClass.Radar.newBuilder()
                .setId(radar.getId())
                .setVitesseMaximal(radar.getVitesseMaximal())
                .setLongitude(radar.getLongitude())
                .setLatitude(radar.getLatitude())
                .build();
        return radar1;
    }
}
