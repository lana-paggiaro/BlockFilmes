package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleProduto {
    private static Scanner teclado = new Scanner(System.in);

    private static ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public static ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }


    public static Produto cadastrarProduto() {
        Produto produto = Produto.cadastrarProduto();
        listaProduto.add(produto);
        return produto;
    }

    public static ArrayList<Produto> procurarPorGenero(String genero) {
        ArrayList<Produto> listaDeProdutosDeUmGenero = new ArrayList<Produto>();
        for (Produto produto : listaProduto) {
            if (produto.getGenero().toLowerCase().startsWith(genero))
                listaDeProdutosDeUmGenero.add(produto);
        }
        return listaDeProdutosDeUmGenero;
    }

    public static ArrayList<Produto> procurarPorPreco(double preco) {

        // ArrayList<Produto> listaDeProdutosDeUmPreço = new ArrayList<Produto>(); <-- Nao use caractere especial em nome de variavel
        ArrayList<Produto> listaDeProdutosDeUmPreco = new ArrayList<Produto>();
        for(Produto produto : listaProduto){
            if(produto.getAluguel() == preco) // double digitado se igualar a preço
                listaDeProdutosDeUmPreco.add(produto);
        }

        return listaDeProdutosDeUmPreco;
    }

    public static ArrayList<Produto> procurarPorCodigo(String codigo) {
        ArrayList<Produto> listaDeProdutosDeUmCodigo = new ArrayList<Produto>();
        for (Produto produto : listaProduto) {
            if (produto.getCodigo().equals(codigo)) // int digitado se igualar a codigo
                listaDeProdutosDeUmCodigo.add(produto);

        }
        return listaDeProdutosDeUmCodigo;
    }

    public static ArrayList<Produto> procurarProduto(String codigoProcurar) { //revisar
        ArrayList<Produto> listaProcuraDeProduto = new ArrayList<Produto>();
        //Deixar só esse for aqui dentro
        for (Produto produto : listaProduto) {
            if (produto.getCodigo().toLowerCase().equals(codigoProcurar))
                listaProcuraDeProduto.add(produto);
        }

        return listaProcuraDeProduto; //fodase return listaProcuraDeProduto;

        /*try{
            return null;
        }
        catch (NullPointerException e) {
            System.out.println("ERRO!\nEsse produto não está registrado!");
        }*/
        }

    public static void excluirProduto(String codigoExcluir) {
        ArrayList<Produto> produto = procurarProduto(codigoExcluir);
        System.out.println("\nTem certeza que deseja excluir este filme ?");

        if (BlocksFilmesProjeto.opcaoSN()) {
            listaProduto.remove(produto);
            System.out.println("O filme selecionado foi excluido com sucesso!");
        } else
            System.out.println("Voltando ao menu principal.");

    }



}

