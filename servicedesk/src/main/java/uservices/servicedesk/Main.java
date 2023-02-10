/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uservices.servicedesk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;

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
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste","root","");
            
            
                        
//            //Recebendo INPUT
//            System.out.println("Digite seu nome completo: ");
//            String nome = sc.nextLine();
//            
//            System.out.println("Digite sua idade: ");
//            int idade = sc.nextInt();
//            sc.nextLine();
            
            
            
            //escrevendo no banco----------------------------------------------------
            String query = "INSERT INTO CLIENTE(nome, idade) VALUES(tiago,10)";
            
            //preparando a Query para execução
            Statement pstmt = connection.prepareStatement(query);
            
            //executando query
            pstmt.execute(query);
            
            
            
            //lendo um banco-------------------------------------------------------------
            
            //cria um objeto do tipo Statment
            Statement st = connection.createStatement();
            
            //declaração da query a ser executada
            String sql = "SELECT * FROM CLIENTE";
            
            //executando a query
            ResultSet result = st.executeQuery(sql);
            
            //imprimindo resultado
            while(result.next()){
                System.out.println("nome: " + result.getString("nome"));
            }
            
            //fechando a conexão
            st.close();
            connection.close();
            System.out.println("Conexão foi fechada");

            
            
            
        }
        catch(SQLException exception){
            throw new RuntimeException("Erro: " + exception);
        }
        

        //aguarda um input qualquer, para que o programa nao termine
        sc.nextLine();
    }
}
