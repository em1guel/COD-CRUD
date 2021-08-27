/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.jdbc;
import javax.swing.JOptionPane;
/**
 *
 * @author Miguel
 */
public class Teste {
    
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Deu certo ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ferrou " + e);
        }
    }
}
