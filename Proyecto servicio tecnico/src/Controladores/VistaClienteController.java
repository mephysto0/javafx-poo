/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Clases.Clientes;
import Clases.ServicioTecnico;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author mdiaz
 */
public class VistaClienteController implements Initializable {

    private ServicioTecnico sv;

    @FXML
    private Button btnvolver;
    @FXML
    private Button btnnagregarcliente;
    @FXML
    private Button btnEliminarCL;
    @FXML
    private Button btnModificarCL;
    @FXML
    private TableView<Clientes> listaCLiente;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtRut;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtDireecion;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TableColumn<Clientes, String> ColNombre;
    @FXML
    private TableColumn<Clientes, String>ColApellido;
    @FXML
    private TableColumn<Clientes, String> ColRut;
    @FXML
    private TableColumn<Clientes, String> ColCorreo;
    @FXML
    private TableColumn<Clientes, String> ColDireecion;
    @FXML
    private TableColumn<Clientes, String> ColTelefono;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sv = new ServicioTecnico();
        
        
        ColNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        ColApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        ColRut.setCellValueFactory(new PropertyValueFactory<>("rut"));
        ColCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        ColDireecion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        ColTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        
        
       listaCLiente.setItems(FXCollections.observableArrayList(sv.obtenerCLientes()));
    
        
    }

    @FXML
    private void btnnagregacliente_click(ActionEvent event) {

        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String rut = txtRut.getText();
        String correo = txtCorreo.getText();
        String direccion = txtDireecion.getText();
        String telefono = txtTelefono.getText();

        Clientes nuevoCLiente = new Clientes(nombre, apellido, rut, correo, direccion, telefono);
        sv.addCliente(nuevoCLiente);
        listaCLiente.setItems(FXCollections.observableArrayList(sv.obtenerCLientes()));
     
        
    }

    @FXML
    private void btnEliminarCL_click(ActionEvent event) {
    }

    @FXML
    private void btnmodificarCL_click(ActionEvent event) {
    }

    @FXML
    private void btnVolver_click(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("../vistas/opciones.fxml"));
        Scene scene = new Scene(root);

        stage.setOnCloseRequest((WindowEvent event1) -> {
            Platform.exit();
            System.exit(0);
        });

        stage.setScene(scene);
        stage.show();

        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
    
     public ObservableList<Clientes> getCliente(){
        ObservableList<Clientes> Cli;
        Cli = FXCollections.observableArrayList(sv.obtenerCLientes());

        
        //Cli = FXCollections.observableArrayList();
        
       // Cli.add(new Clientes("hola", "hola", "hola", "hola", "hola", "hola"));
       // Cli.add(new Clientes("hola", "hola", "hola", "hola", "hola", "hola"));
       // Cli.add(new Clientes("1", "2", "3", "4", "5", "6"));//
        return Cli;
    }
    
}
