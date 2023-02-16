/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uservices.crudjava.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ConnectionDAO {
    

    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/teste?user=root&password=";
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e) {
            System.out.println("Erro na ConnectionDAO: " + e);
        }
        return conn;
    }
}
