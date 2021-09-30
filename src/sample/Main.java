package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        Button button = new Button("Change color");
        button.setPrefSize(100,50);

        TextField t = new TextField();

        Label l = new Label("test label");

        StackPane pane = new StackPane();
        pane.getChildren().add(t);
        pane.getChildren().add(button);
        pane.getChildren().add(l);
        pane.setAlignment(button, Pos.CENTER);
        pane.setAlignment(t, Pos.TOP_CENTER);
        pane.setAlignment(l,Pos.BOTTOM_CENTER);

        button.setOnAction(value -> {
            int rand = (int)(Math.random()*1000000);
            pane.setStyle("-fx-background-color: #"+rand);
        });

        primaryStage.setScene(new Scene(pane, 600, 475));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
