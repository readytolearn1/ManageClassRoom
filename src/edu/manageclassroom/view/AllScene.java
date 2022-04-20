package edu.manageclassroom.view;

import edu.manageclassroom.controller.NewSalle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AllScene {
    private static HBox hBox;
    private static VBox vBox;
    private static Pane pane;
    private static StackPane stackPane;
    private static Scene scene;

//questi sono degli istanze cui creo dei singleton per salvare il valore delle proprietà anzi che crearle di nuovo ogni volta.
    public static HBox getHBoxInstance(){
        if (AllScene.hBox == null){
            AllScene.hBox = new HBox();
        }
        return AllScene.hBox;
    }
    public static VBox getVBoxInstance(){
        if (AllScene.vBox == null){
            AllScene.vBox = new VBox();
        }
        return AllScene.vBox;
    }
    public static Pane getPaneInstance(){
        if (AllScene.pane == null){
            AllScene.pane = new Pane();
        }
        return AllScene.pane;
    }
    public static StackPane getStackPaneInstance(){
        if (AllScene.stackPane == null){
            AllScene.stackPane = new StackPane();
        }
        return AllScene.stackPane;
    }

    //funzione che cambia il valore della scena
    public static void setSceneInstance(Scene sceneUpdate){
        if(AllScene.scene == null){
            AllScene.scene = sceneUpdate;
        }
    }
    //instance scene
    public static Scene getSceneInstance(){
        if (AllScene.scene == null){
            AllScene update = new AllScene();
            AllScene.setSceneInstance(update.Home());
        }
        return AllScene.scene;
    }


    public Scene Home (){
        Button newSalle = new Button("Nuova aula");
        newSalle.addEventHandler(MouseEvent.MOUSE_CLICKED,new NewSalle());
        Button newTeacher = new Button("Nuovo Insegnante");
        Button newReservation = new Button("Nuova Prenotazione");

        AllScene.getHBoxInstance().getChildren().addAll(newSalle,newTeacher,newReservation);
        AllScene.getHBoxInstance().setSpacing(9);
        AllScene.getHBoxInstance().setAlignment(Pos.CENTER);
        //Scene test = new Scene(hBox);--> cui per esempio creo una variabile di tipo scene con nome test facendo l'istanziazione creo u figlio della classe scene che registro nella variabile test
        AllScene.setSceneInstance(new Scene(hBox));
        return AllScene.getSceneInstance();
    }
}
