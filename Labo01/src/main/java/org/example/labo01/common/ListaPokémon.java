package org.example.labo01.common;

import lombok.Getter;
import org.example.labo01.domain.entities.Pokémon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class ListaPokémon {
    private final List<Pokémon> pokemons;

    public ListaPokémon() {
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokémon.builder()
                .Nombre("Pikachu")
                .Tipo("Electrico")
                .Debilidad("Tierra")
                .ZonaDeEncuentro("Bosque y hierva alta")
                .Región("Desde la primera generacion")
                .build());

        this.pokemons.add(Pokémon.builder()
                .Nombre("Charizard")
                .Tipo("Fuego y volador")
                .Debilidad("Agua, electrico y roca")
                .ZonaDeEncuentro("Entregado por el profesor")
                .Región("Desde la primera generacion")
                .build());

        this.pokemons.add(Pokémon.builder()
                .Nombre("Weezing")
                .Tipo("Veneno")
                .Debilidad("Psiquico y tierra")
                .ZonaDeEncuentro("Hierva alta")
                .Región("Desde la primera generacion")
                .build());

        this.pokemons.add(Pokémon.builder()
                .Nombre("Lotad")
                .Tipo("Agua y planta")
                .Debilidad("Bicho, veneno y volador")
                .ZonaDeEncuentro("Hierva alta y agua")
                .Región("Desde la segunda generacion")
                .build());
    }

}