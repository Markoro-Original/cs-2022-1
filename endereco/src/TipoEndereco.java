package src;

/**
 * Enum pra representar os possíveis tipos de endereço.
 *
 * @author Marcos Vinícius de Moraes
 */
public enum TipoEndereco {
    COMERCIAL(1), RESIDENCIAL(2);

    private int valorEndereco;

    /**
     * Método construtor do enum TipoEndereco
     *
     * @param valor     Valor 1 ou 2, que irá definir o tipo do endereço.
     */
    TipoEndereco(int valor){
        valorEndereco = valor;
    }

    /**
     * Método para obter o valor que define o tipo do endereço.
     *
     * @return  Valor que define o tipo de endereço.
     */
    public int getValorEndereco() {
        return valorEndereco;
    }

    /**
     * Método que define o valor que irá definir o tipo do endereço.
     *
     * @param valorEndereco     Valor que define o tipo de endereço.
     */
    public void setValorEndereco(int valorEndereco) {
        this.valorEndereco = valorEndereco;
    }
}
