package refactored.extractInterface;

public class Pagamento implements CalculoTotal{
    private float salario;
    private float comicao;
    private int vendas;

    @Override
    public float pagamentoTotal(float salario, float comicao, int vendas) {
        return salario+(comicao*vendas);
    }
}
