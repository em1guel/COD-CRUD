/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.controller;

import erp.dao.UsuariosDAO;
import erp.jdbc.ConnectionFactory;
import erp.objects.Usuarios;
import erp.telas.MenuClientes;
import erp.telas.TelaClientesCad;
import erp.telas.TelaLogin;
import erp.telas.TelaPrincipalMDI;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class TelaLoginController {
    
    private TelaLogin view ;

    public TelaLoginController(TelaLogin view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        //buscar usuario da view
        String login = view.getjTextFieldLogin().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Usuarios usuarioAutenticar = new Usuarios(login , senha);
        
        // verificar se existe no BD
         Connection conexao = new ConnectionFactory().getConnection();
            
         UsuariosDAO usuariosDao = new UsuariosDAO(conexao);
         
        boolean existe = usuariosDao.existeNaDb(usuarioAutenticar);
            if (existe) {    // se existir , direcionar pro menu
                view.dispose(); // metodo ira fechar a janela atual; no caso a TelaLogin
                TelaPrincipalMDI telaDeMenu = new TelaPrincipalMDI();
                telaDeMenu.setResizable(false);//metodo para deixar a janela fixa
                telaDeMenu.setVisible(true);
                telaDeMenu.getLblUsuario().setText(login);
                
                
            }else {  // mensagem para o usuario , que não existe seu login na db.
                JOptionPane.showMessageDialog(view, "Login ou Senha invalidos");
            }
        
       
        
        
  
    }
    
    
    
    
}
