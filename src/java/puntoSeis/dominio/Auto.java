package puntoSeis.dominio;

import java.io.Serializable;

/**/

public class Auto implements Serializable{
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    
    public Auto() {
      
    }

    public Auto(String patente, String marca, String modelo, String color, String combustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
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
