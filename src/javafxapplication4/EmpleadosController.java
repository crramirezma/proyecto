/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import Code.Empleado;
import Code.Singleton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author daniel
 */
public class EmpleadosController extends Controlador {

    @FXML
    private Button btMod;
    @FXML
    private Button btEliminar;
    @FXML
    private TextField txNombre;
    @FXML
    private TextField txApellido;
    @FXML
    private TextField txId;
    @FXML
    private TextField txTelefono;
    @FXML
    private Button btGuardar;
    @FXML
    private Font x11;
    @FXML
    private TableView<Empleado> table;
    @FXML
    private TableColumn<Empleado, String> tbNombre;
    @FXML
    private TableColumn<Empleado, Integer> tbCedula;
    @FXML
    private TableColumn<Empleado, String> tbTelefono;
    @FXML
    private TableColumn<Empleado, String> tbCargo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.tbNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.tbCedula.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.tbTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.tbCargo.setCellValueFactory(new PropertyValueFactory<>("cargo"));
        if(this.getEmpleados().size()>0){
            for(int i=0;i<this.getEmpleados().size();i++){    
                this.table.getItems().add(this.getEmpleados().get(i));
            }
        }
        
    }    

    @FXML
    private void accMod(ActionEvent event) {
    }

    @FXML
    private void accEliminar(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("EliminarEmpleado.fxml"));
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void accReturn(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Principal.fxml"));
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void btGuardar(ActionEvent event) {
    }

    
}
