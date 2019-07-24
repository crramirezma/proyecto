/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import Code.Persona;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
                    i=getEmpleados().size();
                    this.txName.setText("el Empleado a eliminar es \n"+this.getEmpleados().get(i).getNombre());
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
                    i=getEmpleados().size();
                    j=1;
                    ArrayList<Persona>personas=this.tienda.getPersonas();
                    personas.remove(i);
                    this.tienda.setPersonas(personas);
                }
            }
        }
        if(j==0){
            JOptionPane.showMessageDialog(null,"no se pudo eliminar el empleado","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
