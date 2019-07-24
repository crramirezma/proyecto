/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import Code.Persona;
import Code.Singleton;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class EliminarEmpleadoController extends Controlador {

    @FXML
    private Label txName;
    @FXML
    private TextField txId;
    @FXML
    private Button escoger;
    @FXML
    private Button eliminar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accEsc(ActionEvent event) {
        int j=0;
        if(getEmpleados().size()>0){
            for(int i=0;i<getEmpleados().size();i++){
                if(getEmpleados().get(i).getId()==Integer.parseInt(this.txId.getText())){
                    
                    this.txName.setText("el Empleado a eliminar es \n"+this.getEmpleados().get(i).getNombre());
                    i=getEmpleados().size();
                    j=1;
                }
            }
        }if(j==0){
            JOptionPane.showMessageDialog(null,"No se encontro el usuario","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    private void accEliminar(ActionEvent event) {
        int j=0;
        if(getEmpleados().size()>0){
            for(int i=0;i<getEmpleados().size();i++){
                if(getEmpleados().get(i).getId()==Integer.parseInt(this.txId.getText())){
                    for(int k=0;k<tienda.getPersonas().size();k++){
                        if(tienda.getPersonas().get(k).equals(getEmpleados().get(i))){
                            ArrayList<Persona>personas=this.tienda.getPersonas();
                            personas.remove(k);
                            this.tienda.setPersonas(personas);
                            JOptionPane.showMessageDialog(null,"Usuario eliminado","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    
                    i=getEmpleados().size();
                    j=1;
                }
            }
        }
        if(j==0){
            JOptionPane.showMessageDialog(null,"no se pudo eliminar el empleado","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    private void accReturn(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Empleados.fxml"));
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
}
