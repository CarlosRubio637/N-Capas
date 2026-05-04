package org.example.labo01.repositories;

import lombok.RequiredArgsConstructor;
import org.example.labo01.common.ListaPokémon;
import org.example.labo01.domain.entities.Pokémon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokémonRepository {

    private final ListaPokémon listaPokémon;

    public List<Pokémon> findAll() {
        return listaPokémon.getPokemons();
    }
}
