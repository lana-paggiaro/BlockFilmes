
package com.mycompany.blocksfilmesprojeto;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String email;

    // construtores
    public void Pessoa() {

    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        if( idade <=0 || idade> 100)
        throw new IllegalArgumentException("O funcionário não deve ser menor de idade.");
        
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        cpf.replaceAll("\\D", "");

        if (cpf.replaceAll("\\D","").length() != 11)
        throw new IllegalArgumentException("CPF deve conter 11 números");
       
        // fazer exceção de requerer 11 caracteres
    }

    public String getEmail() {
        return email;
        
    }

    public void setEmail(String email) {
        
        if (!email.contains("@"))
        throw new IllegalArgumentException("O email deve conter, obrigatoriamente, @!");
        //tratar essa exceção para n parar de compilar o codigo

        this.email = email;
        
    }
}
