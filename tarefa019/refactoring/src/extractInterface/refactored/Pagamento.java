package extractInterface.refactored;

public class Pagamento implements CalculoTotal{
    private float salario;
    private float comicao;
    private int vendas;

    @Override
    public float pagamentoTotal(float salario, float comicao, int vendas) {
        return salario+(comicao*vendas);
    }

    /*Getters e Setters*/
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

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
}
