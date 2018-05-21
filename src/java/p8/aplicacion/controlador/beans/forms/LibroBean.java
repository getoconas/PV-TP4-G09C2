package p8.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import p8.aplicacion.modelo.dominio.Libro;

/**/

@ManagedBean
@ViewScoped
public class LibroBean implements Serializable {
    private List<Libro> libros;
    private List<Libro> auxiliarLibros;
    
    private String isbn;
    private String autor;
    private String titulo;
    private double precio;
    
    private String autorBuscado;
    
    public LibroBean() {
        libros = new ArrayList<>();
        auxiliarLibros = libros;
        
    }
    
    public void agregarLibro() {
        Libro lbr = new Libro(isbn, autor, titulo, precio);
        libros.add(lbr);
    }
    
    public void buscarAutor() {
        List<Libro> aux = new ArrayList<>();
        for (Libro l:libros) {
            if (l.getAutor().equals(autorBuscado)) {
                aux.add(l);
            }
        }
        auxiliarLibros = aux;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }  

    public List<Libro> getAuxiliarLibros() {
        return auxiliarLibros;
    }

    public void setAuxiliarLibros(List<Libro> auxiliarLibros) {
        this.auxiliarLibros = auxiliarLibros;
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

    public String getAutorBuscado() {
        return autorBuscado;
    }

    public void setAutorBuscado(String autorBuscado) {
        this.autorBuscado = autorBuscado;
    }    
}
