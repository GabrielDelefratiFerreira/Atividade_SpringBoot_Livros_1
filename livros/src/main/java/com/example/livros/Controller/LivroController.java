package com.example.livros.Controller;

import com.example.livros.Model.LivroModel;
import com.example.livros.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroModel> findAll(){
        return livroService.findAll();
    }

    @PostMapping
    public LivroModel cirarLivro(@RequestBody LivroModel livro){
        return livroService.criarLivro(livro);
    }
}