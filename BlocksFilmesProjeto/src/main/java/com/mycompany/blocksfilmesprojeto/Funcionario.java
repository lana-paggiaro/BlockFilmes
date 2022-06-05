
package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public class Funcionario extends Pessoa implements IPessoa {
    protected String cargo;
    protected double salario;
    //protected boolean ativoF;

    //construtores
    public void Funcionario(){
        
    }
    
    //metodos 
    
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Email: " + email);
    }
    
    public static Funcionario cadastrarFuncionario(){
        Funcionario funcionario = new Funcionario();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\nDigite seu nome: ");
        funcionario.setNome(teclado.nextLine());

        System.out.print("\nDigite sua idade: ");
        funcionario.setIdade(teclado.nextInt());
        
        System.out.print("\nDigite seu cpf: ");
        funcionario.setCpf(teclado.nextLine());
        
        System.out.print("\nDigite seu cargo: ");
        funcionario.setCargo(teclado.nextLine());
        teclado.next();
        
        System.out.print("\nDigite seu salario: ");
        funcionario.setSalario(teclado.nextFloat());
        
        System.out.print("\nDigite seu email: ");
        funcionario.setEmail(teclado.nextLine());

        
       /* System.out.println("Digite seu status (ativo/inativo):");
        funcionario.setAtivoF(teclado.nextBoolean());*/
        
        return funcionario;
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

       /*public boolean isAtivoF() {
        return ativoF;
    }

    public void setAtivoF(boolean ativoF) {
        this.ativoF = ativoF;
    }
    */
}
