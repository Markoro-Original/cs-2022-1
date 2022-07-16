package src.docs;

/**
 * Enum pra representar os possíveis tipos de logradouro.
 *
 * @author Marcos V. de Moraes
 */
public enum TipoLogradouro {
    ALAMEDA(1), AVENIDA(2), MARGINAL(3), RUA(4), RODOVIA(5), VIA(6), VIELA(7), TRAVESSA(8);

    private int valorLogradouro;

    /**
     * Método construtor do enum TipoLogradouro
     *
     * @param valor     Valor que define o tipo de logradouro.
     */
    TipoLogradouro(int valor){
        valorLogradouro = valor;
    }

    /**
     * Método para obter o valor que define o tipo de logradouro.
     *
     * @return  Valor que define o tipo de logradouro.
     */
    public int getValorLogradouro() {
        return valorLogradouro;
    }

    /**
     * Método para definir o valor que irá definir o tipo de logradouro.
     *
     * @param valorLogradouro   Valor que define o tipo de logradouro.
     */
    public void setValorLogradouro(int valorLogradouro) {
        this.valorLogradouro = valorLogradouro;
    }
}
