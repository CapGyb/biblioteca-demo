package com.biblioteca.service;

import com.biblioteca.model.Livro;

public class BibliotecaService {

    public void emprestarLivro(Livro livro) {
        if (livro.isEmprestado()) {
            throw new RuntimeException("Livro já emprestado!");
        }

        livro.setEmprestado(true);
    }

    public void devolverLivro(Livro livro) {
        // BUG proposital: deveria validar se NÃO está emprestado
        livro.setEmprestado(false);
    }
}