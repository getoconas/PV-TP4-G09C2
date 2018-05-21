package p8.aplicacion.modelo.dominio;

import java.io.Serializable;

/**/

public class Libro implements Serializable {
    public String isbn;
    public String autor;
    public String titulo;
    public double precio;
    
    public Libro() {
        
    }

    public Libro(String isbn, String autor, String titulo, double precio) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
