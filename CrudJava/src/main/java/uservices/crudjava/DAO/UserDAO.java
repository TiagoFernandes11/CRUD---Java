/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uservices.crudjava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import uservices.crudjava.DTO.UserDTO;

/**
 *
 * @author User
 */
public class UserDAO {

    Connection conn;

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
