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
public class Clientes {

    private String nombre;
    private String apellido;
    private String rut;
    private String mail;
    private String addres;
    private String phone;

    public Clientes(String nombre, String apellido, String rut, String mail, String addres, String phone) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.mail = mail;
        this.addres = addres;
        this.phone = phone;
    }

    public Clientes() {
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

    /**
     *
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     *
     * @return
     */
    public String getAddres() {
        return addres;
    }

    /**
     *
     * @param addres
     */
    public void setAddres(String addres) {
        this.addres = addres;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
