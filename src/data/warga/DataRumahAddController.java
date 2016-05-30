/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.warga;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.sql.*;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author martin
 */
public class DataRumahAddController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private Button BackButton;
    @FXML
    private TextField rt;
    @FXML
    private TextField jalan;
    @FXML
    private TextField rw;
    @FXML
    private TextField no;
    @FXML
    private TextField block;
    @FXML
    private TextField pemilik;
    @FXML
    private TextField telepon;
    @FXML
    private ComboBox status;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        List<String> statusList = new ArrayList<>();
        statusList.add("Sendiri");
        statusList.add("Kontrak");
        statusList.add("Kost");
        //ObservableList obList = FXCollections.observableList(statusList);
        
        status.getItems().addAll("Sendiri","Kontrak","Kost");
        status.setValue("Sendiri");
        
        //status.setItems(obList);
    }    

    @FXML
    private void handleButtonBack(ActionEvent event) throws Exception
    {
        Stage stage = (Stage)BackButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("AddData.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleSubmit(ActionEvent event) throws Exception
    {
        Statement stmt = null;
        Connection c = SqliteConnection.wargaConnector();
       try
        { 
            int tRT = Integer.parseInt(rt.getText());
            int tRW = Integer.parseInt(rw.getText());
            String tJalan = jalan.getText();
            String tBlock = block.getText();
            int tNo = Integer.parseInt(no.getText());
            String tPem = pemilik.getText();
            String tStat = status.getValue().toString();
            String tTelepon = telepon.getText();


            stmt = c.createStatement();
            String sql = "INSERT INTO RUMAH (RT,RW,JALAN,BLOCK,NO,PEMILIK,STATUS,TELEPON) " +
                         "VALUES (" +tRT+ ", "+tRW+" ,' "+tJalan+" ' , ' " + tBlock + " ' ," + tNo + " , '"+ tPem+ "' , '"+ tStat+" ',' " + tTelepon+ "' );"; 
            stmt.executeUpdate(sql);
            
            Stage pop = new Stage();
            FXMLLoader forPop = new FXMLLoader(getClass().getResource("Succed.fxml"));
            Pane rootPop = (Pane)forPop.load();
            
            Scene scene = new Scene(rootPop);
            
            SuccedController suc = (SuccedController) forPop.getController();
            
            Stage thisStage = (Stage)BackButton.getScene().getWindow();
            
            suc.setPrevStage(thisStage);
            
            /*pop.setTitle("Data Accepted");
            pop.initModality(Modality.APPLICATION_MODAL);
            pop.initOwner(BackButton.getScene().getWindow());
            pop.showAndWait();
            */
            
            pop.setScene(scene);
            pop.showAndWait();
            
            rt.clear();
            rw.clear();
            jalan.clear();
            block.clear();
            no.clear();
            pemilik.clear();
            telepon.clear();
           
        }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
        
        
        
        
    }
    
}
