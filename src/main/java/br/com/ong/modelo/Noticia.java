package br.com.ong.modelo;

import org.springframework.data.annotation.Id;


/**
 * Created by rafamrqs on 19/05/16.
 */
public class Noticia {
    @Id
    private Integer idNoticia;
    private String assunto;
    private String texto;
    private String autor;

    public Noticia() {
    }

    public Noticia(Integer idNoticia, String assunto, String texto, String autor) {
        this.idNoticia = idNoticia;
        this.assunto = assunto;
        this.texto = texto;
        this.autor = autor;
    }

    public Integer getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Integer idNoticia) {
        this.idNoticia = idNoticia;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
