package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList;

public class ControleCliente {

    private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    public static ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public static Cliente cadastrarCliente() {
        Cliente cliente = Cliente.cadastrarCliente();
        listaCliente.add(cliente);
        System.out.println("O cliente " + cliente.getNome() + " foi cadastrado com sucesso!\n");

        return cliente;
    }

    public static Cliente procurarCliente(String procuraCliente) {
        System.out.println("Digitado: " + procuraCliente);
        for (Cliente cliente : listaCliente) {
            if (cliente.getNome().toLowerCase().startsWith(procuraCliente.toLowerCase())) {
                System.out.println("\n");
                return cliente;
            }
        }
        return null; // erro de null

        // dar exceção de cliente não existente
    }

    public static void excluirCliente(String codigoExcluir) {
        Cliente cliente = procurarCliente(codigoExcluir);

        System.out.println("\nTem certeza que deseja excluir " + cliente.getNome() + " ?");

        if (BlocksFilmesProjeto.opcaoSN()) { // ver
            listaCliente.remove(cliente);
            System.out.println("O cliente" + cliente.getNome() + " foi excluído com sucesso!");
        } else
            System.out.println("Voltando ao menu principal.");
    }

    public static void ClienteMaisVelho() {
        Cliente clienteMaisVelho = listaCliente.get(0);
        for (Cliente c : listaCliente) {
            if (clienteMaisVelho.getIdade() < c.getIdade()) {
                clienteMaisVelho = c;
            }
        }
        clienteMaisVelho.exibir();
    }

    public static void ClienteMaisNovo(){
        Cliente clienteMaisNovo = listaCliente.get(0);
        for(Cliente c : listaCliente){
            if (clienteMaisNovo.getIdade() > c.getIdade()){
                clienteMaisNovo = c;
            }
        }
        clienteMaisNovo.exibir();
    }
        
    public static void ClientesMaioresQue60(){
        int valores = 0;
        for(Cliente c : listaCliente){
            if (c.getIdade() >= 60){
                valores++;
            }
        }
        if(valores > 0)
            System.out.println("A quantidade de clientes maiores que 60 é: "+ valores);
        else
            System.out.println("Não há clientes maiores que 60 anos.");   
    }

    public static void ClientesMenoresQue18(){
        int valores = 0;
        for(Cliente c : listaCliente){
            if (c.getIdade() <= 18){
                valores++;
            }
        }
        if(valores > 0)
            System.out.println("A quantidade de clientes menores que 18 é: " + valores);
        else
            System.out.println("Não há clientes menores que 18 anos.");
    }
}

