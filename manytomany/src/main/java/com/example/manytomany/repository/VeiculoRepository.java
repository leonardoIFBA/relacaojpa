package com.example.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytomany.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
    
}
