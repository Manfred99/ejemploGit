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
public class Zapato {
    private int numero;

    public Zapato() {
    }

    public Zapato(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Zapato{" + "numero=" + numero + "}";
    }
    
    
    
}
