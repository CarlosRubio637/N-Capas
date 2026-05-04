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
    String Nombre;
    String Tipo;
    String Debilidad;
    String ZonaDeEncuentro;
    String Región;
}
