package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage stage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("selectGame.fxml"));
        stage.setTitle("Color Switch");
        Scene scene1 = new Scene(root1, 500, 700);
        stage.setScene(scene1);
        stage.show();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Color Switch");
        Scene scene = new Scene(root, 500, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
