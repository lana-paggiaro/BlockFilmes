
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
                System.out.println("Opção 10 - Métodos");
                System.out.println("Opção 0 -  Encerrar programa"); //funcionando
                System.out.print("\nDigite o número correspondente à ação que deseja realizar: ");

                
                opcao = (teclado.nextInt());
                teclado.nextLine();
                
                switch (opcao) {
                    case 0:
                        //System.out.println("Encerrando programa...");
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
                        break;
                    case 7:
                        System.out.println("Digite o nome do cliente a ser excluido: ");
                        excluirCliente(teclado.nextLine());
                        break;
                    case 8 :
                        System.out.println("Digite o nome do funcionario a ser excluido:");
                        excluirFuncionario(teclado.nextLine());
                        break;
                    case 9:
                        System.out.println("Digite o produto a ser excluido: ");
                        excluirProduto(teclado.nextLine());
                        break;
                    case 10:
                        menuMetodos();
                        break;
            }
            if(algolegal)
            esperador(); 
        } while (algolegal);
    }

    public static void menuMetodos(){
        int opcaomenu;
        System.out.println("\nSUBMENU - INFORMAÇÕES DE SISTEMA\n");
        System.out.println("Verifique as opções abaixo:");
        System.out.println("Opção 1 - Cliente com maior idade");
        System.out.println("Opção 2 - Cliente com maior idade");
        System.out.println("Opção 3 - Cliente com maior idade");
        System.out.println("Opção 4 - Cliente com maior idade");
        System.out.println("Opção 5 - Cliente com maior idade");
        System.out.println("Opção 6 - Cliente com maior idade");
        System.out.print("\nDigite o número correspondente à ação que deseja realizar: ");
        opcaomenu = (teclado.nextInt());
        teclado.nextLine();

        switch(opcaomenu) {
            case 1:
            //chama metodo
            break;

            case 2: 
            //chama metodo
            break;

            case 3: 
            //chama metodo                
            case 4:
            //chama metodo
            break;

            case 5:
            //chama metodo
            break;

            case 6: 
            //chama metodo
        }
    }

    public static Cliente cadastrarCliente() {
        Cliente cliente = Cliente.cadastrarCliente();
        listaCliente.add(cliente);
        System.out.println("O cliente " + cliente.getNome() + " foi cadastrado com sucesso!\n");
        
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
            if (cliente.getNome().toLowerCase().startsWith(codigoProcurar.toLowerCase())) {
                return cliente;
            }
        }
        return null;
        /*try{
            return null;
        }
        catch (NullPointerException e) {
            System.out.println("ERRO!\nNão há cliente com esse nome registrado!");
        }*/
    }

    public static Funcionario procurarFuncionario(String codigoProcurar) {
        
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getNome().toLowerCase().startsWith(codigoProcurar.toLowerCase())) {
                return funcionario;
            }
        }
        return null;
        /*try{
            return null;
        }
        catch (NullPointerException e) {
            System.out.println("ERRO!\nNão há funcionario com esse nome registrado!");
        }*/
    }

    public static Produto procurarProduto(String codigoProcurar) { //revisar

        switch (codigoProcurar.toLowerCase()){
            case "n": 
            System.out.println("Digite o título a ser procurado: ");
            codigoProcurar = (teclado.next());
            for (Produto produto : listaProduto) {
                if (produto.getTitulo().toLowerCase().startsWith(codigoProcurar))
                    return produto;
            
            }

            case "g" :
            System.out.println("Digite o gênero a ser procurado: ");
            codigoProcurar = (teclado.next());
            for (Produto produto : listaProduto) {  
                if (produto.getGenero().toLowerCase().startsWith(codigoProcurar))
                    return produto;
            }

            /*case "p" :
            System.out.println("Digite o preço a ser procurado: ");
            produto.getAluguel().equals(codigoProcurar); // string se igualar a int
            return produto;*/
            }
        
        return null;
        /*try{
            return null;
        }
        catch (NullPointerException e) {
            System.out.println("ERRO!\nEsse produto não está registrado!");
        }*/
    }

    public static void excluirCliente(String codigoExcluir) {
        Cliente cliente = procurarCliente(codigoExcluir);
        
        System.out.println("\nTem certeza que deseja excluir " + cliente.getNome() +" ?");

        if (opcaoSN()){ // ver
            listaCliente.remove(cliente);
            System.out.println("O cliente" + cliente.getNome() +" foi excluído com sucesso!");
        }
        else
        System.out.println("Voltando ao menu principal.");    
    }

    public static void excluirFuncionario(String codigoExcluir) {
        Funcionario funcionario = procurarFuncionario(codigoExcluir);
        
        System.out.println("\nTem certeza que deseja excluir " + funcionario.getNome() +" ?");

        if(opcaoSN()){
            listaFuncionario.remove(funcionario);
            System.out.println("O funcionario" +funcionario.getNome() +" foi excluido com sucesso!");
        }
        else
        System.out.println("Voltando ao menu principal.");
        
    }

    public static void excluirProduto(String codigoExcluir) {
        Produto produto = procurarProduto(codigoExcluir);
        System.out.println("\nTem certeza que deseja excluir " + produto.getTitulo() +" ?");

        if(opcaoSN()){
            listaFuncionario.remove(produto);
            System.out.println("O funcionario" +produto.getTitulo() +" foi excluido com sucesso!");
        }
        else
        System.out.println("Voltando ao menu principal.");

    }

    public static void esperador() {
        
        try {
            System.out.print("\t\nPressione enter para continuar ");
            System.in.read();
        } catch (Exception e) {}
    }

    public static boolean opcaoSN() {
        char opcao = 's';
        boolean opcaoValida;

        do {
            opcaoValida = true;
            System.out.print("\tOpção [s/n]:  ");
            try {
                opcao = teclado.next().charAt(0);
                if (opcao !=  's' && opcao != 'n')
                    throw new IllegalArgumentException("Opção inválida. Insira apenas 's' ou 'n'.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\n");
                opcaoValida = false;
            }
        } while (!opcaoValida);

        return opcao == 's';
    }
}

