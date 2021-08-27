/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.controller;

import erp.dao.ClientesDAO;
import erp.jdbc.ConnectionFactory;
import erp.objects.Clientes;
import erp.telas.TelaExcluirClientes;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ExcluirClienteController {
    
    private TelaExcluirClientes view; 

    public ExcluirClienteController (TelaExcluirClientes view){
      this.view = view;  
    }
       
   public void excluirClientes() throws SQLException{
    String rg = view.getTxtExcluir().getText();
/*metodo para fazer a exclusao por id  
  int id =Integer.parseInt(view.getTxtExcluir().toString());
*/    
    Clientes list = new Clientes(rg);
    Connection conn = new ConnectionFactory().getConnection();
      ClientesDAO aa = new ClientesDAO(conn);
    boolean buscar = aa.extBD(list);
    if (buscar){
    ClientesDAO test = new ClientesDAO();
  test.deleteCliente(list);
       //JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
    }else{
       JOptionPane.showMessageDialog(null, "RG não encontrado!!");  
    } 
       
   }
    
}
