package com.example.laboratorio02.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "pirates")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pirate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private Double bounty;
    private String crew;
    private Boolean isAlive;
}