
package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList;
import java.util.Scanner;

public class BlocksFilmesProjeto {
    private static Scanner teclado = new Scanner(System.in);

    private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    private static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    private static ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public static void main(String[] args) {
        boolean algolegal = true;
        int opcao;
        do { // fazer um pressione tecla para continuar
                System.out.println("\nBEM-VINDO AO BLOCKSFILMES!\n");
                System.out.println("Verifique as opções de cadastro abaixo:");
                System.out.println("Opção 1 -  Cadastro de Cliente");
                System.out.println("Opção 2 -  Cadastro de Funcionário");
                System.out.println("Opção 3 -  Cadastro de Produto"); 
                System.out.println("Opção 4 -  Busca de Cliente");
                System.out.println("Opção 5 -  Busca de Funcionário");
                System.out.println("Opção 6 -  Busca de Produto");
                System.out.println("Opção 7 -  Exclusão de Cliente");
                System.out.println("Opção 8 -  Exclusão de Funcionário");
                System.out.println("Opção 9 -  Exclusão de Produto");
                System.out.println("Opção 0 -  Encerrar programa"); //funcionando
                System.out.print("\nDigite o número correspondente à ação que deseja realizar: ");

                
                opcao = (teclado.nextInt());
                teclado.nextLine();

                switch (opcao) {
                    case 0:
                        algolegal = false;
                        break;
                    case 1:
                        
                        cadastrarCliente().exibir();
                        //por para exibir o que foi cadastrado
                        break;
                    case 2:
                        cadastrarFuncionario().exibir();
                        //por pra exibir o que foi cadastrado
                        break;
                    case 3:
                        cadastrarProduto().exibirProduto();
                        //por paa exibir oq foi cadastrado
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
                        System.out.println("\nDigite a opcão a ser procurada: \nn - nome \ng - genero \np - preço\n");
                        procurarProduto(teclado.nextLine()).exibirProduto(); // como exibir?
                    case 7:
                        System.out.println("Digite o nome do cliente a ser excluido: ");
                        excluirCliente(teclado.nextLine());
                        

                
                
            }
        } while (algolegal);
    }

    public static Cliente cadastrarCliente() {
        Cliente cliente = Cliente.cadastrarCliente();
        listaCliente.add(cliente);
        System.out.println("O cliente " + cliente.getNome() + "foi cadastrado com sucesso!");
        
        return cliente;
    }

    public static Funcionario cadastrarFuncionario() {
        Funcionario funcionario = Funcionario.cadastrarFuncionario();
        listaFuncionario.add(funcionario);

        return funcionario;
    }

    public static Produto cadastrarProduto() {
        Produto produto = Produto.cadastrarProduto();
        listaProduto.add(produto);
        return produto;
    }

    public static Cliente procurarCliente(String codigoProcurar) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getNome().startsWith(codigoProcurar)) {
                return cliente;
            }
        }
        return null;
    }

    public static Funcionario procurarFuncionario(String codigoProcurar) {
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getNome().startsWith(codigoProcurar)) {
                return funcionario;
            }
        }
        return null;
    }

    public static Produto procurarProduto(String codigoProcurar) {


        for (Produto produto : listaProduto) {
            switch (codigoProcurar){
            case "n": 
            System.out.println("Digite o título a ser procurado: ");
            produto.getTitulo().startsWith(codigoProcurar);
            return produto;

            case "g" :
            System.out.println("Digite o gênero a ser procurado: ");
            produto.getGenero().startsWith(codigoProcurar);
            return produto;

            /*case "p" :
            produto.getAluguel().equals(codigoProcurar); // string se igualar a int
            return produto;*/
            }
        }
        return null;
    }

    public static void excluirCliente(String codigoExcluir) {
        Cliente cliente = procurarCliente(codigoExcluir);
        listaCliente.remove(cliente);
        System.out.println("O cliente"+ cliente.getNome() +"foi excluído com sucesso!");
    }

    public static void excluirFuncionario(String codigoExcluir) {
        listaFuncionario.remove(procurarFuncionario(codigoExcluir));
        System.out.println("O funcionário foi excluído com sucesso!");
    }

    public static void excluirProduto(String codigoExcluir) {
        listaProduto.remove(procurarProduto(codigoExcluir));
        System.out.println("O produto foi excluído com sucesso!");
    }
}
