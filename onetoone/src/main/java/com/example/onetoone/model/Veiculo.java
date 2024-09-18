package com.example.onetoone.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "veiculo")
@Data
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 60, nullable = false)
    private String fabricante;
    @Column(length = 60, nullable = false)
    private String modelo;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_proprietario_fk")
    private Proprietario proprietario;

       
}
