package projetoblockfilmes;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoBlockFilmes {
    
    public static void main(String[] args) {
        /*
        Case 1: Busca de produto;
        Case 2: Busca de cliente;
        Case 3: Cadastro de cliente;
        Case 4: Exclusão de cliente;
        Case 5: Cadastro de fucionário;
        Case 6: Exclusão de funcionário;
        Case 7: Cadastro de produto.
        */
        
        //MENU
        Scanner tecladoMenu = new Scanner(System.in);
        
        int opcao = 1;
        //System.out.println("Digite a ação que deseja realizar: ");
        
        switch(opcao){
            case 1 :
                opcao = 1;
                cadastrarCliente();
                break;
           /* case 2 :
                opcao = 2;
                cadastrarFuncionario();
                break;*/
        }
    }
    public static void cadastrarCliente(){
        Cliente c1 = new Cliente();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escreva seu nome: ");
        c1.setNome(teclado.nextLine());
        System.out.println("Escreva sua idade: ");
        c1.setIdade(teclado.nextInt());
        System.out.println("Escreva seu cpf: ");
        c1.setCpf(teclado.nextFloat());
        System.out.println("Escreva seu telefone: ");
        c1.setTelefone(teclado.nextFloat());
        System.out.println("Escreva seu email: ");
        c1.setEmail(teclado.nextLine());
        //buffer
        System.out.println("Escreva seu status (ativo/inativo): ");
        c1.setAtivo(teclado.nextBoolean());
        
        ArrayList <Cliente> listaCliente = new ArrayList();
        listaCliente.add(c1);
        
        /*Predicate<Cliente> condicao = cli -> cli.getAtivo()==false;
        cli.removeIf(condicao);*/
    }
    
    public static void cadastrarFuncionario(){
        Funcionario f1 = new Funcionario("Jose",22,"Caixa",900,1999786,"RuaModestoCosta",true);
        
        ArrayList <Funcionario> listaFuncionario = new ArrayList();
        listaFuncionario.add(f1);
    }
    
}
