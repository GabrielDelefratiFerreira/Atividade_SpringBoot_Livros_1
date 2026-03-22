package com.example.livros.Controller;

import com.example.livros.Model.LivroModel;
import com.example.livros.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroModel> findAll(){
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<LivroModel> buscarPorId(@PathVariable Long id){
        return livroService.buscarPorId(id);
    }

    @PostMapping
    public LivroModel cirarLivro(@RequestBody LivroModel livro){
        return livroService.criarLivro(livro);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id){
        livroService.deletarLivro(id);
    }
}