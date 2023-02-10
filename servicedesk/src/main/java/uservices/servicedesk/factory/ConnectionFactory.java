/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uservices.servicedesk.factory;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


/**
 *
 * @author Tiago
 */
public class ConnectionFactory {
    
    public Connection getConnection(String url){
        
        //tenta conexão com o banco
        try{
            return DriverManager.getConnection(url,"root","");
        }
        catch(SQLException exception){
            throw new RuntimeException("Erro: " + exception);
        }
    }
    
    
    
}
