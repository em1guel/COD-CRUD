/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.controller;

import erp.dao.ClientesDAO;
import erp.dao.UsuariosDAO;
import erp.jdbc.ConnectionFactory;
import erp.objects.Clientes;
import erp.telas.CadastroLogin;
import erp.telas.TelaCadastroCliente;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class CadastroClienteController {

    
    private TelaCadastroCliente view;
    
    public CadastroClienteController(TelaCadastroCliente view) {
       this.view = view;
    }
    
    public void salvarCliente(){
        
        String nome = view.getTfNome().getText();
        String rg = view.getTfRg().getText();
        String cpf = view.getTfCpf().getText();
        String endereco = view.getTfEndereco().getText();
        String cep = view.getjFormattedTextFieldCep().getText();
        String cidade = view.getjTextFieldCidade().getText();
        String uf = view.getTfUf().getText();
        String numero = view.getTfCelular().getText();
        String bairro = view.getTfBairro().getText();
        
        Clientes cliente = new Clientes(nome, rg, cpf, endereco, cep, cidade,  uf,  numero, bairro);
              
         try {
            Connection conexao = new ConnectionFactory().getConnection();
            
            ClientesDAO clientesDao = new ClientesDAO(conexao);
            
            clientesDao.adicionarCliente(cliente);
            
            //JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso.");
           
        } catch(Exception e){
            Logger.getLogger(CadastroLogin.class.getName()).log(Level.SEVERE , null , e);
        }
                
    }
        
    
}
