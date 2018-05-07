package puntoSeis.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import puntoSeis.dominio.Auto;

/**/

@ManagedBean
@ViewScoped
public class AutoManagedBean { 
    private ArrayList<Auto> lstAuto;
    
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    
    public AutoManagedBean() {
        this.lstAuto = new ArrayList<Auto>();
        this.agregarAuto();
    }
    
    public void agregarAuto() {
        Auto objAuto;
        objAuto = new Auto("AA 015 ER", "Alfa Romeo", "Giulietta", "Blanco", "Nafta Premium");
        lstAuto.add(objAuto);
        objAuto = new Auto("AB 305 JU", "Ford", "Eco Sport", "Negro", "Nafta Súper");
        lstAuto.add(objAuto);
        objAuto = new Auto("AA 395 PO", "Renault", "Fluence", "Gris", "Gasoil Común");
        lstAuto.add(objAuto);
        objAuto = new Auto("AA 901 LU", "Toyota", "Hilux", "Azul", "Nafta Súper");
        lstAuto.add(objAuto);
        objAuto = new Auto("AB 711 KF", "Porsche", "911", "Negro", "Nafta Premium");
        lstAuto.add(objAuto);
        objAuto = new Auto("AA 803 MM", "Peugeot", "308", "Blanco", "Gasoil Común");
        lstAuto.add(objAuto);
        objAuto = new Auto("AC 255 CF", "Lamborghini", "Aventador", "Rojo", "Nafta Premium");
        lstAuto.add(objAuto);
        objAuto = new Auto("AB 832 ER", "Ford", "Ka", "Gris", "Gasoil Premium");
        lstAuto.add(objAuto);
        objAuto = new Auto("AA 604 JF", "Citroen", "C4 Picasso", "Negro", "Nafta Súper");
        lstAuto.add(objAuto);
        objAuto = new Auto("AC 598 AA", "Toyota", "Aygo", "Blanco", "Gasoil Premium");
        lstAuto.add(objAuto);
    }

    public ArrayList<Auto> getLstAuto() {
        return lstAuto;
    }

    public void setLstAuto(ArrayList<Auto> lstAuto) {
        this.lstAuto = lstAuto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
