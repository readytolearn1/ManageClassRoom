package edu.manageclassroom.controller;


import edu.manageclassroom.view.AllScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class RunnableApp extends Application {
    private static Stage mainContainer;
    public static Stage getMainContainerInstance(){
        if(mainContainer == null){
            mainContainer = new Stage();
            mainContainer.setTitle("ManageClass-App");
            mainContainer.setWidth(400);
            mainContainer.setHeight(300);
        }
        return mainContainer;
    }

    public void setNewSceneInStage(Scene scene){
        RunnableApp.getMainContainerInstance().setScene(scene);
    }

    @Override
    public void start(Stage stage) {
        RunnableApp.getMainContainerInstance().setScene(AllScene.getSceneInstance());
        RunnableApp.getMainContainerInstance().show();
    }
}
