package src;

public enum TipoEndereco {
    COMERCIAL(1), RESIDENCIAL(2);

    private int valorEndereco;
    TipoEndereco(int valor){
        valorEndereco = valor;
    }

    public int getValorEndereco() {
        return valorEndereco;
    }
    public void setValorEndereco(int valorEndereco) {
        this.valorEndereco = valorEndereco;
    }
}
