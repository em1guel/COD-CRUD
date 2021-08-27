/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.controllernovo;

import erp.dao.ClientesDAO;
import erp.jdbc.ConnectionFactory;
import erp.objects.Clientes;
import erp.telas.CadastroLogin;
import erp.telas.TelaClientesUpd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class TelaClientesUpdController {
    
 private  TelaClientesUpd view ;
 
 
public TelaClientesUpdController (TelaClientesUpd view){
    this.view = view;
}
 //////////////////////////////////////////////////////////
        //       CONTROLLER NÃO UTILIZADO             //
        //       UPDATE FEITO DIRETAMENTE NA TelaClientesUpd          //
        //       CONTROLLER NÃO UTILIZADO             //



/*public void aparecerNosCampos() throws SQLException{
        int id = Integer.parseInt(view.getTxtId().getText());
        String nome = view.getTxtCadNome().getText();
        String rg = view.getTxtCadRg().getText();
        String cpf = view.getTxtCadCpf().getText();
        String endereco = view.getTxtCadEndereco().getText();
        String cep = view.getTxtCadCep().getText();
        String cidade = view.getTxtCadCidade().getText();
        String uf = view.getTxtCadUf().getText();
        String numero = view.getTxtCadTelefone().getText();
        String bairro = view.getTxtCadBairro().getText();
        Clientes obj = new Clientes(nome, rg, cpf, endereco, cep, cidade,  uf,  numero, bairro);
        /*obj.setId(id);
        obj.setNome(nome);
        obj.setRg(rg);
        obj.setCpf(cpf);
        obj.setEndereco(endereco);
        obj.setCidade(cidade);
        obj.setCep(cep);
        obj.setUf(uf);
        obj.setNumero(numero);
        obj.setBairro(bairro);
       
         
            Connection conexao = new ConnectionFactory().getConnection();
            
            ClientesDAO clientesDao = new ClientesDAO(conexao);
            
            clientesDao.consultar(obj);
         view.getTxtCadNome().setText(nome);
         view.getTxtCadBairro().setText(bairro);
         view.getTxtCadRg().setText(rg);
         view.getTxtCadTelefone().setText(numero);
         view.getTxtCadEndereco().setText(endereco);
         view.getTxtCadCpf().setText(cpf);
         view.getTxtCadUf().setText(uf);
         view.getTxtCadCidade().setText(cidade);
            
        
      
   
         
         
}
public void consultarEMostrar(){
      
        int id = Integer.parseInt(view.getTxtId().getText());
        String nome = view.getTxtCadNome().getText();
        String rg = view.getTxtCadRg().getText();
        String cpf = view.getTxtCadCpf().getText();
        String endereco = view.getTxtCadEndereco().getText();
        String cep = view.getTxtCadCep().getText();
        String cidade = view.getTxtCadCidade().getText();
        String uf = view.getTxtCadUf().getText();
        String numero = view.getTxtCadTelefone().getText();
        String bairro = view.getTxtCadBairro().getText();
       
        Clientes cliente = new Clientes(id);
        
  
        
        try {
            
        
            if((view.getTxtId().getText().isEmpty() ) ){
                        
                JOptionPane.showMessageDialog(null, "Informe todos os campos");
            }else{
            
            Connection con = new ConnectionFactory().getConnection();
            ClientesDAO clientes = new ClientesDAO(con);
            clientes.consultar(cliente);
            view.getTxtCadNome().setText(nome);
         view.getTxtCadBairro().setText(bairro);
         view.getTxtCadRg().setText(rg);
         view.getTxtCadTelefone().setText(numero);
         view.getTxtCadEndereco().setText(endereco);
         view.getTxtCadCpf().setText(cpf);
         view.getTxtCadUf().setText(uf);
         view.getTxtCadCidade().setText(cidade);
            
            
            }    
    } catch (Exception e) {
    }
        
        
        
}*/
    
}
