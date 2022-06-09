package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleProduto {
    private static Scanner teclado = new Scanner(System.in);

    private static ArrayList<Produto> listaProduto = new ArrayList<Produto>();
    listaProduto.add(new Produto("Shrek 2", "Animacao", "22/06/2001", (float) 25.50, "1234"));
    listaProduto.add(new Produto("Morbius", "Acao", "31/03/2022", (float) 20.75, "0000"));

    
    public static Produto cadastrarProduto() {
        Produto produto = Produto.cadastrarProduto();
        listaProduto.add(produto);
        return produto;
    }
    
    public static Produto procurarProduto(String codigoProcurar) { //revisar

        switch (codigoProcurar.toLowerCase()){

            case "g" :
            System.out.println("Digite o gênero a ser procurado: ");
            codigoProcurar = (teclado.next());

            for (Produto produto : listaProduto) {  
                if (produto.getGenero().toLowerCase().startsWith(codigoProcurar))
                    return produto;
            }
            break;

            case "c": 
            System.out.println("Digite o código a ser procurado: ");
            codigoProcurar = (teclado.next());
            for (Produto produto : listaProduto) {
                if (produto.getCodigo().toLowerCase().startsWith(codigoProcurar))
                    return produto;
            
            }
            break;

            /*case "p" :
            System.out.println("Digite o preço a ser procurado: ");
            codigoProcurar = (teclado.next());
            for(Produto produto : listaProduto){
                if(produto.getAluguel().)
            }
            produto.getAluguel().equals(codigoProcurar); // string se igualar a int
            return produto;
            
            break;*/
            }
        
        return null;
        /*try{
            return null;
        }
        catch (NullPointerException e) {
            System.out.println("ERRO!\nEsse produto não está registrado!");
        }*/
    }

    public static void excluirProduto(String codigoExcluir) {
        Produto produto = procurarProduto(codigoExcluir);
        System.out.println("\nTem certeza que deseja excluir " + produto.getTitulo() +" ?");

        if(BlocksFilmesProjeto.opcaoSN()){
            listaProduto.remove(produto);
            System.out.println("O filme" +produto.getTitulo() +" foi excluido com sucesso!");
        }
        else
        System.out.println("Voltando ao menu principal.");

    }

}
