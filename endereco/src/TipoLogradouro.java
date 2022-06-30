package src;

public enum TipoLogradouro {
    ALAMEDA(1), AVENIDA(2), MARGINAL(3), RUA(4), RODOVIA(5), VIA(6), VIELA(7), TRAVESSA(8);

    private int valorLogradouro;
    TipoLogradouro(int valor){
        valorLogradouro = valor;
    }

    public int getValorLogradouro() {
        return valorLogradouro;
    }
    public void setValorLogradouro(int valorLogradouro) {
        this.valorLogradouro = valorLogradouro;
    }
}
