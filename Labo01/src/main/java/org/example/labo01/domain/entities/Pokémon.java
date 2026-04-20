package org.example.labo01.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Pokémon {
    String nombre;
    String tipo;
    String debilidad;
    String zonaDeEncuentro;
    String región;
}
