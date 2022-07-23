package src;

/**
 * Classe para representar um endereço residencial ou comercial.
 *
 * @author Marcos Vinícius de Moraes
 */
public class Endereco {
    private int numero;
    private String Complemento;
    private int CEP;
    private Logradouro logradouro;
    private TipoEndereco tipoEndereco;
    private Bairro bairro;

    /**
     * Método construtor da classe Endereço.
     *
     * @param numero        Número do endereço.
     * @param complemento   Complemento para o endereço.
     * @param cEP           Código de Endereçamento Postal.
     * @param logradouro    Logradouro do endereço.
     * @param tipoEndereco  Define se o endereço é residencial ou comercial.
     * @param bairro        Bairro onde o endereço está.
     */
    public Endereco(int numero, String complemento, int cEP, Logradouro logradouro, TipoEndereco tipoEndereco, Bairro bairro) {
        this.numero = numero;
        this.Complemento = complemento;
        this.CEP = cEP;
        this.logradouro = logradouro;
        this.tipoEndereco = tipoEndereco;
        this.bairro = bairro;
    }

    /**
     * Método para obter o número do endereço.
     *
     * @return  Número do endereço.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método para definir o número do endereço.
     *
     * @param numero    Número do endereço.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método para obter o complemento do endereço.
     *
     * @return  Complemento para o endereço.
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * Método para informar o complemento do endereço.
     *
     * @param complemento   Complemento para o endereço.
     */
    public void setComplemento(String complemento) {
        this.Complemento = complemento;
    }

    /**
     * Método para obter o CEP.
     *
     * @return  Código de Endereçamento Postal.
     */
    public int getCEP() {
        return CEP;
    }

    /**
     * Método para definir o CEP.
     *
     * @param cEP   Código de Endereçamento Postal.
     */
    public void setCEP(int cEP) {
        this.CEP = cEP;
    }

    /**
     * Método para obter o logradouro.
     *
     * @return Logradouro do endereço.
     */
    public Logradouro getLogradouro() {
        return logradouro;
    }

    /**
     * Método para definir o logradouro.
     *
     * @param logradouro    Logradouro do endereço.
     */
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Método para saber se o endereço é residencial ou comercial.
     *
     * @return  Define se o endereço é residencial ou comercial.
     */
    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    /**
     * Método para definir o tipo de endereço.
     *
     * @param tipoEndereco  Define se o endereço é residencial ou comercial.
     */
    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    /**
     * Método para obter o bairro.
     *
     * @return  Bairro onde o endereço está.
     */
    public Bairro getBairro() {
        return bairro;
    }

    /**
     * Método para definir o bairro.
     *
     * @param bairro    Bairro onde o endereço está.
     */
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    
}
