package com.example.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.model.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>{
    
}
