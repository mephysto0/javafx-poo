/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
import java.util.HashMap;




/**
 *
 * @author mdiaz
 */
public class ServicioTecnico {
    
    /* declaracion de mapas */
    
    private HashMap<String,Clientes> Clmap;
    private HashMap<String,empleado> Emmap;
    private HashMap<String,Locales> Lomap;


    
    
    public ServicioTecnico() {
        Clmap = new HashMap<>();
        Emmap = new HashMap<>();
        Lomap = new HashMap<>();
    }

    /* metodos cliente*/
    
    //almacena el cliente en el mapa
    public void addCliente( Clientes nuevoCliente){
        
        if(!Clmap.containsKey(nuevoCliente.getRut())){
            Clmap.put(nuevoCliente.getRut(), nuevoCliente);
        } 
        
    }
    
    //obtengo al cliente segun el rut buscado
    public Clientes buscarCL (String rut){
        
        if(Clmap.containsKey(rut)){
            return Clmap.get(rut);
        }
        return null;
    }
    
    //elimina el cliente del mapa segun el rut ingresado
    public void eliminarCl (String rut){
        
        if(Clmap.containsKey(rut)){
            Clmap.remove(rut);
        }
    }    
    
    //retorno el mapa en una arraylist
    public ArrayList obtenerCLientes(){
        
        ArrayList<Clientes> lista = new ArrayList<>(Clmap.values());
        return lista;
    }
    



}
