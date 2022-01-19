package com.example.loginsmartw.Connect;

import java.sql.*;

public class ConncetJdbc {
        public Connection getconnect() throws ClassCastException{
        Connection conn = null;

        try {
            String dbURL = "jdbc:oracle:thin:@DESKTOP-T6EQDLO:1521:oracle";
            // Tài khoản đăng nhập oracle
            String username = "hr";
            String password = "hr";
            // Tạo kết nối đến server
            conn = DriverManager.getConnection(dbURL, username, password);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
        }
}
