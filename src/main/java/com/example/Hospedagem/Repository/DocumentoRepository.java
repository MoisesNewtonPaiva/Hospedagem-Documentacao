package com.example.Hospedagem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospedagem.Entities.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long>{
    
}
