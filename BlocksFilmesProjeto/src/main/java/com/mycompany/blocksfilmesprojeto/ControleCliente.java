package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList;

public class ControleCliente {
    private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    listaCliente.add(new Cliente("Antonio", 45, "56483567281", "antoninho@hotmail.com", "19945683956"));
    listaCliente.add(new Cliente("Samara", 32, "658356913502", "samsam@hotmail.com", "19583957295"));
    //wtf vei denovoe ssa porra
    //exceção de return null??? socorro 

    public static Cliente cadastrarCliente() {
        Cliente cliente = Cliente.cadastrarCliente();
        listaCliente.add(cliente);
        System.out.println("O cliente " + cliente.getNome() + " foi cadastrado com sucesso!\n");
        
        return cliente;
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

    public static void excluirCliente(String codigoExcluir) {
        Cliente cliente = procurarCliente(codigoExcluir);
        
        System.out.println("\nTem certeza que deseja excluir " + cliente.getNome() +" ?");

        if (BlocksFilmesProjeto.opcaoSN()){ // ver
            listaCliente.remove(cliente);
            System.out.println("O cliente" + cliente.getNome() +" foi excluído com sucesso!");
        }
        else
        System.out.println("Voltando ao menu principal.");    
    }

}
