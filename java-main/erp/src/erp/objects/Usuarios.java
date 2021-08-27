/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.objects;

/**
 *
 * @author Miguel
 */
public class Usuarios {
    
    private int iduser;
    private String login;
    private String senha;

    public Usuarios(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    

    public Usuarios(int iduser, String login, String senha) {
        this.iduser = iduser;
        this.login = login;
        this.senha = senha;
    }

    public Usuarios() {
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
    
}
