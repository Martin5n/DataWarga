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
public class SuccedController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private Stage prevStage;
    @FXML
    private Button homeButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void HandleAddMore(ActionEvent event) {
        Stage thisStage = (Stage)homeButton.getScene().getWindow();
    
        thisStage.close();
    }

    @FXML
    private void HandleHome(ActionEvent event) throws Exception {
        
    Stage stage = prevStage;
    Parent root = FXMLLoader.load(getClass().getResource("Screen.fxml"));
        
    Scene scene = new Scene(root);
        
    Stage thisStage = (Stage)homeButton.getScene().getWindow();
    
    thisStage.close();
    
    stage.setScene(scene);
    stage.show();
    
    
    
    }
    
    public void setPrevStage(Stage stage)
    {
        this.prevStage = stage;
    }
    
}
