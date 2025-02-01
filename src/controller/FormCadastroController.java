/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UsuarioDAO;
import dao.conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.ticket;

/**
 *
 * @author USUARIO
 */
public class FormCadastroController {
    
    private ticket view;

    public FormCadastroController(ticket view) {
        this.view = view;
    }
    
 public void salvaUsuario(){
     
     
     
     
        String email = view.getjTextFieldemail().getText();
        String assunto = view.getjTextFieldassunto().getText();
        String descricao = view.getjTextAreadescricao().getText();
        String numerodecontato = view.getjTextFieldnumerodecontato().getText();
        
        
        Usuario usuario1 = new Usuario(email, assunto, descricao, numerodecontato);
      
      
        try {
            Connection conexao = new conexao().getConnection();
             UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(usuario1);
            
            JOptionPane.showMessageDialog(null, "Ticket Enviado com sucesso!");
             
        } catch (SQLException ex) {
            
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
     
 }
    
}
