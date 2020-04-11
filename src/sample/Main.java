package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        //primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("icon.png"))) ;
        Image anotherIcon = new Image("/sample/icon.png");

        primaryStage.getIcons().add(anotherIcon);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 300));


        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
