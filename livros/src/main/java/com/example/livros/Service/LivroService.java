package com.example.livros.Service;

import com.example.livros.Model.LivroModel;
import com.example.livros.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<LivroModel> findAll(){
        return livroRepository.findAll();
    }

    public LivroModel criarLivro(LivroModel livro){
        return livroRepository.save(livro);
    }
}