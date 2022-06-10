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

    // metodos
    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone:" + telefone);
    }

    // getters e setters

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        Scanner teclado = new Scanner(System.in);

        telefone = telefone.replaceAll("\\D", "");

        boolean validacao;

        do {
            validacao = false;
            try {
                if (telefone.replaceAll("\\D", "").length() == 11) {
                    validacao = true;
                    this.telefone = telefone;
                } else {
                    throw new IllegalArgumentException("Telefone deve conter 11 números. Insira-o novamente");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\n");
                telefone = teclado.nextLine();
            }
        } while (!validacao);


    }


}
