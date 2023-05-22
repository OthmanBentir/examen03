package org.sid.examen03;

import org.sid.examen03.entities.Radar;
import org.sid.examen03.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Examen03Application {

    public static void main(String[] args) {
        SpringApplication.run(Examen03Application.class, args);
    }

    @Bean
    CommandLineRunner start(RadarRepository radarRepository){
        return args -> {
            Radar radar = Radar.builder()
                    .vitesseMaximal(120)
                    .longitude(123.23)
                    .latitude(122.345)
                    .build();
            radarRepository.save(radar);
        };
    }

}
