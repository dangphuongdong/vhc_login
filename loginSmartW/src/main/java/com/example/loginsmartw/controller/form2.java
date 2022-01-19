package com.example.loginsmartw.controller;

import com.example.loginsmartw.TruyVan.CauLenhTruyVan;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.controlsfx.control.textfield.CustomPasswordField;
import org.controlsfx.control.textfield.CustomTextField;

import java.io.IOException;

import static javafx.application.Application.launch;

public class form2 {

    public void start(String username,String password,String pass_text) throws IOException {
      /*  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    */
        Stage stage=new Stage();
        Label user=new Label(username);
        Label pass=new Label(password);
        Label pass_t=new Label(pass_text);
        GridPane gridPane=new GridPane();
        gridPane.add(user,0,0);
        gridPane.add(pass,0,1);
        gridPane.add(pass_t,0,1);
        Scene scene=new Scene(gridPane,470,640);
        scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("Hello!");

        stage.show();
    }

}
