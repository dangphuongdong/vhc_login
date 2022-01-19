package com.example.loginsmartw.controller;

import com.example.loginsmartw.TruyVan.CauLenhTruyVan;
import javafx.application.Application;
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

public class HelloApplication extends Application {
    private  static final  Image ten=new Image("F:\\loginSmartW\\Vector.png");
    private  static final  Image pass=new Image("F:\\loginSmartW\\Vector (1).png");
    private String mk;
    @Override
    public void start(Stage stage) throws IOException {
      /*  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    */
        Image hienthi=new Image("F:\\loginSmartW\\hienthi.png");
        Image an=new Image("F:\\loginSmartW\\an.png");

        Image image=new Image("F:\\loginSmartW\\careerbiulder 1.png");
        ImageView imageView = new ImageView(image);

        Image image1=new Image("F:\\loginSmartW\\1024 1.png");
        ImageView imageView1 = new ImageView(image1);
        ImageView Viewhienthi = new ImageView(hienthi);
        ImageView ViewAn = new ImageView(an);
        Label lbTen=new Label("  ");
        Label lbPass=new Label("  ");
        HBox hbTen=new HBox();
        HBox hbPass=new HBox();
        hbTen.getChildren().addAll(lbTen,new ImageView(ten));
        hbPass.getChildren().addAll(lbPass,new ImageView(pass));
        CustomTextField tendangnhap=new CustomTextField();
        tendangnhap.setPromptText("Tên đăng nhập");
        tendangnhap.setId("tendangnhap");
        tendangnhap.setLeft( hbTen);

        CustomPasswordField matkhau=new CustomPasswordField();
        matkhau.setPromptText("Mật khẩu");
        matkhau.setLeft(hbPass);
        matkhau.setRight(Viewhienthi);

        CustomTextField pas_text=new CustomTextField();
        Label lbPass_text=new Label("  ");
        HBox hbPass_text=new HBox();
        hbPass_text.getChildren().addAll(lbPass_text,new ImageView(pass));
        pas_text.setLeft(hbPass_text);
        pas_text.setVisible(false);
        pas_text.setRight(ViewAn);

        Viewhienthi.addEventFilter(MouseEvent.MOUSE_PRESSED, e -> {
            mk=matkhau.getText();
            pas_text.setText(mk);
            pas_text.setVisible(true);
            matkhau.setVisible(false);

        });
            ViewAn.addEventFilter(MouseEvent.MOUSE_RELEASED, e -> {
                mk=pas_text.getText();
                matkhau.setText(mk);
                matkhau.setPromptText("Mật khẩu");
                pas_text.setVisible(false);
                matkhau.setVisible(true);

            });
    
        matkhau.setId("matkhau");
        Button login=new Button("ĐĂNG NHẬP");
        login.setId("dangnhap");
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               Boolean check = CauLenhTruyVan.getUser(tendangnhap.getText(),pas_text.getText());
               Boolean check1 = CauLenhTruyVan.getUser(tendangnhap.getText(),matkhau.getText());
                    if(check ==true ||check1==true){
                       /* Label a=new Label(tendangnhap.getText());
                        Label b=new Label(matkhau.getText());
                        Label c=new Label(pas_text.getText());
                        GridPane d=new GridPane();
                        d.add(a,0,0);
                        d.add(b,0,1);
                        d.add(c,0,2);
                        Scene scene1=new Scene(d,470,640);
                        stage.setTitle("Hello!");
                        stage.setScene(scene1);
                        stage.show();*/

                        form2 f=new form2();
                        form3 f3= new form3();
                        Stage stage1=new Stage();
                        try {
                          /*  f.start(tendangnhap.getText(),matkhau.getText(),pas_text.getText());*/
                            f3.start(stage1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                    else {
                        System.out.println("sai rồi bé ơi");
                    }
                }

        });
        Label footer=new Label("Trung tâm NOC-Mobifone");
        footer.setId("footer");



        GridPane.setMargin(footer, new Insets(100, 0, 0, 0));
        GridPane gridPane=new GridPane();
        gridPane.setHgap(15);
        gridPane.setVgap(15);
        GridPane.setHalignment(imageView,HPos.CENTER);
        GridPane.setHalignment(pas_text,HPos.CENTER);
        GridPane.setHalignment(imageView1,HPos.CENTER);
        GridPane.setHalignment(tendangnhap,HPos.CENTER);
        GridPane.setHalignment(matkhau,HPos.CENTER);
        GridPane.setHalignment(login,HPos.CENTER);
        GridPane.setHalignment(footer,HPos.CENTER);

        gridPane.setPadding(new Insets(0,0,0,15));
        gridPane.add(imageView,0,0);
        gridPane.add(imageView1,0,1);
        gridPane.add(tendangnhap,0,2);
        gridPane.add(matkhau,0,3);
        gridPane.add(pas_text,0,3);
        gridPane.add(login,0,4);
        gridPane.add(footer,0,5);

       Scene scene=new Scene(gridPane,470,640);
       scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }

}