package extractInterface.codigoinicial;

public class Pagamento {
    private float salario;
    private float comicao;
    private int vendas;

    public float pagamentoTotal(float salario, float comicao, int vendas){
        return salario+(comicao*vendas);
    }
}
