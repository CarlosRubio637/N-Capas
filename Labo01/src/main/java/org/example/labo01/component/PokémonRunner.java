package org.example.labo01.component;

import lombok.RequiredArgsConstructor;
import org.example.labo01.domain.entities.Pokémon;
import org.example.labo01.service.PokémonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PokémonRunner implements CommandLineRunner {


    private final PokémonService pokémonService;

    @Override
    public void run(String... args) {
        System.out.println("====== INFORME TÉCNICO DEL PROFESOR OAK ======");

        System.out.println("\n>>> FILTRANDO POR TIPO: Electrico");
        imprimirLista(pokémonService.filtrarPorTipo("Electrico"));

        System.out.println("\n>>> FILTRANDO POR ZONA: Hierva");
        imprimirLista(pokémonService.filtrarPorZona("hierva"));

        System.out.println("\n>>> FILTRANDO POR DEBILIDAD: Agua");
        imprimirLista(pokémonService.filtrarPorDebilidad("Agua"));
    }

    private void imprimirLista(List<Pokémon> lista) {
        if (lista.isEmpty()) {
            System.out.println("[!] No se encontraron Pokémon con esos criterios.");
        } else {
            lista.forEach(p -> {
                System.out.printf("[PKMN] Nombre: %s | Tipo: %s | Debilidades: %s%n",
                        p.getNombre(), p.getTipo(), p.getDebilidad());
            });
        }
    }
}
