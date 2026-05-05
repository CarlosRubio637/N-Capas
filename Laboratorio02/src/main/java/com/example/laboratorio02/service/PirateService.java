package com.example.laboratorio02.service;

import com.example.laboratorio02.model.Pirate;
import java.util.List;
import java.util.UUID;

public interface PirateService {
    List<Pirate> getAllPirates();
    Pirate getPirateById(UUID id);
    Pirate savePirate(Pirate pirate);
    void deletePirate(UUID id);
}