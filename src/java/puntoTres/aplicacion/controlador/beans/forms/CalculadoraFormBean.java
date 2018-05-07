package puntoTres.aplicacion.controlador.beans.forms;

import puntoTres.aplicacion.modelo.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**/

@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{

    Calculadora calculadora;
    private double numero1;
    private double numero2;
    
    public CalculadoraFormBean() {
        calculadora = new Calculadora();
    }

    public double sumar() {
        return calculadora.sumarNumeros(this.numero1, this.numero2);
    }
    public double restar() {
        return calculadora.restarNumeros(this.numero1, this.numero2);
    }
    public double multiplicar() {
        return calculadora.multiplicarNumeros(this.numero1, this.numero2);
    }
    public double dividir() {
        return calculadora.dividirNumeros(this.numero1, this.numero2);
    }
    public double potencia() {
        return calculadora.potenciarNumeros(this.numero1, this.numero2);
    }
    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
        
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
