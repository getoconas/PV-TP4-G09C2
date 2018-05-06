package puntoUno.beans;

import java.io.Serializable;
import puntoUno.dominio.ConversorTemperatura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**/

@ManagedBean
@RequestScoped
public class ConversorManagedBean implements Serializable {
    
    private double n;
    private ConversorTemperatura conversor;
    private char unidadOrigen;
    private char unidadDestino;
    
    public ConversorManagedBean() {
        
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public ConversorTemperatura getConversor() {
        return conversor;
    }

    public void setConversor(ConversorTemperatura conversor) {
        this.conversor = conversor;
    }

    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public char getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(char unidadDestino) {
        this.unidadDestino = unidadDestino;
    }
    
    public double convertirUnidades() {
        double resultado = 0.0;
        conversor = new ConversorTemperatura();
        conversor.asignarValor(n);
        
        if (unidadOrigen == 'C' && unidadDestino == 'F') {
            resultado = conversor.obtenerCelsiusDeFahrenheit();
        } else if (unidadOrigen == 'C' && unidadDestino == 'K') {
            resultado = conversor.obtenerCelsiusDeKelvin();
        } else {
            return resultado;
        }
        
        if (unidadOrigen == 'F' && unidadDestino == 'C') {
            resultado = conversor.obtenerFahrenheitDeCelsius();
        } else if (unidadOrigen == 'F' && unidadDestino == 'K') {
            conversor.obtenerFahrenheitDeKelvin();
        } 
        
        if (unidadOrigen == 'K' && unidadDestino == 'C') {
            conversor.obtenerKelvinDeCelsius();
        } else if (unidadOrigen == 'K' && unidadDestino == 'F') {
            conversor.obtenerKelvinDeFahrenheit();
        }
        
        return resultado;
    }
}
