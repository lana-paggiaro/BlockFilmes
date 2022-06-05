
package com.mycompany.blocksfilmesprojeto;

public class Funcionario extends Pessoa implements IPessoa {
    protected String cargo;
    protected double salario;
    protected float telefone;
    protected String endereco;
    protected boolean ativoF;

    //construtores
    public void Funcionario(){
        
    }
    
    //metodos 
    
    public void exibir(){
        
    }
    
    //getters e settes
    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
        //fazer exceção de requerer 11 caracteres
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAtivoF() {
        return ativoF;
    }

    public void setAtivoF(boolean ativoF) {
        this.ativoF = ativoF;
    }
    
}
