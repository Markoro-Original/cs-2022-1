package codigoInicial.extractMethod;

public class Pagamento {
    private float salario;
    private float comicao;
    private int vendas;

    public float pagamentoTotal(float salario, float comicao, int vendas){
        float total;
        total = comicao*vendas;
        total += salario;
        return total;
    }
}
