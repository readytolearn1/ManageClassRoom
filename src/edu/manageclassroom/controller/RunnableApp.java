package edu.manageclassroom.controller;

import edu.manageclassroom.model.*;
import edu.manageclassroom.view.AllScene;
import edu.manageclassroom.view.DefaultScene;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class RunnableApp extends Application {
    private static Stage mainContainer;

    public static void run(String... args) {

        try {
            launch(args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Stage getMainContainerInstance(){
        if(mainContainer == null){
            mainContainer = new Stage();
            mainContainer.setTitle("ManageClass-App");
            mainContainer.setWidth(400);
            mainContainer.setHeight(300);
        }
        return mainContainer;
    }

    @Override
    public void start(Stage stage) {
        RunnableApp.getMainContainerInstance().setScene(AllScene.getSceneInstance());
        RunnableApp.getMainContainerInstance().show();
    }
}
