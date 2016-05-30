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
 *
 * @author martin
 */
public class ScreenController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button SearchButton;
    @FXML
    private Button DataButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleButtonActionData(ActionEvent event) throws Exception
    {
        Stage stages = (Stage)DataButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Data.fxml"));
        
        Scene scene = new Scene(root);
        stages.setScene(scene);
        stages.show();
            
    }
        
    @FXML
    private void handleButtonActionSearch(ActionEvent event) {
    }

    
    
    
    
    
}
