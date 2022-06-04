package projetoblockfilmes;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoBlockFilmes {
    
    public static void main(String[] args) {
        
        Scanner tecladoMenu = new Scanner(System.in);
        
        System.out.println("Digite o número correspondente à ação que deseja realizar");
        System.out.println("Opção 1 -  Cadastro de Cliente"); //feito
        System.out.println("Opção 2 -  Cadastro de Funcionário"); //feito
        System.out.println("Opção 3 -  Cadastro de Produto");
        System.out.println("Opção 4 -  Verificação de Cliente");
        System.out.println("Opção 5 -  Verificação de Funcionário");
        System.out.println("Opção 6 -  Verificação de Produto");
        System.out.println("Opção 7 -  Exclusão de Cliente");
        System.out.println("Opção 8 -  Exclusão de Funcionário");
        System.out.println("Opção 9 -  Exclusão de Produto");
        System.out.println("Opção 0 -  Encerrar programa");
        system.out.println("");

        int opcao = 0;
        opcao = Integer.parseInt(tecladoMenu.nextLine());

        switch(opcao){
            case 1 :
                opcao = 1;
                cadastrarCliente();
                break;
            case 2 :
                opcao = 2;
                cadastrarFuncionario();
                break;
        }
    }
    public static void cadastrarCliente(){
        Cliente cliente = new Cliente();
        //Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        cliente.setNome(teclado.nextLine());

        System.out.println("Digite sua idade: ");
        cliente.setIdade(teclado.nextInt());

        System.out.println("Digite seu cpf: ");
        cliente.setCpf(teclado.nextFloat());

        System.out.println("Digite seu telefone: ");
        cliente.setTelefone(teclado.nextFloat());

        System.out.println("Digite seu email: ");
        cliente.setEmail(teclado.nextLine());
        cliente.clear();
        //buffer
        System.out.println("Digite seu status (ativo/inativo): ");
        cliente.setAtivo(teclado.nextBoolean());
        
        ArrayList <Cliente> listaCliente = new ArrayList();
        listaCliente.add(cliente);
        
    }
    
    public static void cadastrarFuncionario(){
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Digite seu nome: ");
        funcionario.setNome(teclado.nextLine());

        System.out.println("Digite sua idade: ");
        funcionario.setIdade(teclado.nextInt());

        System.out.println("Digite seu cargo: ");
        funcionario.setCargo(teclado.nextLine());

        System.out.println("Digite seu salario: ");
        funcionario.setSalario(teclado.nextFloat());

        System.out.println("Digite seu telefone: ");
        funcionario.setTelefone(teclado.nextLine());
        funcionario.clear();
        //buffer
        System.out.println("Digite seu endereço: ");
        funcionario.setEndereco(teclado.nextLine());

        System.out.println("Digite seu status (ativo/inativo):");
        funcionario.setAtivo(teclado.nextBoolean());

        ArrayList <Funcionario> listaFuncionario = new ArrayList();
        listaFuncionario.add(funcionario);
    }

   
    
}
