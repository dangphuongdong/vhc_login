module com.example.loginsmartw {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.example.loginsmartw.Models;
    opens com.example.loginsmartw to javafx.fxml;
  /*  exports com.example.loginsmartw;*/
    exports com.example.loginsmartw.TruyVan;
    opens com.example.loginsmartw.TruyVan to javafx.fxml;
    exports com.example.loginsmartw.Connect;
    opens com.example.loginsmartw.Connect to javafx.fxml;
    exports com.example.loginsmartw.controller;
    opens com.example.loginsmartw.controller to javafx.fxml;
}