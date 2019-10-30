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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author mdiaz
 */
public class OpcionesController implements Initializable {

    @FXML
    private Button btnREgiCL;
    @FXML
    private Button btnSalir;
    @FXML
    private Button btnRegiEmple;
    @FXML
    private Button btnReparaciones;
    @FXML
    private Button btnRegistroLocales;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnRegiCl_click(ActionEvent event) throws IOException {
        
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../vistas/vistaCliente.fxml"));
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setOnCloseRequest((WindowEvent event1) -> {
            Platform.exit();
            System.exit(0);
        });

        stage.setScene(scene);
        stage.show();

        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void btnRegEM_clic(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("../vistas/vistaEmpleado.fxml"));
        Scene scene = new Scene(root);

        stage.setOnCloseRequest((WindowEvent event1) -> {
            Platform.exit();
            System.exit(0);
        });

        stage.setScene(scene);
        stage.show();

        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void btnReparaciones_click(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("../vistas/VistaReparaciones.fxml"));
        Scene scene = new Scene(root);

        stage.setOnCloseRequest((WindowEvent event1) -> {
            Platform.exit();
            System.exit(0);
        });

        stage.setScene(scene);
        stage.show();

        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void btnRegistroLocales_click(ActionEvent event) throws IOException {
        
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("../vistas/VistaLocales.fxml"));
        Scene scene = new Scene(root);

        stage.setOnCloseRequest((WindowEvent event1) -> {
            Platform.exit();
            System.exit(0);
        });

        stage.setScene(scene);
        stage.show();

        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void btnSalir_click(ActionEvent event) {
        System.exit(0);
    }
}
