package com.mycompany.blocksfilmesprojeto;

import java.util.ArrayList; 

public class ControleFuncionario {
    
    private static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    listaFuncionario.add(new Funcionario("Everton", 52, "45738593848", "everTown@yahoo.com.br", "atendente", "1500"));
    listaFuncionario.add(new Funcionario("Rosangela", 29, "84935867495", "rosan@gmail.com", "faxineira", "1100"));
    //exceção de return null??? socorro*/

    public static Funcionario cadastrarFuncionario() {
        Funcionario funcionario = Funcionario.cadastrarFuncionario();
        listaFuncionario.add(funcionario);
        System.out.println("O funcionario " + funcionario.getNome() + " foi cadastrado com sucesso!\n");

        return funcionario;
    }

    public static Funcionario procurarFuncionario(String codigoProcurar) {
        
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getNome().toLowerCase().startsWith(codigoProcurar.toLowerCase())) {
                return funcionario;
            }
        }
        return null;
        /*try{
            return null;
        }
        catch (NullPointerException e) {
            System.out.println("ERRO!\nNão há funcionario com esse nome registrado!");
        }*/
    }

    public static void excluirFuncionario(String codigoExcluir) {
        Funcionario funcionario = procurarFuncionario(codigoExcluir);
        
        System.out.println("\nTem certeza que deseja excluir " + funcionario.getNome() +" ?");

        if(BlocksFilmesProjeto.opcaoSN()){
            listaFuncionario.remove(funcionario);
            System.out.println("O funcionario" +funcionario.getNome() +" foi excluido com sucesso!");
        }
        else
        System.out.println("Voltando ao menu principal.");
        
    }
}


