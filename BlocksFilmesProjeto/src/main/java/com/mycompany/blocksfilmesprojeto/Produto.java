
package com.mycompany.blocksfilmesprojeto;

import java.util.Scanner;

public class Produto {
    protected String titulo;
    protected String genero;
    protected String lancamento;
    protected float aluguel;//preço
    protected String codigo;
    

    // construtores

    public void Produto() {

    }

    // metodos
    public void exibirProduto() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Lançamento: " + lancamento);
        System.out.println("Preço de aluguel: R$" + aluguel);
        System.out.println("Código do Filme: "+ codigo);
        // System.out.println("Disponibilidade: "+ disponibilidade);
    }

    public static Produto cadastrarProduto() {
        Produto produto = new Produto();
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nInsira o titulo do filme: ");
        produto.setTitulo(teclado.nextLine());

        System.out.print("\nInsira o genero do filme: ");
        produto.setGenero(teclado.nextLine());

        System.out.print("\nInsira a data de lançamento do filme: ");
        produto.setLancamento(teclado.nextLine()); // por para receber data de maneira --/--/----

        System.out.print("\nInsira o preço de aluguel do filme: R$");
        produto.setAluguel(teclado.nextFloat());
        teclado.nextLine();

        System.out.print("\nInsira o código do filme: ");
        produto.setCodigo(teclado.nextLine());
        System.out.println();

        /*
         * System.out.
         * print("\nO filme está disponivel (true) ou indisponivel (false)?: ");
         * produto.setDisponibilidade(teclado.nextBoolean());
         */

        return produto;
    }

    // getters e setters
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

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public float getAluguel() {
        return aluguel;
    }

    public void setAluguel(float aluguel) {
        this.aluguel = aluguel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

}
