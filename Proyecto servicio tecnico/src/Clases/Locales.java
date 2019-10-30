/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author mdiaz
 */
public class Locales {
    
    private String IDLocal;
    private String nombreLocal;
    private String region;
    
    private ArrayList<Reparaciones> listaReparacion = new ArrayList<>();

    public Locales(String id, String nombreLc, String Region) {
    }

    public Locales() {
        
    }
    
    // get y set
    
    public String getIDLocal() {
        return IDLocal;
    }

    public void setIDLocal(String IDLocal) {
        this.IDLocal = IDLocal;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ArrayList<Reparaciones> getListaReparacion() {
        return listaReparacion;
    }

    public void setListaReparacion(ArrayList<Reparaciones> listaReparacion) {
        this.listaReparacion = listaReparacion;
    }
    
    //metodos
    
   public void addRegistro(Reparaciones nuevareparacion){
       listaReparacion.add(nuevareparacion);
   }
    
    
}
