package projetoblockfilmes;

public class Funcionario extends Pessoa implements IPessoa{
    protected String cargo;
    protected double salario;
    protected float telefone;
    protected String endereco;
    protected boolean ativoF;

    public Funcionario(String nome, int idade, String cargo, double salario, float telefone, String endereco, boolean ativoF) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
        this.ativoF = ativoF;
    }
    public Funcionario(){

    }

    public boolean isAtivoF() {
        return ativoF;
    }

    public void setAtivo(boolean ativoF) {
        this.ativoF = ativoF;
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
            
    @Override
    public void exibirDados(){
        getNome();
        getIdade();
        getCargo();
        getSalario();
        getTelefone();
        getEndereco();
    }
}
