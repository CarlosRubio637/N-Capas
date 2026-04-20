package org.example.labo01.common;

import lombok.Getter;
import org.example.labo01.domain.entities.Pokémon;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Component
public class ListaPokémon {
    private final List<Pokémon> pokemons;


    public ListaPokémon(List<Pokémon> pokemons) {
        this.pokemons = pokemons;

        this.pokemons.add(Pokémon.builder()
                .nombre("Pikachu")
                .tipo("Electrico")
                .debilidad("Tierra")
                .zonaDeEncuentro("Bosque y hierva alta")
                .región("Desde la primera generacion")
                .build());

        this.pokemons.add(Pokémon.builder()
                .nombre("Charizard")
                .tipo("Fuego y volador")
                .debilidad("Agua, electrico y roca")
                .zonaDeEncuentro("Entregado por el profesor")
                .región("Desde la primera generacion")
                .build());

        this.pokemons.add(Pokémon.builder()
                .nombre("Weezing")
                .tipo("Veneno")
                .debilidad("Psiquico y tierra")
                .zonaDeEncuentro("Hierva alta")
                .región("Desde la primera generacion")
                .build());

        this.pokemons.add(Pokémon.builder()
                .nombre("Lotad")
                .tipo("Agua y planta")
                .debilidad("Bicho, veneno y volador")
                .zonaDeEncuentro("Hierva alta y agua")
                .región("Desde la segunda generacion")
                .build());
    }
}
