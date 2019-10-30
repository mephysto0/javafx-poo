/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mdiaz
 */
public class VistaReparacionController implements Initializable {

    @FXML
    private TableView<?> ListaReparacion;
    @FXML
    private Button btnVolver;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnEliminar;
    @FXML
    private TextField txtRut;
    @FXML
    private ChoiceBox<?> ChoiceTipoEquipo;
    @FXML
    private DatePicker FechaIngreso;
    @FXML
    private TextArea Comentario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnVolverClick(ActionEvent event) {
    }

    @FXML
    private void btnAbregarClick(ActionEvent event) {
    }

    @FXML
    private void btnModificarClick(ActionEvent event) {
    }

    @FXML
    private void btnEliminarClick(ActionEvent event) {
    }
    
}
