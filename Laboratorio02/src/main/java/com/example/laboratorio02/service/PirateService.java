package com.example.laboratorio02.service;

import com.example.laboratorio02.model.Pirate;
import com.example.laboratorio02.repository.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class PirateService {

    @Autowired
    private PirateRepository repository;

    public List<Pirate> getAllPirates() {
        return repository.findAll();
    }

    public Pirate getPirateById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public Pirate savePirate(Pirate pirate) {
        return repository.save(pirate);
    }

    public void deletePirate(UUID id) {
        repository.deleteById(id);
    }
}