/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author OSCAR
 */
public class Deportivo extends Zapato {

    private String tipoDeporte;
    
    
    public Deportivo() {
        super();
    }

    public Deportivo(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public Deportivo(String tipoDeporte, int numero) {
        super(numero);
        this.tipoDeporte = tipoDeporte;
    }

    @Override
    public String toString() {
        return super.toString()+" Deportivo{" + "tipoDeporte=" + tipoDeporte + '}';
    }

    
    
    
}
