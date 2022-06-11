package com.mycompany.blocksfilmesprojeto;


import java.util.Scanner;

public class BlocksFilmesProjeto {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ControleCliente.getListaCliente().add(new Cliente("Antonio", 65, "56483567281", "antoninho@hotmail.com", "19945683956"));
        ControleCliente.getListaCliente().add(new Cliente("Samara", 32, "658356913502", "samsam@hotmail.com", "19583957295"));
        ControleCliente.getListaCliente().add(new Cliente("Teodoro", 12, "85948367584", "Teo@gmail.com", "11859384576"));

        ControleProduto.getListaProduto().add(new Produto("Shrek 2","Animacao","22/06/2001",(float) 25.50,"1234"));
        ControleProduto.getListaProduto().add(new Produto("Morbius","Acao","31/03/2022",(float) 20.75,"0000"));
        ControleProduto.getListaProduto().add(new Produto("Velozes e Furiosos","Acao","28/09/2001",(float) 20,"5555"));


        ControleFuncionario.getListaFuncionario().add(new Funcionario("Everton",52,"45738593848","everTown@yahoo.com.br","atendente",1500));
        ControleFuncionario.getListaFuncionario().add(new Funcionario("Rosangela",29,"84935867495","rosan@gmail.com","faxineira",1100));

        boolean algolegal = true;
        int opcao;
        do { 
            System.out.println("\nBEM-VINDO AO BLOCKSFILMES!\n" +
                    "Verifique as opções de cadastro abaixo:\n" +
                    "Opção 1 -  Cadastro de Cliente\n" +
                    "Opção 2 -  Cadastro de Funcionário\n" +
                    "Opção 3 -  Cadastro de Produto\n" +
                    "Opção 4 -  Busca de Cliente\n" +
                    "Opção 5 -  Busca de Funcionário\n" +
                    "Opção 6 -  Busca de Produto\n" +
                    "Opção 7 -  Exclusão de Cliente\n" +
                    "Opção 8 -  Exclusão de Funcionário\n" +
                    "Opção 9 -  Exclusão de Produto\n" +
                    "Opção 10 - Métodos\n" +
                    "Opção 0 -  Encerrar programa\n" +
                    "Digite o número correspondente à ação que deseja realizar: ");
            
            opcao = (teclado.nextInt());
            teclado.nextLine();

            switch (opcao) {
                case 0:
                    
                    algolegal = false;
                    break;
                case 1:
                    ControleCliente.cadastrarCliente().exibir();
                    
                    break;
                case 2:
                    ControleFuncionario.cadastrarFuncionario().exibir();
                   
                    break;
                case 3:
                    ControleProduto.cadastrarProduto().exibirProduto();
                    
                    break;
                case 4:
                    System.out.print("\nDigite o nome do cliente: ");
                    try{
                        ControleCliente.procurarCliente(teclado.nextLine()).exibir();
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage() + "\n");
                    }
                    break;
                case 5:
                    System.out.print("\nDigite o nome do funcionario: ");
                    try{
                        ControleFuncionario.procurarFuncionario(teclado.nextLine()).exibir();
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage() + "\n");
                    }
                    break;
                case 6:
                    System.out.println("\nDigite a opcão a ser procurada: \ng - genero \nc - codigo\np - preço\n");
                    String escolha = teclado.nextLine();

                    switch (escolha.toLowerCase()) {

                            case "g":
                                System.out.println("Digite o gênero a ser procurado: ");
                                try{
                                    for(Produto produto : ControleProduto.procurarPorGenero(teclado.nextLine())) {
                                        System.out.println("\n");
                                        produto.exibirProduto();
                                    } 
                                }catch (IllegalArgumentException e){
                                    System.out.println(e.getMessage()+ "\n");
                                }
                                break;
                            case "c":
                                System.out.println("Digite o código a ser procurado: ");
                                try{
                                    for(Produto produto : ControleProduto.procurarPorCodigo(teclado.nextLine())) {
                                        System.out.println("\n");
                                        produto.exibirProduto();
                                    }
                                }  catch (IllegalArgumentException e){
                                    System.out.println(e.getMessage()+"\n");
                                }

                            break;

                            case "p" :
                                System.out.println("Digite o preço a ser procurado: ");
                                try{
                                    for(Produto produto : ControleProduto.procurarPorPreco(teclado.nextFloat())) { //como achar por preço?
                                        System.out.println("\n");
                                        produto.exibirProduto();
                                    }
                                } catch (IllegalArgumentException e){
                                    System.out.println(e.getMessage() +"\n");
                                }
                            break;
                    }
                     
                    break;
                case 7:
                    System.out.println("Digite o nome do cliente a ser excluido: ");
                    try{
                        ControleCliente.excluirCliente(teclado.nextLine());
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage() + "\n");   
                    }
                    break;

                case 8:
                    System.out.println("Digite o nome do funcionario a ser excluido:");
                    try{
                        ControleFuncionario.excluirFuncionario(teclado.nextLine());
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage() + "\n");
                    }
                    break;
                case 9:
                    System.out.println("Digite o código do produto a ser excluido: ");
                    try{

                        ControleProduto.excluirProduto(teclado.nextLine());
                    } catch(IllegalArgumentException e){
                        System.out.println(e.getMessage() + "\n");
                    }
                    break;
                case 10:
                    menuMetodos();
                    break;
            }
            if (algolegal)
                esperador();
        } while (algolegal);
    }

    public static void menuMetodos() {
        int opcaomenu;
        System.out.println("\nSUBMENU - INFORMAÇÕES DE SISTEMA\n");
        System.out.println("Verifique as opções abaixo:");
        System.out.println("Opção 1 - Cliente com maior idade");
        System.out.println("Opção 2 - Cliente com menor idade");
        System.out.println("Opção 3 - Cliente maiores que 60 anos");
        System.out.println("Opção 4 - Cliente menores que 18 anos");
        System.out.println("Opção 5 - Média de preço dos produtos");
        System.out.println("Opção 6 - Produtos acima da média");
        System.out.print("\nDigite o número correspondente à ação que deseja realizar: ");
        opcaomenu = (teclado.nextInt());
        teclado.nextLine();

        switch (opcaomenu) {
            case 1:
                ControleCliente.ClienteMaisVelho();
                break;

            case 2:
                ControleCliente.ClienteMaisNovo();
                break;

            case 3:
                ControleCliente.ClientesMaioresQue60();
                break;

            case 4:
                ControleCliente.ClientesMenoresQue18();
                break;

            case 5:
                ControleProduto.MediaPrecoProdutos();
                break;

            case 6:
                ControleProduto.PrecoAcimaMedia();
        }
    }

    public static void esperador() {

        try {
            System.out.print("\t\nPressione enter para continuar ");
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static boolean opcaoSN() {
        char opcao = 's';
        boolean opcaoValida;

        do {
            opcaoValida = true;
            System.out.print("\tOpção [s/n]:  ");
            try {
                opcao = teclado.next().charAt(0);
                if (opcao != 's' && opcao != 'n')
                    throw new IllegalArgumentException("Opção inválida. Insira apenas 's' ou 'n'.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\n");
                opcaoValida = false;
            }
        } while (!opcaoValida);

        return opcao == 's';
    }

    
}
        





