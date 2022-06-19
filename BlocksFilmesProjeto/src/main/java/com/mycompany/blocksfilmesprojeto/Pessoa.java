package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String email;

    public void Pessoa() {

    }

    // Fiz o construtor aqui
    public Pessoa(String nome, int idade, String cpf, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
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
        Scanner teclado = new Scanner(System.in);
        boolean validacao;

        do{
            validacao = true;
            try{
                if (idade > 0 && idade < 100)
                this.idade = idade;
            
                else
                throw new IllegalArgumentException("Digite uma idade válida.");
            }
             catch (IllegalArgumentException e){
                System.out.println(e.getMessage() + "\n");
                idade = teclado.nextInt();
                validacao = false;
            }
        }while (!validacao);
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        Scanner teclado = new Scanner(System.in);

        cpf = cpf.replaceAll("\\D", "");

        boolean validacao;

        do {
            validacao = false;
            try {
                if (cpf.replaceAll("\\D", "").length() == 11) {
                    validacao = true;
                    this.cpf = cpf;
                } else {
                    throw new IllegalArgumentException("Cpf deve conter 11 números. Insira-o novamente");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\n");
                cpf = teclado.nextLine();
            }
        } while (!validacao);

    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
        Scanner teclado = new Scanner(System.in);
        
        boolean validacao;
        do{
            validacao = false;
            try{
                if (email.contains("@"))
                {
                    validacao = true;
                    this.email = email;
                }else{
                    throw new IllegalArgumentException("O email deve conter, obrigatoriamente, @. Digite-o novamente: ");
                }  
            } catch (IllegalArgumentException e){
            System.out.println(e.getMessage() + "\n");
            email = teclado.nextLine();
            }
        } while(!validacao);
    }
}

