package puntoUno.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import puntoUno.dominio.ConversorTemperatura;

/**/

@ManagedBean
@ViewScoped
public class ConversorBean {
    private double temperatura;
    private char letraA;
    private char letraB;
    private ConversorTemperatura ctemp;
    
    public ConversorBean() {
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public char getLetraA() {
        return letraA;
    }

    public void setLetraA(char letraA) {
        this.letraA = letraA;
    }

    public char getLetraB() {
        return letraB;
    }

    public void setLetraB(char letraB) {
        this.letraB = letraB;
    }

    public ConversorTemperatura getCtemp() {
        return ctemp;
    }

    public void setCtemp(ConversorTemperatura ctemp) {
        this.ctemp = ctemp;
    }
    
    public double convertir() {
        double resultado = 0;
        ctemp = new ConversorTemperatura();
        ctemp.asignarValor(temperatura);
        
        if (letraA == 'C' && letraB == 'F') {
            resultado = ctemp.calcularCelsiusaFahrenheit();
        }
        if (letraA == 'C' && letraB == 'K') {
            resultado = ctemp.calcularCelsiusaKelvin();
        }
        if (letraA == 'F' && letraB == 'K') {
            resultado = ctemp.calcularFahrenheitaKelvin();
        }
        if (letraA == 'F' && letraB == 'C') {
            resultado = ctemp.calcularFahrenheitaCelsius();
        }
        if (letraA == 'K' && letraB == 'F') {
            resultado = ctemp.calcularKevinaFahrenheit();            
        }
        if (letraA == 'K' && letraB == 'C') {
            resultado = ctemp.calcularKelvinaCelsius();
        }
        if (letraA == 'C' && letraB == 'C') {
            resultado = temperatura;
        }
        if (letraA == 'F' && letraB == 'F') {
            resultado = temperatura;
        }
        if (letraA == 'K' && letraB == 'K') {
            resultado = temperatura;
        }
        return resultado;
    }
}
