package com.example.manytomany.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "acessorio")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 60, nullable = false)
    private String descricao;

    @ManyToMany(mappedBy = "acessorios")
	private List<Veiculo> veiculos = new ArrayList<>();


}

