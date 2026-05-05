package com.example.laboratorio02.controller;

import com.example.laboratorio02.model.Pirate;
import com.example.laboratorio02.service.PirateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pirates")
public class PirateController {

    @Autowired
    private PirateService service;

    @PostMapping
    public Pirate createPirate(@RequestBody Pirate pirate) {
        return service.savePirate(pirate);
    }

    @GetMapping
    public List<Pirate> getAll() {
        return service.getAllPirates();
    }

    @GetMapping("/{id}")
    public Pirate getById(@PathVariable UUID id) {
        return service.getPirateById(id);
    }

    @PutMapping("/{id}")
    public Pirate updatePirate(@PathVariable UUID id, @RequestBody Pirate pirate) {
        Pirate existing = service.getPirateById(id);
        if (existing != null) {
            pirate.setId(id);
            return service.savePirate(pirate);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.deletePirate(id);
    }
}