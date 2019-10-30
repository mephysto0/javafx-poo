/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mdiaz
 */
public class empleado {
    
    
    private String nombre;
    private String apellido;
    private String rut;
    private String contraseña;
    private String idLocal;
    private Boolean admin;

    public empleado(String nombre, String apellido, String rut, String contraseña, String idLocal, Boolean admin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.contraseña = contraseña;
        this.idLocal = idLocal;
        this.admin = admin;
    }

    public empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(String idLocal) {
        this.idLocal = idLocal;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    
}


    

