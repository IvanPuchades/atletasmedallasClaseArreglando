package com.example.repository;

import com.example.domain.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by dam on 1/12/16.
 */
public interface AtletaRepository extends JpaRepository<Atleta,Long> {

    List<Atleta> findByNacionalidad(String nacionalidad);
    List<Atleta> findByFechaNacimientoDespues(LocalDate fechaNacimiento);


}
