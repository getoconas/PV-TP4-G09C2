package puntoCuatro.aplicacion.modelo.dominio;

import java.io.Serializable;

/**/

public class Palabra implements Serializable{
    
    private String palabra;
    private String palabritaEncriptada;
    private char letra;
    
    
    public Palabra() {        
    }
    public Palabra(String palabra) {
        this.palabra = palabra;
        this.palabritaEncriptada = this.palabra;
        this.palabritaEncriptada = this.palabritaEncriptada.replaceAll("(?s).", "_ ");        
    }
    public String getPalabrita() {
        return palabra;
    }

    public void revelarPalabra() {
        this.palabritaEncriptada = this.palabra;
    }
    
    public String getPalabritaEncriptada() {
        return palabritaEncriptada;
    }

    public void setPalabritaEncriptada(String palabritaEncriptada) {
        this.palabritaEncriptada = palabritaEncriptada;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public int cantidadLetras() {
        return palabra.length();
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public void asignarLetra(char xLetra){
        this.letra=xLetra;
    }  
    public void compararLetras() {
        for(int i=0; i<this.cantidadLetras(); i++) {
            if(this.letra == this.palabra.charAt(i)) {
                this.palabritaEncriptada = this.palabritaEncriptada.substring(0,i)+this.letra+this.palabritaEncriptada.substring(i+1);
            }                
        }
    }    
}