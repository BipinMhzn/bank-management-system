/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user1
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {    
Connection conn=null;

public static Connection ConnecrDb(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn= DriverManager.getConnection("jdbc:sqlite:E:\\st xavier\\semester IV\\Project\\DBMS\\Project\\System\\Bank.sqlite");
                return conn;
                }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    }
    return null;
}
}
