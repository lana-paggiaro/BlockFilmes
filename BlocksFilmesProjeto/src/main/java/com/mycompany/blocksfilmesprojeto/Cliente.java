
package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public class Cliente extends Pessoa implements IPessoa {
    protected String telefone;

    // construtores
    public Cliente(String nome, int idade, String cpf, String email, String telefone) {
    }

   
    public Cliente() {
        nome = "";
        idade = 0;
        cpf = "";
        email = "";
        telefone = "";
    }
    
    // metodos
    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone:" + telefone);
    }

    public static Cliente cadastrarCliente() {
        Cliente cliente = new Cliente();
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite seu nome: ");
        cliente.setNome(teclado.nextLine());

        System.out.print("\nDigite sua idade: ");
        cliente.setIdade(teclado.nextInt());

        System.out.print("\nDigite seu cpf: ");
        cliente.setCpf(teclado.next());
        teclado.nextLine();
        

        System.out.print("\nDigite seu email: ");
        cliente.setEmail(teclado.next());
        teclado.nextLine();
        

        System.out.print("\nDigite seu telefone: ");
        cliente.setTelefone(teclado.next());
        teclado.nextLine();
        System.out.println();

        return cliente;
    }

    // getters e setters

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

        telefone.replaceAll("\\D", "");
        boolean validacao;
        

        do{
            validacao = true;
            try{
             if (telefone.replaceAll("\\D","").length() != 11)
            throw new IllegalArgumentException("Telefone deve conter 11 números. Insira-o novamente");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage() + "\n");
            validacao = false;
        }
    } while (!validacao);

    //return telefone.length() = 0;
        // tratar exceção para não explodir o codigo e parar a compilação

    }



}
