package src;

public class Endereco {
    private int numero;
    private String Complemento;
    private int CEP;
    private Logradouro logradouro;
    private TipoEndereco tipoEndereco;
    private Bairro bairro;

    public Endereco(int numero, String complemento, int cEP, Logradouro logradouro, TipoEndereco tipoEndereco, Bairro bairro) {
        this.numero = numero;
        this.Complemento = complemento;
        this.CEP = cEP;
        this.logradouro = logradouro;
        this.tipoEndereco = tipoEndereco;
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        this.Complemento = complemento;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int cEP) {
        this.CEP = cEP;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    
}
