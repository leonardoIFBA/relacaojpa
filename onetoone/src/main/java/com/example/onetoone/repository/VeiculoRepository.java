package com.example.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
    
}
