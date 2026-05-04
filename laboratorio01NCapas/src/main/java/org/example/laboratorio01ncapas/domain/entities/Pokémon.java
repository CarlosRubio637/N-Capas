package org.example.laboratorio01ncapas.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Pokémon {
    private String nombre;
    private String tipo;
    private String debilidadesDeTipo;
    private String zonasDeEncuentro;
    private String region;

}
