package com.example.loginsmartw.controller;


import com.example.loginsmartw.Models.Model;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;

public class form3 extends HelloApplication {

    public void start() throws IOException {
       /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);*/

        TableView<Model> modelTableView=new TableView<>();
        modelTableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        TableColumn<Model, Void> stt=new TableColumn<>("STT");
        stt.setCellFactory(indexCellFactory());

        TableColumn<Model,String> serverity=new TableColumn<>("Severity");
        TableColumn<Model,String> ne=new TableColumn<>("NE");
        TableColumn<Model,String> loaithietbi=new TableColumn<>("Loại thiết bị");
        TableColumn<Model,String> batdau=new TableColumn<>("Bắt đầu");
        TableColumn<Model,String> ngaytao=new TableColumn<>("Ngày tạo");
        TableColumn<Model,String> mien=new TableColumn<>("Miền");
        TableColumn<Model,String> canhbao=new TableColumn<>("Cảnh báo");
        TableColumn<Model,String> dai=new TableColumn<>("Đài");
        TableColumn<Model,String> to=new TableColumn<>("Tổ ");
        TableColumn<Model,String> tinh=new TableColumn<>("Tỉnh");
        TableColumn<Model,String> huyen=new TableColumn<>("Huyện");

        TableColumn<Model, CheckBox> all=new TableColumn<Model, CheckBox>();


        all.setCellValueFactory( new PropertyValueFactory<>("all") );
        all.setId("all");
        serverity.setCellValueFactory( new PropertyValueFactory<>("severity") );
        ne.setCellValueFactory( new PropertyValueFactory<>("ne") );
        loaithietbi.setCellValueFactory( new PropertyValueFactory<>("loaiThietBi") );
        batdau.setCellValueFactory( new PropertyValueFactory<>("batDau") );
        ngaytao.setCellValueFactory( new PropertyValueFactory<>("ngayTao") );
        mien.setCellValueFactory( new PropertyValueFactory<>("mien") );
        canhbao.setCellValueFactory( new PropertyValueFactory<>("canhBao") );
        dai.setCellValueFactory( new PropertyValueFactory<>("dai") );
        to.setCellValueFactory( new PropertyValueFactory<>("to") );
        tinh.setCellValueFactory( new PropertyValueFactory<>("tinh") );
        huyen.setCellValueFactory( new PropertyValueFactory<>("huyen") );

        ObservableList<Model> list=getlist();
        modelTableView.setItems(list);

        CheckBox allcheckbox=new CheckBox();
        all.setGraphic(allcheckbox);
        allcheckbox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(allcheckbox.isSelected()){

                    for (Model a:list){
                        a.getAll().setSelected(true);
                    }

                }
            }
        });


        modelTableView.getColumns().addAll(all,stt,serverity,ne,loaithietbi,batdau,ngaytao,mien,canhbao,dai,to,tinh,huyen);
        all.prefWidthProperty().bind(modelTableView.widthProperty().multiply(0.3));
        serverity.prefWidthProperty().bind(modelTableView.widthProperty().multiply(0.7));

        serverity.setCellFactory(column -> {
            return new TableCell<Model,String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);

                    if (item == null || empty) {
                        setText(null);
                        setStyle("");
                    } else {

                        setText(item);
                        switch (item) {
                            case "A1":
                                setTextFill(Color.BLACK);
                                setStyle("-fx-background-color: red");

                                break;
                            case "A2":
                                setTextFill(Color.BLACK);
                                setStyle("-fx-background-color: #EFA110");
                                break;
                            case "A3":
                                setTextFill(Color.BLACK);
                                setStyle("-fx-background-color: #EFEF4F");
                                break;
                            case "A4":
                                setTextFill(Color.BLACK);
                                setStyle("-fx-background-color: #455FC6");
                                break;
                        }

                    }
                }
            };
        });


        for (Model a:list){
            a.getAll().setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if(a.getAll().isSelected()){

                        System.out.println(a.getSeverity()+" "+a.getNe()+" "+a.getLoaiThietBi()+" "
                                + a.getBatDau()+" "+a.getNgayTao()+" "+a.getMien()+" "+a.getCanhBao()
                                +" "+ a.getDai()+" "+a.getTo()+" "+a.getTinh()+" "+a.getHuyen());

                    }
                }
            });

        }
        ContextMenu contextMenu = new ContextMenu();
        MenuItem menuItem1 = new MenuItem("Chi tiết");

        menuItem1.setOnAction((event) -> {
            Label secondLabel = new Label("Các dòng đã chọn:");
            for (Model a:list) {
                if(a.getAll().isSelected()) {
                    secondLabel.setText(secondLabel.getText() + "\n" + a.getSeverity() + " " + a.getNe() + " " + a.getLoaiThietBi() + " "
                            + a.getBatDau() + " " + a.getNgayTao() + " " + a.getMien() + " " + a.getCanhBao()
                            + " " + a.getDai() + " " + a.getTo() + " " + a.getTinh() + " " + a.getHuyen());
                    ;
                }
            }
            StackPane secondaryLayout = new StackPane();
            secondaryLayout.getChildren().add(secondLabel);
            Scene secondScene = new Scene(secondaryLayout, 230, 100);
            Stage newWindow = new Stage();
            newWindow.setTitle("Chi tiết");
            newWindow.setScene(secondScene);
            newWindow.show();
        });
        contextMenu.getItems().add(menuItem1);
        modelTableView.setContextMenu(contextMenu);
        Scene scene=new Scene(modelTableView,300,300);
        scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());

        window.setScene(scene);
        window.show();
    }
    private ObservableList<Model> getlist(){
        Model model1=new Model("A1","1","2","3","4","5","6","7","8","9","10");
        Model model2=new Model("A2","1","2","3","4","5","6","7","8","9","10");
        Model model3=new Model("A3","1","2","3","4","5","6","7","8","9","10");
        Model model4=new Model("A4","1","2","3","4","5","6","7","8","9","10");
        Model model5=new Model("A5","1","2","3","4","5","6","7","8","9","10");
        Model model6=new Model("A6","1","2","3","4","5","6","7","8","9","10");
        ObservableList<Model> list = FXCollections.observableArrayList(model1, model2, model3,model4,model5,model6);
        return  list;
    }
    public static <T> Callback<TableColumn<T, Void>, TableCell<T, Void>> indexCellFactory() {
        return t -> new TableCell<T, Void>() {

            @Override
            public void updateIndex(int i) {
                super.updateIndex(i);
                setText(isEmpty() ? "" : Integer.toString(++i));
            }
        };
    }


}