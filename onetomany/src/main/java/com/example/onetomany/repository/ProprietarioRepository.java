package com.example.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.model.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
    
}
