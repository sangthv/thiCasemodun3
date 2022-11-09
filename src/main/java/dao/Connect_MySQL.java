package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect_MySQL {
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/quanlihocvien";
            String username = "root";
            String pass = "sangctm3k121190";
            return DriverManager.getConnection(url,username,pass);
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
