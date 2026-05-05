package com.example.laboratorio02.service.impl;

import com.example.laboratorio02.model.Pirate;
import com.example.laboratorio02.repository.PirateRepository;
import com.example.laboratorio02.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PirateServiceImpl implements PirateService {

    private final PirateRepository repository;

    @Override
    public List<Pirate> getAllPirates() {
        return repository.findAll();
    }

    @Override
    public Pirate getPirateById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Pirate savePirate(Pirate pirate) {
        return repository.save(pirate);
    }

    @Override
    public void deletePirate(UUID id) {
        repository.deleteById(id);
    }
}