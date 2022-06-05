
package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList;
import java.util.Scanner;

public class BlocksFilmesProjeto {
    
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número correspondente à ação que deseja realizar");
        System.out.println("Opção 1 -  Cadastro de Cliente"); //lipar buffer
        System.out.println("Opção 2 -  Cadastro de Funcionário"); //limpar buffer
        System.out.println("Opção 3 -  Cadastro de Produto"); //ajustar data
        System.out.println("Opção 4 -  Verificação de Cliente");
        System.out.println("Opção 5 -  Verificação de Funcionário");
        System.out.println("Opção 6 -  Verificação de Produto");
        System.out.println("Opção 7 -  Exclusão de Cliente");
        System.out.println("Opção 8 -  Exclusão de Funcionário");
        System.out.println("Opção 9 -  Exclusão de Produto");
        System.out.println("Opção 0 -  Encerrar programa");
        System.out.println("");

        int opcao = 0;
        opcao = Integer.parseInt(teclado.nextLine());

        switch(opcao){
            case 1 :
                opcao = 1;
                cadastrarCliente();
                break;
            case 2 :
                opcao = 2;
                cadastrarFuncionario();
                break;
            case 3 :
                opcao = 3;
                cadastrarProduto();
                break;
        }
        
    }
    
    public static void cadastrarCliente(){
        Cliente cliente = new Cliente();
        Scanner teclado = new Scanner(System.in);
        ArrayList <Cliente> listaCliente = new ArrayList();
        
        System.out.println("Digite seu nome: ");
        cliente.setNome(teclado.nextLine());

        System.out.println("Digite sua idade: ");
        cliente.setIdade(teclado.nextInt());

        System.out.println("Digite seu cpf: ");
        cliente.setCpf(teclado.nextFloat());

        System.out.println("Digite seu telefone: ");
        cliente.setTelefone(teclado.nextFloat());

        System.out.println("Digite seu email: ");
        cliente.setEmail(teclado.nextLine());
        
        //buffer
        System.out.println("Digite seu status (ativo = true/inativo = false): ");
        cliente.setAtivo(teclado.nextBoolean());
        
        listaCliente.add(cliente);
    }
    
    public static void cadastrarFuncionario(){
        Funcionario funcionario = new Funcionario();
        Scanner teclado = new Scanner(System.in);
        ArrayList <Funcionario> listaFuncionario = new ArrayList();
        
        System.out.println("Digite seu nome: ");
        funcionario.setNome(teclado.nextLine());

        System.out.println("Digite sua idade: ");
        funcionario.setIdade(teclado.nextInt());

        System.out.println("Digite seu cargo: ");
        funcionario.setCargo(teclado.nextLine());

        System.out.println("Digite seu salario: ");
        funcionario.setSalario(teclado.nextFloat());

        System.out.println("Digite seu telefone: ");
        funcionario.setTelefone(teclado.nextFloat());
        
        //buffer
        System.out.println("Digite seu endereço: ");
        funcionario.setEndereco(teclado.nextLine());

        System.out.println("Digite seu status (ativo/inativo):");
        funcionario.setAtivoF(teclado.nextBoolean());
        
        listaFuncionario.add(funcionario);
    }
    
    public static void cadastrarProduto(){
        Produto produto = new Produto();
        Scanner teclado = new Scanner(System.in);
        ArrayList<Produto> listaProduto = new ArrayList();
        
        System.out.println("Insira o titulo do filme: ");
        produto.setTitulo(teclado.nextLine());
        
        System.out.println("Insira o genero do filme: ");
        produto.setGenero(teclado.nextLine());
        
        System.out.println("Insira a data de lançamento do filme: ");
        produto.setLancamento(teclado.nextInt()); //por para receber data de maneira --/--/----
        
        System.out.println("Insira o preço de aluguel do filme: ");
        produto.setAluguel(teclado.nextDouble());
        
        System.out.println("O filme está disponivel (true) ou indisponivel (false)?: ");
        produto.setDisponibilidade(teclado.nextBoolean());
        
        listaProduto.add(produto);
    }
    
    /*public void excluirCliente(){
        for (Cliente c: listaCliente){
            if (cliente.getCpf() == codigoExcluir()){
                listaCliente.remove(c);
                break;
            }
        }
    } não sei fazer essa merda*/
}
    
    

