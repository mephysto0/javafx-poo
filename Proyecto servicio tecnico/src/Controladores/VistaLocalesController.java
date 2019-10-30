/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author mdiaz
 */
public class VistaLocalesController implements Initializable {

    @FXML
    private TableView<?> ListaLocales;
    @FXML
    private TextField txtNombreLc;
    @FXML
    private TextField txtRegionLc;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnVolver;
    @FXML
    private Button bntEliminar;

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
    private void btnAgregarClick(ActionEvent event) {
    }

    @FXML
    private void btnModificaClick(ActionEvent event) {
    }

    @FXML
    private void btnEliminarClick(ActionEvent event) {
    }
    
      @FXML
    private void btnVolverClick(ActionEvent event) throws IOException {
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
