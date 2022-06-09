
package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public class Cliente extends Pessoa implements IPessoa {
    protected String telefone;

    // construtores
    public void Cliente() {

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

        if (telefone.replaceAll("\\D","").length() != 11)
        throw new IllegalArgumentException("Telefone deve conter 11 números");
        // tratar exceção para não explodir o codigo e parar a compilação

    }

}
