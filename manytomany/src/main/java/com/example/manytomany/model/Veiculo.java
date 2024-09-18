package com.example.manytomany.model;

import java.util.*;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 60, nullable = false)
    private String fabricante;
    @Column(length = 60, nullable = false)
    private String modelo;
    @ManyToMany
    @JoinTable(name = "veiculo_acessorio",
            joinColumns = @JoinColumn(name = "veiculo_codigo"),
            inverseJoinColumns = @JoinColumn(name = "acessorio_codigo"))
    private List<Acessorio> acessorios = new ArrayList<>();
        
}

