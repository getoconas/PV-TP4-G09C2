package puntoDos.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**/

@ManagedBean
@ViewScoped
public class NumeroBean implements Serializable {
    private ArrayList<Integer> lstNumbers;
    private int numero;
    
    public NumeroBean() {
        lstNumbers = new ArrayList<Integer>();
    }
    
    public void agregarNumero() {
        this.lstNumbers.add(numero);
    }
    
    public int extendArray() {
        return this.lstNumbers.size();
    }
    
    public int mayorNumero() {
        Iterator<Integer> iteradorNumeros = this.lstNumbers.iterator();
        int mayor = 0, aux;
        boolean bandera = false;      
        while (iteradorNumeros.hasNext()) {
            aux = iteradorNumeros.next();
            if (!bandera) {
                bandera = true;
                mayor = aux;
            } else {
                if (aux > mayor) 
                    mayor = aux;
            }
        }        
        return mayor;
    }
    
    public int menorNumero() {
        Iterator<Integer> iteradorNumeros = this.lstNumbers.iterator();
        int menor = 0, aux;
        boolean bandera = false;      
        while (iteradorNumeros.hasNext()) {
            aux = iteradorNumeros.next();
            if (!bandera) {
                bandera = true;
                menor = aux;
            } else {
                if (aux < menor) 
                    menor = aux;
            }
        }        
        return menor;
    }
    
    public double promedioNumero() {
        int acumulador = 0;
        Iterator<Integer> iteradorNumeros = this.lstNumbers.iterator();
        while (iteradorNumeros.hasNext()) {
            acumulador += iteradorNumeros.next();
        }
        if(this.lstNumbers.isEmpty()) {
            return 0;
        } else {
            double promedio = acumulador / (this.lstNumbers.size());
            return promedio;
        }
    }

    public ArrayList<Integer> getLstNumbers() {
        return lstNumbers;
    }

    public void setLstNumbers(ArrayList<Integer> lstNumbers) {
        this.lstNumbers = lstNumbers;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
