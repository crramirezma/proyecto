/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import Code.Proovedor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class ProveedorController implements Initializable {

    @FXML
    private TableView<?> tablaPersonas;
    @FXML
    private TableColumn<Proovedor, String> nombreCL;
    @FXML
    private TableColumn<Proovedor, String> celularCL;
    @FXML
    private TableColumn<Proovedor, Integer> idCL;
    @FXML
    private TableColumn<?, ?> calificacionCL;
    @FXML
    private Button btGuardar;
    @FXML
    private Font x11;
    @FXML
    private Font x1;
    @FXML
    private TextField nombreTF;
    @FXML
    private TextField celularTF;
    @FXML
    private TextField idTF;
    @FXML
    private Button aniadirBT;
    @FXML
    private Button eliminarBT;
    @FXML
    private Font x12;
    @FXML
    private Font x13;
    @FXML
    private Button eliminarBT1;
    @FXML
    private Font x14;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btGuardar(ActionEvent event) {
    }

    @FXML
    private void aniadir(ActionEvent event) {
    }

    @FXML
    private void accEliminar(ActionEvent event) {
    }

    @FXML
    private void accReturn(ActionEvent event) {
    }

    @FXML
    private void accSel(ActionEvent event) {
    }

    @FXML
    private void accBuscar(ActionEvent event) {
    }
    
}
