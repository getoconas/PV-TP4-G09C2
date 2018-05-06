package puntoUno.dominio;

import java.io.Serializable;

/**/

public class ConversorTemperatura implements Serializable {
    private double numero;
    
    public ConversorTemperatura() {
        
    }
    
    public void asignarValor(double num) {
        this.numero = num;
    }
    
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public double obtenerCelsiusDeFahrenheit() {
        return 1.8 * numero + 32;
    }
    
    public double obtenerCelsiusDeKelvin() {
        return numero + 273.15;
    }
    
    public double obtenerFahrenheitDeCelsius() {
        return (numero - 32) * (5 / 9);
    }
    
    public double obtenerFahrenheitDeKelvin() {
        return (numero + 459.67) * (5 / 9);
    }
    
    public double obtenerKelvinDeCelsius() {
        return numero - 273.15;
    }
    
    public double obtenerKelvinDeFahrenheit() {
        return (numero - 273.15) * 1.8 + 32;
    }
}
