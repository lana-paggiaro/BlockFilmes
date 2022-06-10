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

    static void ClienteMaisVelho() {
        Cliente clienteMaisVelho = listaCliente.get(0);
        for (Cliente c : listaCliente) {
            if (clienteMaisVelho.getIdade() < c.getIdade()) {
                clienteMaisVelho = c;
            }
        }
        clienteMaisVelho.exibir();
    }

    static void ClienteMaisNovo(){
        Cliente clienteMaisNovo = listaCliente.get(0);
        for(Cliente c : listaCliente){
            if (clienteMaisNovo.getIdade() > c.getIdade()){
                clienteMaisNovo = c;
            }
        }
        clienteMaisNovo.exibir();
    }
        
    
        //for (int i = 0; i < listaCliente.length; i++) {
        //    if (listaCliente[i] >= maior) {
        //        maior = listaCliente[i];
        //        indiceMaior = i;
        //    }
}

