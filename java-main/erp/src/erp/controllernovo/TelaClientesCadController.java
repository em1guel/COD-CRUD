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
import erp.telas.TelaClientesCad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Renato
 */
public class TelaClientesCadController {
         
    
    private TelaClientesCad view;
   
    
    public TelaClientesCadController(TelaClientesCad view) {
       this.view = view;
    }
   
    public void salvarCliente(){
        
        String nome = view.getTxtCadNome().getText();
        String rg = view.getTxtCadRg().getText();
        String cpf = view.getTxtCadCpf().getText();
        String endereco = view.getTxtCadEndereco().getText();
        String cep = view.getTxtCadCep().getText();
        String cidade = view.getTxtCadCidade().getText();
        String uf = view.getCbUf().getSelectedItem().toString();
        String numero = view.getTxtCadTelefone().getText();
        String bairro = view.getTxtCadBairro().getText();
       
        Clientes cliente = new Clientes(nome, rg, cpf, endereco, cep, cidade,  uf,  numero, bairro);
 
         try {
             //essa codigo abaixo ira verificar se todos os campos estão preenchidos.
             //*criar um metodo txtPreenchido para facilitar o uso do metodo e diminuir seu tamanho.
                if((view.getTxtCadNome().getText().isEmpty()) || view.getTxtCadCpf().getText().isEmpty() || 
                        view.getTxtCadEndereco().getText().isEmpty() || view.getTxtCadRg().getText().isEmpty() || 
                        view.getTxtCadCep().getText().isEmpty() || view.getTxtCadCidade().getText().isEmpty()  ||
                          view.getTxtCadTelefone().getText().isEmpty() ||view.getCbUf().getSelectedItem().toString().isEmpty() ||
                        view.getTxtCadBairro().getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
            }else{
                    
                
            Connection conexao = new ConnectionFactory().getConnection();
            
            ClientesDAO clientesDao = new ClientesDAO(conexao);
            
            clientesDao.adicionarCliente(cliente);
            
         view.getTxtCadNome().setText(null);
         view.getTxtCadBairro().setText(null);
         view.getTxtCadRg().setText(null);
         view.getTxtCadCep().setText(null);
         view.getTxtCadTelefone().setText(null);
         view.getTxtCadEndereco().setText(null);
         view.getTxtCadCpf().setText(null);
         view.getCbUf().setSelectedItem(null);
         view.getTxtCadCidade().setText(null);
         
                }
         
         
            
            //JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso.");
           
        } catch(Exception e){
            Logger.getLogger(CadastroLogin.class.getName()).log(Level.SEVERE , null , e);
        }
                
    }
        
    
}
