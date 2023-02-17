/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uservices.crudjava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uservices.crudjava.DTO.UserDTO;

/**
 *
 * @author User
 */
public class UserDAO {

    Connection conn;
    
    public void cadastrarUsuario(UserDTO objUserDTO){
        conn = new ConnectionDAO().conectaBD();
        
        String sql = "insert into cliente(nome, senha) values(?,?)";
        
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objUserDTO.getNome_usuario());
            pstm.setString(2, objUserDTO.getSenha_usuario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro UserDAO: " + ex.getMessage());
        }
        
        
        
        
    }

    public ResultSet autenticacaoUsuario(UserDTO objUsuarioDTO) {
        conn = new ConnectionDAO().conectaBD();

        try {
            String sql = "select * from cliente where nome = ? and senha = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException e) {
            System.out.println("Erro UserDAO: " + e.getMessage());
            return null;
        }
    }

}
