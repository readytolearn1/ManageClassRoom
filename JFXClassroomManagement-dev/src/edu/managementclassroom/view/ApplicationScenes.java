package edu.managementclassroom.view;

import edu.managementclassroom.controller.SwitchSceneControl;
import java.awt.*;
import java.nio.charset.CharacterCodingException;
import java.util.Objects;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.ComboBoxTreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import lombok.Getter;
import lombok.Setter;
import org.controlsfx.control.CheckComboBox;

@Getter
@Setter
public class ApplicationScenes {
      private static HBox hBox;
      private VBox vBox;
      private static Pane pane;
      private static StackPane stackPane;
      private static Scene scene;
      private static final Button HOME_BUTTON = new Button();
      private static final ImageView HOME_IMAGE_VIEW = new ImageView();
      private static final HBox buttonHomeHBox = new HBox();

      public ApplicationScenes() {
            this.vBox = new VBox();
            if (this.getSceneInstance() == null) {
                  this.setSceneInstance(this.homeScene());
                  Image svgIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("icons/home.png")));
                  HOME_IMAGE_VIEW.setImage(svgIcon);
                  HOME_IMAGE_VIEW.setFitWidth(30.5);
                  HOME_IMAGE_VIEW.setFitHeight(30.5);
                  HOME_BUTTON.setGraphic(HOME_IMAGE_VIEW);
                  buttonHomeHBox.getChildren().add(HOME_BUTTON);
                  HOME_BUTTON.setStyle("-fx-focus-color: white; -fx-faint-focus-color: white");
                  HOME_BUTTON.addEventHandler(MouseEvent.MOUSE_CLICKED, new SwitchSceneControl());
            }
      }

      public HBox getHBoxInstance() {
            if (hBox == null) {
                  hBox = new HBox();
                  hBox.setPadding(new Insets(20));
            }
            return hBox;
      }

      public Pane getPaneInstance() {
            if (pane == null) {
                  pane = new Pane();
            }
            return pane;
      }

      public StackPane getStackPaneInstance() {
            if (stackPane == null) {
                  stackPane = new StackPane();
            }
            return stackPane;
      }

      private void setSceneInstance(Parent parentUpdate) {
            if (scene == null) {
                  scene = new Scene(parentUpdate);
            }
      }

      public Scene getSceneInstance() {
            return scene;
      }

      private Parent homeScene() {
            Button addClassroom = new Button(ButtonTextName.ADD_CLASSROOM.getTextInButton());
            Button addTeacher = new Button(ButtonTextName.ADD_TEACHER.getTextInButton());
            Button addBooking = new Button(ButtonTextName.ADD_BOOKING.getTextInButton());
            addClassroom.setStyle("-fx-focus-color: white; -fx-faint-focus-color: #ffffff");
            addTeacher.setStyle("-fx-focus-color: white; -fx-faint-focus-color: white");
            addBooking.setStyle("-fx-focus-color: white; -fx-faint-focus-color: white");

            addClassroom.setMinWidth(40);
            addTeacher.setMinWidth(40);
            addBooking.setMinWidth(40);
            addClassroom.setMinHeight(40);
            addTeacher.setMinHeight(40);
            addBooking.setMinHeight(40);

            this.getHBoxInstance().getChildren().addAll(buttonHomeHBox, addClassroom, addTeacher, addBooking);
            this.getHBoxInstance().setSpacing(10.5);
            this.getHBoxInstance().setAlignment(Pos.TOP_CENTER);

            //MouseEvent is a EventType because heritage is associate this both class.
            addClassroom.addEventHandler(MouseEvent.MOUSE_CLICKED, new SwitchSceneControl());
            addTeacher.addEventHandler(MouseEvent.MOUSE_CLICKED, new SwitchSceneControl());
            addBooking.addEventHandler(MouseEvent.MOUSE_CLICKED, new SwitchSceneControl());

            return this.getHBoxInstance();
      }

      public Parent AddClassroomScene() {

            GridPane classroom = new GridPane();

            Label nameLabel = new Label("Classroom Name");
            TextField nameText = new TextField();

            Label capaciteLabel = new Label("Seats Number");
            TextField capaciteLabelText = new TextField();
            capaciteLabelText.textProperty().addListener((observable,oldValue,newValue) -> {
                  if (!newValue.matches("[0-9]")){
                        //System.out.println("error");
                        capaciteLabelText.setText(newValue.replaceAll("[^\\d]",""));
                  }
            });
            Label typeLabel = new Label("Room Type");
            ChoiceBox typechoiceBox = new ChoiceBox();
            typechoiceBox.getItems().addAll("Computer LAb", "Teachers Room", "Simple Room", "cafeteria", "Study Room", "Conference Room");

            Label equipementLabel = new Label("Room Equipment");

            ObservableList<String> equipmentList = FXCollections.observableArrayList();
            equipmentList.addAll("Projector","Computer", "Board","Seats","Microwave","Microphone");
            CheckComboBox<String>  rootEquipmentItem= new CheckComboBox<>(equipmentList);
            Button buttonRegister = new Button("Register");




            classroom.setMinSize(600, 600);
            classroom.setPadding(new Insets(20, 20, 20, 20));
            classroom.setAlignment(Pos.BASELINE_CENTER);

            classroom.add(nameLabel, 0, 1);
            classroom.add(nameText, 1, 1);
            classroom.add(capaciteLabel, 0, 2);
            classroom.add(capaciteLabelText, 1, 2);
            classroom.add(typeLabel, 0, 6);
            classroom.add(typechoiceBox, 1, 6);
            classroom.add(equipementLabel, 0, 7);
            classroom.add(rootEquipmentItem, 1, 7);
            classroom.add(buttonRegister, 2, 8);
            buttonRegister.setPrefHeight(20);
            buttonRegister.setDefaultButton(true);
            buttonRegister.setPrefWidth(100);

            classroom.setVgap(10.5);
            classroom.setHgap(10.5);


            nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
            capaciteLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
            typeLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
            equipementLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
            buttonRegister.setStyle("-fx-focus-color: white; -fx-faint-focus-color: white ");

            classroom.getChildren();

            this.vBox.getChildren().addAll(this.getHBoxInstance(), classroom);
            return this.vBox;
      }

      public Parent AddTeacherScene() {

            GridPane teacher = new GridPane();

            Label nomeLabel = new Label("Name Teacher");
            TextField nomeText = new TextField();
            Label matricolaLabel = new Label("Registration Number");
            TextField matricolaText = new TextField();
            Button buttonRegister = new Button("Register");
            buttonRegister.setPrefHeight(20);
            buttonRegister.setDefaultButton(true);
            buttonRegister.setPrefWidth(100);

            teacher.setMinSize(600, 600);
            teacher.setPadding(new Insets(40, 40, 40, 40));
            teacher.setAlignment(Pos.CENTER);

            teacher.add(nomeLabel, 0, 1);
            teacher.add(nomeText, 1, 1);
            teacher.add(matricolaLabel, 0, 2);
            teacher.add(matricolaText, 1, 2);
            teacher.add(buttonRegister, 2, 3);


            teacher.setVgap(10);
            teacher.setHgap(10);

            nomeLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
            matricolaLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

            teacher.getChildren();

            this.vBox.getChildren().addAll(this.getHBoxInstance(), teacher);
            return this.vBox;
      }

      public Parent AddBookingScene() {
            this.vBox.getChildren().addAll(this.getHBoxInstance());
            return this.vBox;
      }

      public Parent AddOtherScene() {
            GridPane homePage = new GridPane();
            Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("icons/last.jpg")));
            BackgroundSize bgSize = new BackgroundSize(780, 750.0,false,false,false,false);
            BackgroundImage bImg = new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,bgSize);
            homePage.setBackground(new Background(bImg));
            homePage.setMinWidth(600.0);
            homePage.setMinHeight(600.0);
            this.vBox.getChildren().addAll(this.getHBoxInstance(), homePage);
            return this.vBox;
      }
}
