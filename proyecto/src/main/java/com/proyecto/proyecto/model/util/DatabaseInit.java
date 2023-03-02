package com.proyecto.proyecto.model.util;

import com.proyecto.proyecto.model.entity.Conductor;
import com.proyecto.proyecto.model.repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit implements ApplicationRunner {

    @Autowired
    ConductorRepository conductorRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        conductorRepository.save(new Conductor("Sebastian Galeano", 123456, 890123, "Cra 5 Bis #9-36"));
        conductorRepository.save(new Conductor("Anderson Alvarado", 234567, 901234, "Cra 50 #100-12"));
        conductorRepository.save(new Conductor("Daniel Florido", 345678, 123456, "Cra 7 #200-80"));
        conductorRepository.save(new Conductor("Jaime Pavlich", 456789, 234567, "Cra 164 #15-62"));
        conductorRepository.save(new Conductor("Daniel Florido", 567890, 345678, "Cra 150 #50-44"));
    }
}
