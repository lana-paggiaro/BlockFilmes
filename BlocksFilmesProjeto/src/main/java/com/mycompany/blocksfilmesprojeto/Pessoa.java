
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

    public void setIdade(int idade) {
        this.idade = idade;
        // fazer exceção de idade <18
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        // fazer exceção de requerer 11 caracteres
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
