package org.sid.examen03.repositories;

import org.sid.examen03.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RadarRepository extends JpaRepository<Radar,Long> {

}
