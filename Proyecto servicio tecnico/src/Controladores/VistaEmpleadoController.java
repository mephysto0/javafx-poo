/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Clases.ServicioTecnico;
import Clases.empleado;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author mdiaz
 */
public class VistaEmpleadoController implements Initializable {
    private ServicioTecnico sv;

    @FXML
    private Button btnnagregarempleado;
    @FXML
    private Button btnModificarEmp;
    @FXML
    private Button btnEliminarEmp;
    @FXML
    private Button btnVolver;
    @FXML
    private TextField txtRut;
    @FXML
    private TableView<empleado> listaEmpleados;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtLocal;
    @FXML
    private ComboBox<?> comboboxAdmin;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sv = new ServicioTecnico();
     
        
    }    

    @FXML
    private void btnnagregaEMple_click(ActionEvent event) {
    }

    @FXML
    private void btnmodificarEmp_click(ActionEvent event) {
    }

    @FXML
    private void btnEliminarEmp_click(ActionEvent event) {
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
    
}
