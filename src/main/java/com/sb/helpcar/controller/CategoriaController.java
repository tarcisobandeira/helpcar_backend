package com.sb.helpcar.controller;

import com.sb.helpcar.entities.Categoria;
import com.sb.helpcar.repository.CategoriaRepositiry;
import com.sb.helpcar.request.CategoriaRequestDTO;
import com.sb.helpcar.response.CategoriaResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaRepositiry Repositiry;

    @PostMapping(value = "cadastro/save")
    public void InserirCategoria(@RequestBody CategoriaRequestDTO data){
        Categoria c = new Categoria(data);
        Repositiry.save(c);
        return;
    }

    @GetMapping(value = "categoria/all")
    public List<CategoriaResponseDTO> ListarCategorias(){
        List<CategoriaResponseDTO> categoriasList = Repositiry.findAll().stream().map(CategoriaResponseDTO::new).toList();
        return categoriasList;
    }

    @GetMapping("categoria/{id}")
    public CategoriaResponseDTO getCategoriaById(@PathVariable Integer id){
        CategoriaResponseDTO cr = Repositiry.findByid(id);
        return cr;
    }
}
