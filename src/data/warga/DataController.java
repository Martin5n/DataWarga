/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.warga;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author martin
 */
public class DataController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private Button EditButton;
    @FXML
    private Button BackButton;
    @FXML
    private Button AddButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void handleButtonBack(ActionEvent event) throws Exception
    {
        Stage stage = (Stage)EditButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Screen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();          
        
    }

    @FXML
    private void handleButtonActionEdit(ActionEvent event) {
    }

    @FXML
    private void handleButtonActionAdd(ActionEvent event) throws Exception
    {
        Stage stage = (Stage)EditButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("AddData.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();          
        
    }
    
}
