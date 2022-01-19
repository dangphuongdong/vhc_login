package com.example.loginsmartw.TruyVan;

import com.example.loginsmartw.Connect.ConncetJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CauLenhTruyVan {
    public static Boolean getUser(String username,String pass){
        ConncetJdbc cn=new ConncetJdbc();
        Connection conn=null;
        try {
            conn= cn.getconnect();
            String sql="Select * from USERNAME_SMARTW where  USERNAME='"+username+"' and PASSWORD='"+pass+"' ";
            PreparedStatement pst=conn.prepareCall(sql);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                return true;
            }
        }
        catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return false;
    }
}
