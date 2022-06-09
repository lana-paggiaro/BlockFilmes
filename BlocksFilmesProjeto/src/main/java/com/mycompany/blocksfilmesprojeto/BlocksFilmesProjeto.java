
package com.mycompany.blocksfilmesprojeto;


import java.util.Scanner;

public class BlocksFilmesProjeto {
    private static Scanner teclado = new Scanner(System.in);
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
                        ControleCliente.cadastrarCliente().exibir();
                        //por para exibir o que foi cadastrado
                        break;
                    case 2:
                        ControleFuncionario.cadastrarFuncionario().exibir();
                        //por pra exibir o que foi cadastrado
                        break;
                    case 3:
                        ControleProduto.cadastrarProduto().exibirProduto();
                        //por paa exibir oq foi cadastrado
                        break;
                    case 4:
                        System.out.print("\nDigite o nome do cliente: ");
                        ControleCliente.procurarCliente(teclado.nextLine()).exibir();
                        break;
                    case 5:
                        System.out.print("\nDigite o nome do funcionario: ");
                        ControleFuncionario.procurarFuncionario(teclado.nextLine()).exibir();
                        break;
                    case 6:
                        System.out.println("\nDigite a opcão a ser procurada: \ng - genero \nc - codigo\np - preço\n");
                        ControleProduto.procurarProduto(teclado.nextLine()).exibirProduto(); // como exibir?
                        break;
                    case 7:
                        System.out.println("Digite o nome do cliente a ser excluido: ");
                        ControleCliente.excluirCliente(teclado.nextLine());
                        break;
                    case 8 :
                        System.out.println("Digite o nome do funcionario a ser excluido:");
                        ControleFuncionario.excluirFuncionario(teclado.nextLine());
                        break;
                    case 9:
                        System.out.println("Digite o produto a ser excluido: ");
                        ControleProduto.excluirProduto(teclado.nextLine());
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

