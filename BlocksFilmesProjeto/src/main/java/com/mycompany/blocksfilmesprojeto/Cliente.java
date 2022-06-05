
package com.mycompany.blocksfilmesprojeto;


public class Cliente extends Pessoa implements IPessoa {
    protected float cpf;
    protected float telefone;
    protected String email;
    protected boolean ativo;

    //construtores
    public void Cliente(){
        
    }
    
    //metodos
    public void exibir(){
        
    }
    
    //getters e setters
    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
        //fazer exceção de requerer 11 caracteres
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
        //fazer exceção de requerer 11 caracteres

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
