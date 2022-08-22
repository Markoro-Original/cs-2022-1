package refactored.extractMethod;

public class Pagamento {
    private float salario;
    private float comicao;
    private int vendas;

    public float pagamentoTotal(){
        float total = calculoTotal(salario, comicao, vendas);
        return total;
    }

    public float calculoTotal(float salario, float comicao, int vendas){

        return salario+(comicao*vendas);
    }
}
