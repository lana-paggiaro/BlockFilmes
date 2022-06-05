
package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public class Produto {
    protected String titulo;
    protected String genero;
    protected int lancamento;
    protected double aluguel;
    //protected boolean disponibilidade;
    
    //construtores
    
    public void Produto(){
        
    }
    
    //metodos
    public void exibirProduto(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Genero: "+ genero);
        System.out.println("Lançameto: "+ lancamento);
        System.out.println("Preço de aluguel: "+ aluguel);
        //System.out.println("Disponibilidade: "+ disponibilidade);
    }
    
    public static Produto cadastrarProduto(){
        Produto produto = new Produto();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\nInsira o titulo do filme: ");
        produto.setTitulo(teclado.nextLine());
        
        System.out.print("\nInsira o genero do filme: ");
        produto.setGenero(teclado.nextLine());
        
        System.out.print("\nInsira a data de lançamento do filme: ");
        produto.setLancamento(teclado.nextInt()); //por para receber data de maneira --/--/----
        
        System.out.print("\nInsira o preço de aluguel do filme: ");
        produto.setAluguel(teclado.nextDouble());
        
        /*System.out.print("\nO filme está disponivel (true) ou indisponivel (false)?: ");
        produto.setDisponibilidade(teclado.nextBoolean());*/
        
        return produto;
    }
    
    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    /*public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }*/
    
    
    
}
