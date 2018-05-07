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
    
    public double calcularCelsiusaFahrenheit() {
        return 1.8 * numero + 32;
    }
    
    public double calcularCelsiusaKelvin() {
        return numero + 273.15;
    }
    
    public double calcularFahrenheitaCelsius() {
        return (numero - 32) * 5 / 9;
    }
    
    public double calcularFahrenheitaKelvin() {
        return (numero + 459.67) * 5 / 9;
    }
    
    public double calcularKelvinaCelsius() {
        return numero - 273.15;
    }
    
    public double calcularKevinaFahrenheit() {
        return (numero - 273.15) * 1.8 + 32;
    }
}
