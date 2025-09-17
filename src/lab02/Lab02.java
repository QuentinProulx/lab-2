/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author 6324569
 */
public class Lab02 extends Application {
    Label top = new Label("Random Game");
    Label bot = new Label("Waiting...");
    Label lblImage = new Label();
    
    StackPane middle = new StackPane(lblImage);
    BorderPane borderPane = new BorderPane(middle, top, null, bot, null);
    Scene scene = new Scene(borderPane, 250, 300);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Java Games");
        stage.setScene(scene);
        stage.show();
    }
}
