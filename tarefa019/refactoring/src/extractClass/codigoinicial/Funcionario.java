package extractClass.codigoinicial;

public class Funcionario {
    private String nome;
    private String cpf;
    private int vendas;
    private float salario;
    private float comicao;

    /*Getters e Setters*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComicao() {
        return comicao;
    }

    public void setComicao(float comicao) {
        this.comicao = comicao;
    }
}
