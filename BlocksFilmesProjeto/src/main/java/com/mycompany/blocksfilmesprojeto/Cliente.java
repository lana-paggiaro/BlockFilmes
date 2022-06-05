
package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public class Cliente extends Pessoa implements IPessoa {
    protected String telefone;
    
    //protected boolean ativo;

    //construtores
    public void Cliente(){
        
    }
    
    //metodos
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone:" + telefone);
    }
    
     public static Cliente cadastrarCliente(){
        Cliente cliente = new Cliente();
        Scanner teclado = new Scanner(System.in);
        //ArrayList <Cliente> listaCliente = new ArrayList();
        
        System.out.print("\nDigite seu nome: ");
        cliente.setNome(teclado.nextLine());

        System.out.print("\nDigite sua idade: ");
        cliente.setIdade(teclado.nextInt());

        System.out.print("\nDigite seu cpf: ");
        cliente.setCpf(teclado.nextLine());
        teclado.next();
                
        System.out.print("\nDigite seu email: ");
        cliente.setEmail(teclado.nextLine());
        teclado.next();
        
        System.out.print("\nDigite seu telefone: ");
        cliente.setTelefone(teclado.nextLine());
        teclado.next();
        
        
        //limpar buffer
        /*System.out.println("Digite seu status (ativo = true/inativo = false): ");
        cliente.setAtivo(teclado.nextBoolean());*/
        
        return cliente;
    }
    
    //getters e setters

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        //fazer exceção de requerer 11 caracteres

    }

    /*public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }*/

    
    
}
