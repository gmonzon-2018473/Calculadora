/*
Programador: Gonzalo Monzón

Documentación:
Incicio: 19/04/2021
Fin: 22/04/2021
*/

package org.gonzalomonzon.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.stage.Stage;


public class Principal extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Calculadora Gonzalo Monzón");  
        stage.setResizable(true); 
        stage.getIcons().add(new Image("/org/gonzalomonzon/images/calculadora.png"));
        stage.show();
        
        
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
