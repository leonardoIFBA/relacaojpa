package com.example.onetomany.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 60, nullable = false)
    private String nome;
    @Column(length = 20, nullable = false)
    private String telefone;
    
    //@OneToMany
    //@JoinColumn(name = "id_proprietario_fk")
    //private List<Veiculo> veiculos;

    //pra ficar bidirecional
    
    @OneToMany(mappedBy = "proprietario")
    private List<Veiculo> veiculos;

    @Override
    public String toString() {
        return "Proprietario [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone 
                + "]";
    } 
    
}
