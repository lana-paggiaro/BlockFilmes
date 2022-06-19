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
        if(listaDeProdutosDeUmGenero.size() <= 0)
            throw new IllegalArgumentException("Não há filme com esse gênero.");
        return listaDeProdutosDeUmGenero;
    }

    public static ArrayList<Produto> procurarPorPreco(Float preco) {

        ArrayList<Produto> listaDeProdutosDeUmPreco = new ArrayList<Produto>();
        for(Produto produto : listaProduto){
            if(produto.getAluguel() == preco) 
                listaDeProdutosDeUmPreco.add(produto);
        }
        if(listaDeProdutosDeUmPreco.size() <=0)
            throw new IllegalArgumentException("Não há filme com esse preço.");
        return listaDeProdutosDeUmPreco;
    }

    public static ArrayList<Produto> procurarPorCodigo(String codigo) {
        ArrayList<Produto> listaDeProdutosDeUmCodigo = new ArrayList<Produto>();
        for (Produto produto : listaProduto) {
            if (produto.getCodigo().equals(codigo)) // int digitado se igualar a codigo
                listaDeProdutosDeUmCodigo.add(produto);

        }
        if(listaDeProdutosDeUmCodigo.size() <= 0)
            throw new IllegalArgumentException("Não há filme com esse código");
        return listaDeProdutosDeUmCodigo;
    }

    public static ArrayList<Produto> procurarProduto(String codigoProcurar) { //revisar
        ArrayList<Produto> listaProcuraDeProduto = new ArrayList<Produto>();
        //Deixar só esse for aqui dentro
        for (Produto produto : listaProduto) {
            if (produto.getCodigo().toLowerCase().equals(codigoProcurar))
                return listaProcuraDeProduto;
        }

        return null; 

        }

    public static void excluirProduto(String codigoExcluir) {
        ArrayList<Produto> listinha = procurarPorCodigo(codigoExcluir);
        for (Produto produto : listinha){
            System.out.println("\nTem certeza que deseja excluir "+ produto.getTitulo() +"?");
            if (BlocksFilmesProjeto.opcaoSN()) {
                listaProduto.remove(produto);
                System.out.println("O filme "+ produto.getTitulo() + "foi excluido com sucesso!");
            } 
        }
    }

    public static Float MediaPrecoProdutos() {
        float mediaPreco = 0;

        for (Produto p : listaProduto) {
            mediaPreco += p.getAluguel();
        }
        mediaPreco = mediaPreco / listaProduto.size();
        System.out.println("A média dos preços é: " + mediaPreco);
        return mediaPreco;
    }

    public static void PrecoAcimaMedia(){
        int valores = 0;
        float variavel = MediaPrecoProdutos();
        for(Produto c : listaProduto){
            if (c.getAluguel() > variavel){
                valores++;
            }
        }
        System.out.println("A quantidade de preços acima da média é de: "+ valores);
    }
}

