package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {

    public final List<Livro> livros = new ArrayList<>();

    public Biblioteca() {}

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String tituloLivro) {

        Iterator<Livro> iterator = livros.iterator();

        while (iterator.hasNext()) {
            Livro livro = iterator.next();

            if (livro.getTitulo().equalsIgnoreCase(tituloLivro)){
                iterator.remove();

                return;
            }
        }
    }

    public void removerLivro(Integer id) {

        Iterator<Livro> iterator = livros.iterator();

        while (iterator.hasNext()) {
            Livro livro = iterator.next();

            if (id == livro.getIdLivro()){
                iterator.remove();

                return;
            }
        }
    }

    public Livro buscarLivro(String tituloLivro) {

        Iterator<Livro> iterator = livros.iterator();

        do {
            Livro livro = iterator.next();

            if (livro.getTitulo().equalsIgnoreCase(tituloLivro)){

                return livro;
            } else {
                return null;
            }
        } while (iterator.hasNext());

    }

    public Livro buscarLivro(Integer idLivro) {

        Iterator<Livro> iterator = livros.iterator();

        do {
            Livro livro = iterator.next();

            if (idLivro == livro.getIdLivro()){
                return livro;
            } else {
                return null;
            }
        } while (iterator.hasNext());

    }



}
