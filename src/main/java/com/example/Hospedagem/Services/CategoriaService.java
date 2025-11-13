package com.example.Hospedagem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospedagem.Entities.Categoria;
import com.example.Hospedagem.Repository.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    
    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

  
    public List<Categoria> buscarTodas() {
        return categoriaRepository.findAll();
    }

 
    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada com ID: " + id));
    }


    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }
}
