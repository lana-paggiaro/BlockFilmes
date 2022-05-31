package projetoblockfilmes;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoBlockFilmes {
    
    ArrayList <Cliente> listaCliente = new ArrayList();
    ArrayList <Funcionario> listaFuncionario = new ArrayList();
    
    public void cadastrarCliente(){
        Scanner teclado = new Scanner(System.in);
        Cliente c1 = new Cliente();
        System.out.println("Escreva seu nome:");
        teclado.setNome();
        System.out.println("\nEscreva sua idade: ");
        System.out.println("\nDigite seu cpf: ");
        System.out.println("\nDigite seu telefone: ");
        System.out.println("\nDigite seu e-mail: ");
        listaCliente.add(c1);
    }
    
    public void cadastrarFuncionario(){
        Funcionario f1 = new Funcionario("Jose",22,"Caixa",900,1999786,"RuaModestoCosta");
        listaFuncionario.add(f1);
    }
    
    public static void main(String[] args) {
        //Boa sorte
        
        
    }
    
}
