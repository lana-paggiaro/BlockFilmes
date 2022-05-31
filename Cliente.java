package projetoblockfilmes;

public class Cliente extends Pessoa implements IPessoa{
    protected String nome;
    protected int idade;
    protected float cpf;
    protected float telefone;
    protected String email;

    public Cliente(String nome, int idade, float cpf, float telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
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

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void exibirDados(){
        getNome();
        getIdade();
        getCpf();
        getTelefone();
        getEmail();
    }
}
