package projetoblockfilmes;

public class Produto {
    protected String titulo;
    protected String genero;
    protected int lancamento;
    protected double aluguel;
    protected boolean disponibilidade;

    public Produto(String titulo, String genero, int lancamento, double aluguel, boolean disponibilidade) {
        this.titulo = titulo;
        this.genero = genero;
        this.lancamento = lancamento;
        this.aluguel = aluguel;
        this.disponibilidade = disponibilidade;
    }

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

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
}
