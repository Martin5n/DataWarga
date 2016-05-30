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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author martin
 */
public class DataPenAddController implements Initializable {
    @FXML
    private ComboBox<?> alamatBox;
    @FXML
    private ComboBox<?> statusRumah;
    @FXML
    private ComboBox<?> statusKel;
    @FXML
    private ComboBox<?> jenisKel;
    @FXML
    private ComboBox<?> statusPernikahan;
    @FXML
    private TextField namaDep;
    @FXML
    private TextField namaBel;
    @FXML
    private TextField jenjangPen;
    @FXML
    private TextField agama;
    @FXML
    private TextField jenisPek;
    @FXML
    private TextField Kewarganegaraan;
    @FXML
    private Button BackButton;
    @FXML
    private Button submitButton;
    @FXML
    private TextField tgl;
    @FXML
    private TextField bln;
    @FXML
    private TextField thn;
    
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBack(ActionEvent event) throws Exception 
    {
        Stage stage = (Stage)BackButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("AddData.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleSubmits(ActionEvent event) throws Exception
    {
        
        
        Stage pop = new Stage();
        Parent rootPop = FXMLLoader.load(getClass().getResource("Succed.fxml"));
        pop.setScene(new Scene(rootPop));
        pop.setTitle("Data Accepted");
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(BackButton.getScene().getWindow());
        pop.showAndWait();
              
        
        Stage stage = (Stage)submitButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Screen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }
    
}
