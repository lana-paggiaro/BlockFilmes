
package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList;
import java.util.Scanner;

public class BlocksFilmesProjeto {

    public static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    public static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    public static ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public static void main(String[] args) {
        boolean algolegal = true;
        do {
            try (Scanner teclado = new Scanner(System.in)) {

                System.out.println("BEM-VINDO AO BLOCKSFILMES!");
                System.out.println("");
                System.out.println("Verifique as opções de cadastro abaixo:");
                System.out.println("Opção 1 -  Cadastro de Cliente");
                System.out.println("Opção 2 -  Cadastro de Funcionário");
                System.out.println("Opção 3 -  Cadastro de Produto"); // ajustar a data
                System.out.println("Opção 4 -  Verificação de Cliente");
                System.out.println("Opção 5 -  Verificação de Funcionário");
                System.out.println("Opção 6 -  Verificação de Produto");
                System.out.println("Opção 7 -  Exclusão de Cliente");
                System.out.println("Opção 8 -  Exclusão de Funcionário");
                System.out.println("Opção 9 -  Exclusão de Produto");
                System.out.println("Opção 0 -  Encerrar programa");
                System.out.println("\nDigite o número correspondente à ação que deseja realizar");

                int opcao;
                opcao = (teclado.nextInt());

                switch (opcao) {
                    case 0:
                        algolegal = false;
                    case 1:
                        cadastrarCliente();
                        break;
                    case 2:
                        cadastrarFuncionario();
                        break;
                    case 3:
                        cadastrarProduto();
                        break;
                    case 4:
                        System.out.print("\nDigite o nome do cliente: ");
                        procurarCliente(teclado.nextLine()).exibir();
                        break;
                    case 5:
                        System.out.print("\nDigite o nome do funcionario: ");
                        procurarFuncionario(teclado.nextLine()).exibir();
                        break;
                    case 6:
                        System.out.print("\nDigite o titulo do filme: ");
                        procurarProduto(teclado.nextLine()).exibirProduto(); // como exibir?
                    case 7:
                        System.out.println("Digite o nome do cliente a ser excluido: ");

                }
            }
        } while (algolegal);
    }

    public static void cadastrarCliente() {
        listaCliente.add(Cliente.cadastrarCliente());
    }

    public static void cadastrarFuncionario() {
        listaFuncionario.add(Funcionario.cadastrarFuncionario());
    }

    public static void cadastrarProduto() {
        listaProduto.add(Produto.cadastrarProduto());
    }

    public static Cliente procurarCliente(String codigoProcurar) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getNome().equals(codigoProcurar)) {
                return cliente;
            }
        }
        return null;
    }

    public static Funcionario procurarFuncionario(String codigoProcurar) {
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getNome().equals(codigoProcurar)) {
                return funcionario;
            }
        }
        return null;
    }

    public static Produto procurarProduto(String codigoProcurar) {
        for (Produto produto : listaProduto) {
            if (produto.getTitulo().equals(codigoProcurar)) {
                return produto;
            }
        }
        return null;
    }

    public static void excluirCliente(String codigoExcluir) {
        listaCliente.remove(procurarCliente(codigoExcluir));
    }

    public static void excluirFuncionario(String codigoExcluir) {
        listaFuncionario.remove(procurarFuncionario(codigoExcluir));
    }

    public static void excluirProduto(String codigoExcluir) {
        listaProduto.remove(procurarProduto(codigoExcluir));
    }
}
