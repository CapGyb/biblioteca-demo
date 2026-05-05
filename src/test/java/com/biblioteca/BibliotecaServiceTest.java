package com.biblioteca;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.biblioteca.model.Livro;
import com.biblioteca.service.BibliotecaService;

public class BibliotecaServiceTest {

    BibliotecaService service = new BibliotecaService();

    @Test
    void deveEmprestarLivroComSucesso() {
        Livro livro = new Livro("Clean Code");

        service.emprestarLivro(livro);

        assertTrue(livro.isEmprestado());
    }

    @Test
    void deveFalharAoEmprestarLivroJaEmprestado() {
        Livro livro = new Livro("DDD");
        livro.setEmprestado(true);

        assertThrows(RuntimeException.class, () -> {
            service.emprestarLivro(livro);
        });
    }

    @Test
    void deveFalharAoDevolverLivroNaoEmprestado() {
        Livro livro = new Livro("Refactoring");

        // Esperado: erro
        // Atual: NÃO lança erro → teste falha
        assertThrows(RuntimeException.class, () -> {
            service.devolverLivro(livro);
        });
    }
}