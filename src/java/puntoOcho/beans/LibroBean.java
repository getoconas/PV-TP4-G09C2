package puntoOcho.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import puntoOcho.dominio.Libro;

/**/

@ManagedBean
@ViewScoped
public class LibroBean {
    private ArrayList<Libro> lstLibro;
    
    private String isbn;
    private String autor;
    private String titulo;
    private double precio;
    
    private String autorBuscado;
    
    public LibroBean() {
        this.lstLibro = new ArrayList<Libro>();
    }
    
    public void agregarLibro() {
        Libro lbr = new Libro(isbn, autor, titulo, precio);
        this.lstLibro.add(lbr);
    }
    
    public boolean buscarAutor() {
        for (Libro i: this.lstLibro) {
            if (i.getAutor().compareToIgnoreCase(this.autorBuscado) == 0) {
                return true;
            }
        }
        return false;
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

    public String getAutorBuscado() {
        return autorBuscado;
    }

    public void setAutorBuscado(String autorBuscado) {
        this.autorBuscado = autorBuscado;
    }    
}
