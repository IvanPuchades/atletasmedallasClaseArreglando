package com.example.controller;

import com.example.domain.Atleta;
import com.example.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by dam on 7/12/16.
 */
@RestController
@RequestMapping("/atletas")
public class AtletaController {

    @Autowired
    private AtletaRepository atletaRepository;
    // Vamos a crear el CRUD de Atletas

    //Creamos el C (Create) del CRUD
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Atleta crearAtletas(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    //Creamos el R (Obtener(Retrieve)) del CRUD
    @GetMapping
    public List<Atleta> getTodosAtletas() {

        return atletaRepository.findAll();
    }

    //Creamos el U (Update) del CRUD
    @PutMapping
    public Atleta updateAtleta(@RequestBody Atleta atleta){
        return atletaRepository.save(atleta);
    }

    //Creamos el D (Delete) del CRUD
    @DeleteMapping("/{id}")
    public void deleteAtletaID(@PathVariable Long id)
    {
        Atleta atleta = atletaRepository.findOne(id);
        if(atleta != null ) atletaRepository.delete(id);
    }

    @GetMapping("/GroupByNacionalidad")
    public Map<String, List<Atleta>> getAtletaGroupByNacionalidad(){
        return atletaRepository.findAll().parallelStream()
                .collect(groupingBy(Atleta::getNacionalidad));
    }


}
