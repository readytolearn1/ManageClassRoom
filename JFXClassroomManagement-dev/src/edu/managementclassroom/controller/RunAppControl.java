package edu.managementclassroom.controller;

import edu.managementclassroom.view.ApplicationScenes;
import javafx.stage.Stage;

public class RunAppControl {
    private static Stage mainContainer;

    public RunAppControl(Stage stage) {
        this.setMainContainerInstance(stage);
        mainContainer.setScene(new ApplicationScenes().getSceneInstance());
        mainContainer.show();
    }

    public static Stage getMainContainerInstance() {
        return mainContainer;
    }

    private void setMainContainerInstance(Stage stage) {
        if (mainContainer == null) {
            mainContainer = stage;
            mainContainer.setTitle("My Management-classroom software");
            mainContainer.setResizable(false);
            mainContainer.setFullScreen(false);
            mainContainer.setWidth(800.0);
            mainContainer.setHeight(800.0);
        }
    }
}
