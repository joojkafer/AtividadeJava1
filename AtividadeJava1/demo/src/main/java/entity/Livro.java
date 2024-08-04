package entity;

public class Livro {

    private long id;
    private String titulo;
    private Integer ano_publicacao;
    private String autor;

    public String getTitulo() {
        return titulo;
    }
    public long getId() {
        return id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Livro(long id, String titulo, Integer ano_publicacao, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.ano_publicacao = ano_publicacao;
        this.autor = autor;
    }

    public Integer getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(Integer ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
