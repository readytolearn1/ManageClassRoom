package edu.managementclassroom.controller;

import edu.managementclassroom.view.ApplicationScenes;
import edu.managementclassroom.view.ButtonTextName;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SwitchSceneControl implements EventHandler<MouseEvent> {
    private final Stage mainContainer;

    public SwitchSceneControl() {
        this.mainContainer = RunAppControl.getMainContainerInstance();
    }

    private void getSceneAddClassroom() {
        mainContainer.setScene(new Scene(new ApplicationScenes().AddClassroomScene()));
    }

    private void getSceneAddTeacher() {
        mainContainer.setScene(new Scene(new ApplicationScenes().AddTeacherScene()));
    }

    private void getSceneAddBooking() {
        mainContainer.setScene(new Scene(new ApplicationScenes().AddBookingScene()));
    }

    private void getOtherScene() {
        mainContainer.setScene(new Scene(new ApplicationScenes().AddOtherScene()));
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (((Button) event.getSource()).getText().equals(ButtonTextName.ADD_CLASSROOM.getTextInButton())) {
                getSceneAddClassroom();
            } else if (((Button) event.getSource()).getText().equals(ButtonTextName.ADD_TEACHER.getTextInButton())) {
                getSceneAddTeacher();
            } else if (((Button) event.getSource()).getText().equals(ButtonTextName.ADD_BOOKING.getTextInButton())) {
                getSceneAddBooking();
            } else {
                getOtherScene();
            }
        }
    }
}
