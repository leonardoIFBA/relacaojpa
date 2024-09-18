package com.example.onetomany.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 60, nullable = false)
    private String fabricante;
    @Column(length = 60, nullable = false)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "id_proprietario_fk")
    private Proprietario proprietario;
     
}
