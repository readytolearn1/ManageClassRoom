package edu.manageclassroom.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DefaultScene {


    StackPane pane = new StackPane();

    public Scene createSceneAtbutton(Stage stage) {
        return new Scene(pane);
    }



}
