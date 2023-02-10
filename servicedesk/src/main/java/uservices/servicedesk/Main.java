/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uservices.servicedesk;
import uservices.servicedesk.factory.ConnectionFactory;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //instancia um scanner
        Scanner sc = new Scanner(System.in);
        
        //olá mundo
        System.out.println("Hello World!");
        
        //instancia uma "fabrica" de conexões com DB
        ConnectionFactory conn = new ConnectionFactory();
        
        //tenta conectar ao banco
        Class.forName("com.mysql.jdbc.Driver");
        conn.getConnection("jdbc:mysql://localhost:3306/Application");
        
        //aguarda um input qualquer, para que o programa nao termine
        sc.nextLine();
    }
}
