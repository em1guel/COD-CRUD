/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.dao;

import erp.jdbc.ConnectionFactory;
import erp.objects.Clientes;
import erp.objects.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class UsuariosDAO {
    
      Connection con = null;
    
    public UsuariosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public UsuariosDAO(Connection conexao) {
       this.con= conexao;
    }


    
    public void adicionarUsuario(Usuarios user) {
        
      try {
        String sql = "insert into usuarios(login, senha) values (?, ?)";
    
        PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, user.getLogin());
            st.setString(2, user.getSenha());
            st.executeUpdate();
           
        
    }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
}      
         
        
    
    
    
    
    }
    
// metodo para verificar autenticidade do usuario , mas existe maneira mais pratica.
   /* public void autenticarUserPorLoginESenha() {
    
    }
    */

   //OUTRA MANEIRA DE AUTENTICAR
    
    public boolean existeNaDb(Usuarios usuarioAutenticar) throws SQLException {
       // Esse metodo vai consultar o banco e trazer dados ;
       String sql = "select * from usuarios where login = ? and senha = ? ";
       
       PreparedStatement st = con.prepareStatement(sql);
       st.setString(1, usuarioAutenticar.getLogin());
       st.setString(2, usuarioAutenticar.getSenha());
       st.executeQuery();
       
       //esses dados podem ser recebidos por esse metodo abaixo;
       // essa variavel result é o resultado da pesquisa no banco;
      ResultSet result = st.getResultSet();
      
        /*if (result.next()) {     // TAMBEM PODE SER UTILIZADO LAÇO WHILE         
            return true;
        } else{
            

        return false;
       
        }*/
        return result.next(); // Mesma função do metodo acima , mas muito mais pratico.
    }
}