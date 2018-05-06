package puntoDos.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import puntoDos.dominio.Numero;

/**/

@ManagedBean
@RequestScoped
public class NumeroManagedBean implements Serializable {
    private Numero numero = new Numero();
    private static ArrayList<Numero> lstNumber = new ArrayList();
    
    public NumeroManagedBean() {
        
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public ArrayList<Numero> getLstNumber() {
        return lstNumber;
    }

    public void setLstNumber(ArrayList<Numero> lstNumber) {
        this.lstNumber = lstNumber;
    }
        
    public void agregarNumero() {
        this.lstNumber.add(this.numero);
    }
}
