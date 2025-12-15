package model;

public class Livro {

    private int idLivro;
    private String titulo;
    private String autor;
    private String status;
    Usuario usuario;

    public Livro() {}

    public Livro(int id, String titulo, String autor) {
        this.idLivro = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


}
