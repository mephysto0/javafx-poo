/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Clases.Clientes;
import Clases.Locales;
import Clases.ServicioTecnico;
import Clases.empleado;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author mdiaz
 */
public class LoginController implements Initializable {

    private final ServicioTecnico sv = new ServicioTecnico();
    //private final empleado emp = new empleado();
    //private final Clientes cl = new Clientes();
   // private final Locales lc = new Locales();
    
    @FXML
    private AnchorPane login;
    @FXML
    private PasswordField txtContraseña;
    @FXML
    private TextField txtUsuario;
    @FXML
    private Button bttlogin;
    @FXML
    private Button btnsalir;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bttlogin_click(ActionEvent event) throws IOException {

        String rut = txtUsuario.getText();
        String pass = txtContraseña.getText();
        
        //if(emp.validarRut(rut)){
            
           // if (pass.equals(sv.buscarEm(rut).getContraseña())) {
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
                
                ((Node)(event.getSource())).getScene().getWindow().hide();
           // }
        //}
       // JOptionPane.showMessageDialog(null, "Usuario o rut incorrecto");
    }

    @FXML
    private void btnsalir_click(ActionEvent event) {
        System.exit(0);
    }
    
}
