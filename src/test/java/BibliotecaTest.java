package test.java;

import model.Biblioteca;
import model.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    private Livro livro = new Livro(1, "Harry Potter", "J.K Rowling");
    private Biblioteca biblioteca = new Biblioteca();

    @Test
    void testeAdicionarLivro() {
        biblioteca.adicionarLivro(livro);
        assertTrue(biblioteca.livros.contains(livro));
    }

    @Test
    void removerLivroPorTitulo() {
        biblioteca.adicionarLivro(livro);
        biblioteca.removerLivro(livro.getTitulo());
        assertFalse(biblioteca.livros.contains(livro));
    }

    @Test
    void removerLivroPorId() {
        biblioteca.adicionarLivro(livro);
        biblioteca.removerLivro(livro.getIdLivro());
        assertFalse(biblioteca.livros.contains(livro));
    }

    @Test
    void buscarLivroPorTitulo() {
        biblioteca.adicionarLivro(livro);
        boolean retornouLivro = biblioteca.buscarLivro(livro.getTitulo()) != null && biblioteca.buscarLivro(livro.getTitulo()) == livro;
        assertTrue(retornouLivro);
    }

    @Test
    void buscarLivroPorId() {
        biblioteca.adicionarLivro(livro);
        boolean retornouLivro = biblioteca.buscarLivro(livro.getIdLivro()) != null && biblioteca.buscarLivro(livro.getIdLivro()) == livro;
        assertTrue(retornouLivro);
    }
}
