/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.warga;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

/**
 *
 * @author martin
 */
public class DataWarga extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //SqliteConnection.createAddressDB();
        //SqliteConnection.createPendudukDB();
        
        Parent root = FXMLLoader.load(getClass().getResource("Screen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        launch(args);
    }
    
}



