/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherodb.javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import superherodb.bl.Alien;
import superherodb.bl.Humano;
import superherodb.bl.Super;
import superherodb.bl.SuperServicio;

/**
 * FXML Controller class
 *
 * @author billy
 */
public class FormListaSupersController implements Initializable {
    @FXML private TableView<Super> tableView;
    @FXML private TableColumn<Super, String> nombre;
    @FXML private TextField nombreTextField;
    ObservableList<Super> data;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        SuperServicio servicio = new SuperServicio();
        
        data = FXCollections.observableArrayList(servicio.ObtenerSupers());

        nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tableView.setItems(data);           
    }    
    
    public void nuevoSuperHumano() {
        data.add(new Humano(nombreTextField.getText()));
        nombreTextField.clear();
        nombreTextField.requestFocus();
    }
    
    public void nuevoSuperAlien() {
        data.add(new Alien(nombreTextField.getText()));
        nombreTextField.clear();     
        nombreTextField.requestFocus();
    }
}
