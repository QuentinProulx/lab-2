/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * GitHub Link: https://github.com/QuentinProulx/lab-2
 * @author 6324569 (Quentin Proulx)
 */
public class Lab02 extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label top = new Label("Random Game");
        Label bot = new Label("Waiting...");
        Label lblImage = new Label();
    
        StackPane middle = new StackPane(lblImage);
        BorderPane borderPane = new BorderPane(middle, top, null, bot, null);
        Scene scene = new Scene(borderPane, 250, 300);
        
        Random rand = new Random();
        int randInt = rand.nextInt(101, 121);
        Image img = new Image("file:images/" + randInt + ".jpg");
        
        lblImage.setGraphic(new ImageView(img));
        
        stage.setTitle("Java Games");
        stage.setScene(scene);
        stage.show();
    }
}
