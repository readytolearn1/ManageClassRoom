package edu.manageclassroom.controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ChangeSceneEvent implements EventHandler<Event> {
    private final RunnableApp app;

    public ChangeSceneEvent() {
        this.app = new RunnableApp();
    }

    @Override
    public void handle(Event event) {
        System.out.println("j'ai fais un clic sur new salle");
        System.out.println(((Button)event.getSource()).getText());
        if(((Button)event.getSource()).getText().equals("Nuova aula")){
            getNewSalle();
        } else if(((Button)event.getSource()).getText().equals("Nuovo Insegnante")){
            getNewTeacher();
        } else if(((Button)event.getSource()).getText().equals("Nuova Prenotazione")){
            getNewReservation();
        } else{
            getNullScene();
        }
    }

    private void getNewSalle(){
        app.setNewSceneInStage(new Scene(new Pane(new Button("hello new salle"))));
    }

    private void getNewTeacher(){
        app.setNewSceneInStage(new Scene(new Pane(new Button("hello new teacher"))));
    }

    private void getNewReservation(){
        app.setNewSceneInStage(new Scene(new Pane(new Button("hello new reservation"))));
    }

    private void getNullScene(){
        app.setNewSceneInStage(new Scene(new Pane(new Button("Error scene"))));
    }
}
