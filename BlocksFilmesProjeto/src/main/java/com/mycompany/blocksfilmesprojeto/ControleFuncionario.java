package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList;

public class ControleFuncionario {

    private static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

    public static ArrayList<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    //exceção de return null??? socorro*/

    public static Funcionario cadastrarFuncionario() {
        Funcionario funcionario = Funcionario.cadastrarFuncionario();
        listaFuncionario.add(funcionario);
        System.out.println("O funcionario " + funcionario.getNome() + " foi cadastrado com sucesso!\n");

        return funcionario;
    }

    public static Funcionario procurarFuncionario(String codigoProcurar) {

        for (Funcionario funcionario : listaFuncionario) {
            if (!(funcionario.getNome().toLowerCase().startsWith(codigoProcurar.toLowerCase()))) {
               
            } else {
                System.out.println("\n");
                return funcionario;
            }
        }
        throw new IllegalArgumentException("Funcionario não cadastrado.");
        
    }

    public static void excluirFuncionario(String codigoExcluir) {
        Funcionario funcionario = procurarFuncionario(codigoExcluir);

        System.out.println("\nTem certeza que deseja excluir " + funcionario.getNome() + " ?");

        if (BlocksFilmesProjeto.opcaoSN()) {
            listaFuncionario.remove(funcionario);
            System.out.println("O funcionario " + funcionario.getNome() + " foi excluido com sucesso!");
        } 

    }
}





