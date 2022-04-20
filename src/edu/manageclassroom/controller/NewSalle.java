package edu.manageclassroom.controller;

import edu.manageclassroom.view.AllScene;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class NewSalle implements EventHandler<Event> {

    @Override
    public void handle(Event event) {

        System.out.println("j'ai fais un clic sur new salle");
        AllScene.setSceneInstance(new Scene(new Pane()));
    }
}
