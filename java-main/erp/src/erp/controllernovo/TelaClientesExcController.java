/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.controllernovo;

import erp.dao.ClientesDAO;
import erp.jdbc.ConnectionFactory;
import erp.objects.Clientes;
import erp.telas.TelaExcluirClientes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import erp.telas.TelaClientesExc;

/**
 *
 * @author Miguel
 */
public class TelaClientesExcController {
    private TelaClientesExc view; 

    public TelaClientesExcController (TelaClientesExc view){
      this.view = view;  
    }
       
   public void excluirClientes() throws SQLException{
   int id = Integer.parseInt(view.getTxtRgExc().getText());
    
    Clientes list = new Clientes(id);
    Connection conn = new ConnectionFactory().getConnection();
      ClientesDAO aa = new ClientesDAO(conn);
    boolean buscar = aa.extBD(list);
    if (buscar){
    ClientesDAO test = new ClientesDAO();
  test.deleteCliente(list);
       //JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
    }else{
       JOptionPane.showMessageDialog(null, "ID não encontrado!!!");  
    } 
       
   }
    
    
}
