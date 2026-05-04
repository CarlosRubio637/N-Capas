package org.example.labo01.service;

import lombok.RequiredArgsConstructor;
import org.example.labo01.domain.entities.Pokémon;
import org.example.labo01.repositories.PokémonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokémonService {

    private final PokémonRepository pokémonRepository;


    public List<Pokémon> filtrarPorTipo(String tipo) {
        return pokémonRepository.findAll().stream()
                .filter(p -> p.getTipo().toLowerCase().contains(tipo.toLowerCase()))
                .collect(Collectors.toList());
    }


    public List<Pokémon> filtrarPorZona(String zona) {
        return pokémonRepository.findAll().stream()
                .filter(p -> p.getZonaDeEncuentro().toLowerCase().contains(zona.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Pokémon> filtrarPorDebilidad(String debilidad) {
        return pokémonRepository.findAll().stream()
                .filter(p -> p.getDebilidad().toLowerCase().contains(debilidad.toLowerCase()))
                .collect(Collectors.toList());
    }
}

