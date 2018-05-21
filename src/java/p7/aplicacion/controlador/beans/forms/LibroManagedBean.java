package p7.aplicacion.controlador.beans.forms;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import p7.aplicacion.modelo.dominio.Libro;

/**/

@ManagedBean
@ViewScoped
public class LibroManagedBean {
    private ArrayList<Libro> lstLibro;
    
    private String isbn;
    private String autor;
    private String titulo;
    private double precio;
    
    public LibroManagedBean() {
        this.lstLibro = new ArrayList<Libro>();
    }
    
    public void agregarLibro() {
        Libro lbr = new Libro(isbn, autor, titulo, precio);
        this.lstLibro.add(lbr);
    }

    public ArrayList<Libro> getLstLibro() {
        return lstLibro;
    }

    public void setLstLibro(ArrayList<Libro> lstLibro) {
        this.lstLibro = lstLibro;
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
