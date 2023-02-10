/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uservices.servicedesk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import uservices.servicedesk.factory.ConnectionFactory;
import java.util.Scanner;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        //instancia um scanner
        Scanner sc = new Scanner(System.in);
        
        try{
            //tenta conexão com o banco
            System.out.println("Conexão bem sucedida");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cliente","root","");
            
            //cria um objeto do tipo Statment
            Statement st = connection.createStatement();
            
            //declaração da query a ser executada
            String sql = "SELECT * FROM CLIENTE cl\n"
                    + "INNER JOIN ENDERECO e\n"
                    + "ON cl.id_endereco = e.id\n"
                    + "INNER JOIN CONTATO co\n"
                    + "ON cl.id_contato = co.id;";
            
            //executando a query
            ResultSet result = st.executeQuery(sql);
            
            //imprimindo resultado
            while(result.next()){
                System.out.println("nome: " + result.getString("nome"));
            }
            
        }
        catch(SQLException exception){
            throw new RuntimeException("Erro: " + exception);
        }

        //aguarda um input qualquer, para que o programa nao termine
        sc.nextLine();
    }
}
