package com.example.Hospedagem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospedagem.Entities.Categoria;
import com.example.Hospedagem.Entities.Documento;
import com.example.Hospedagem.Repository.DocumentoRepository;


@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    @Autowired
    private CategoriaService categoriaService; 

 
    public Documento salvar(Documento documento) {
 
        Categoria categoriaExistente = categoriaService.buscarPorId(documento.getCategoria().getId());
        documento.setCategoria(categoriaExistente);
        return documentoRepository.save(documento);
    }
    
}
