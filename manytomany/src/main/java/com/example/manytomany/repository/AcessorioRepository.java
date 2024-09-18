package com.example.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytomany.model.Acessorio;

public interface AcessorioRepository extends JpaRepository<Acessorio, Long>{
    
}
