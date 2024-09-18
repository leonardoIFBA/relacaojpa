package com.example.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
    
}
