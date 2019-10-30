/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author mdiaz
 */
public class Reparaciones{ 
        
    private String IDregistro;
    private String rutCliente;
    private String tipoEquipo;//notebook o gabinete
    private Date fechaIngresa;
    private String Comentario; //problemas del equipo o comentario relacionado al tipo de trabajo a realizar
    
    
    //get y set
    
    public String getIDregistro() {
        return IDregistro;
    }

    public void setIDregistro(String IDregistro) {
        this.IDregistro = IDregistro;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public Date getFechaIngresa() {
        return fechaIngresa;
    }

    public void setFechaIngresa(Date fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }
    
    //contructor
    public Reparaciones(String IDregistro, String rutCliente, String tipoEquipo, Date fechaIngresa, String Comentario) {
        this.IDregistro = IDregistro;
        this.rutCliente = rutCliente;
        this.tipoEquipo = tipoEquipo;
        this.fechaIngresa = fechaIngresa;
        this.Comentario = Comentario;
    }

    
    
    
        

        
    
}
