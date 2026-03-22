package com.example.livros.Service;

import com.example.livros.Model.LivroModel;
import com.example.livros.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<LivroModel> findAll(){
        return livroRepository.findAll();
    }

    public Optional<LivroModel> buscarPorId(Long id){
        return livroRepository.findById(id);
    }

    public LivroModel criarLivro(LivroModel livro){
        return livroRepository.save(livro);
    }

    public void deletarLivro(long id){
        livroRepository.deleteById(id);
    }
}