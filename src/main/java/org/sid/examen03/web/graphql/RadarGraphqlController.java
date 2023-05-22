package org.sid.examen03.web.graphql;

import lombok.AllArgsConstructor;
import org.sid.examen03.entities.Radar;
import org.sid.examen03.repositories.RadarRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class RadarGraphqlController {

    private RadarRepository radarRepository;

    @QueryMapping
    public List<Radar> radars(){
        return radarRepository.findAll();
    }

    @MutationMapping
    public Radar saveRadar(@Argument Radar radar){
        return radarRepository.save(radar);
    }

}
