package com.example.service;

import com.example.domain.Medalla;
import com.example.domain.TipoMedalla;
import com.example.repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dam on 1/12/16.
 */

@Service
public class MedallaService {

    @Autowired
    private MedallaRepository medallaRepository;

   // @Autowired
   // private AtletaRepository

    public void testMedallas(){
        Medalla medalla1 = new Medalla(TipoMedalla.Bronce, 1,"Tiro al Arco","Alebin");
        medallaRepository.save(medalla1);

        Medalla medalla2 = new Medalla(TipoMedalla.Plata, 2, "Tiro al plato", "Junior");
        medallaRepository.save(medalla2);

        Medalla medalla3 = new Medalla(TipoMedalla.Oro, 3, "Lanzamiento de javalina", "Senior");
        medallaRepository.save(medalla3);


    }
}
