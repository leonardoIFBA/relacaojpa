package com.example.onetoone.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "proprietario")
@Data
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 60, nullable = false)
    private String nome;
    @Column(length = 20, nullable = false)
    private String telefone;

    //Veiculo é a entidade forte que tem a chave primaria da entidade subordinada (Proprietario)
    @OneToOne(mappedBy = "proprietario")
    private Veiculo veiculo;

    
    @Override
    public String toString() {
        return "Proprietario [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone 
                + "]";
    }      
   
    

}
