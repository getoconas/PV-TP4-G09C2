package puntoCuatro.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import puntoCuatro.aplicacion.modelo.dominio.Palabra;

/**/

@ManagedBean
@ViewScoped
public class PalabraFormBean implements Serializable{
    private Palabra palabra;
    private int vida;
    private char letraIngresada;    
    
    public PalabraFormBean() {
        String arrayPalabras[] = new String[8];
        arrayPalabras[0] = "marfil";
        arrayPalabras[1] = "suerte";
        arrayPalabras[2] = "programacion";
        arrayPalabras[3] = "luz";
        arrayPalabras[4] = "civilizacion";
        arrayPalabras[5] = "infierno";
        arrayPalabras[6] = "cielo";
        arrayPalabras[7] = "temperatura";
        
        Random rnd = new Random();
        int alea = rnd.nextInt(8);
        
        this.palabra = new Palabra(arrayPalabras[alea]);
        this.vida = 3;
    }
    
    public void menosVida() {
        String aux=palabra.getPalabritaEncriptada();        
        this.letraIngresada = Character.toLowerCase(this.letraIngresada);
        palabra.asignarLetra(this.letraIngresada);
        palabra.compararLetras();
        
        if(this.vida != 0) {
            if(aux.compareToIgnoreCase(palabra.getPalabritaEncriptada()) == 0) 
                this.vida --;
        }
        else
            this.palabra.revelarPalabra();            
    }
    
    public String obtenerPalabraEncriptada() {
        return this.palabra.getPalabritaEncriptada();
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
        
    public String palabraEnc() {
        return palabra.getPalabritaEncriptada();
    }
    
    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }

    public char getLetraIngresada() {
        return letraIngresada;
    }

    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }
    
}

