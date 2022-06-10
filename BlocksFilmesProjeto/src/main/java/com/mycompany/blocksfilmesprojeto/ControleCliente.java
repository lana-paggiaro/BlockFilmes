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
            System.out.println(cliente.getNome());
            if (cliente.getNome().toLowerCase().startsWith(procuraCliente.toLowerCase())) {
                System.out.println("aaa");
                return cliente;
            }
        }
        return null; //erro de null

        //dar exceção de cliente não existente
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


}
