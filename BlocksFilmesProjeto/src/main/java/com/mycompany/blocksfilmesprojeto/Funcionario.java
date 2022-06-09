
package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public class Funcionario extends Pessoa implements IPessoa {
    protected String cargo;
    protected double salario;

    // construtores
    public Funcionario(String nome, int idade, String cpf, String email, String cargo, String salario) {
    }

    public Funcionario() {
    }

    // metodos

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Email: " + email);
    }

    public static Funcionario cadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite seu nome: ");
        funcionario.setNome(teclado.nextLine());

        System.out.print("\nDigite sua idade: ");
        funcionario.setIdade(teclado.nextInt());
        

        System.out.print("\nDigite seu cpf: ");
        funcionario.setCpf(teclado.next());
        teclado.nextLine();

        System.out.print("\nDigite seu cargo: ");
        funcionario.setCargo(teclado.next());
        teclado.nextLine();
        

        System.out.print("\nDigite seu salario: R$");
        funcionario.setSalario(teclado.nextFloat());
        teclado.nextLine();

        System.out.print("\nDigite seu email: ");
        funcionario.setEmail(teclado.next());
        teclado.nextLine();
        System.out.println();

        return funcionario;
    }

    // getters e settes
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override // sobrecarga pois funcionario n pode ser menor de 18 pq né
    public void setIdade(int idade) { 
    
        if (idade < 16)
        throw new IllegalArgumentException("O funcionário não deve ser menor de idade. Voltando ao menu principal");
        super.setIdade(idade);
        // exceção de idade <18 || idade > 100 - voltar ao menu principal 
        
    }
   
    
}
