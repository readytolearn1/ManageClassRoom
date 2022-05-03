package edu.managementclassroom;

import edu.managementclassroom.controller.RunAppControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class MyApplication extends Application {
    public static void main(String... args) {
        launch(MyApplication.class, args);
    }

    @Override
    public void start(Stage stage) {
        new RunAppControl(stage);
    }
}
