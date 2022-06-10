package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public class Cliente extends Pessoa implements IPessoa {
    protected String telefone;

    // construtores
    /*
    * Seu construtor ta vazio, você só ta passando os parametros mas não ta passando
    * pra superclasse com o super(), por isso ta dando NullPointer na hora de buscar
    * um cliente, afinal, o nome ta ficando como null pois vc nao ta setando ele.
    *
    * public Cliente(String nome, int idade, String cpf, String email, String telefone) {
    *
    * }
    */

    public Cliente(String nome, int idade, String cpf, String email, String telefone) {
        super(nome, idade, cpf, email);
        this.telefone = telefone;
    }

    public Cliente() {
        // Passando valores vazios para a super classe, que vai cuidar da idade, email, e etc.
        super("", 0, "", "");
        // Ja que a classe Cliente vai ser responsável pelo telefone, a gente seta ele aqui
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
        System.out.println("Telefone: " + telefone);
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
