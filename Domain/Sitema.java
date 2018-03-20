/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author OSCAR
 */
public class Sitema {
    private String nombre;
    private ArrayList<Organo>organos;

    public Sitema(String nombre, ArrayList<Organo> organos) {
        this.nombre = nombre;
        this.organos = organos;
    }

    public Sitema() {
       
   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
    }

    
    public void imprimir() {
        //return "Sitema{" + "nombre=" + nombre + ", organos=" + organos + "}";
        System.out.println("Sistema: "+this.nombre);
       for(int i=0;i<this.getOrganos().size();i++){
           System.out.println(this.getOrganos().get(i).toString());
        }
    }
    
    
    
    
}
