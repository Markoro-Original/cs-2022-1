package src.docs;

/**
 * Classe para representar um logradouro.
 *
 * @author Marcos V. de Moraes
 */
public class Logradouro {
    private String nome;
    private TipoLogradouro tipoLogradouro;

    /**
     * Método construtor da classe Logradouro.
     *
     * @param nome              Nome do logradouro.
     * @param tipoLogradouro    Define o tipo do logradouro.
     */
    public Logradouro(String nome, TipoLogradouro tipoLogradouro) {
        this.nome = nome;
        this.tipoLogradouro = tipoLogradouro;
    }

    /**
     * Método para obter o nome do logradouro.
     *
     * @return  Nome do logradouro.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do logradouro.
     *
     * @param nome  Nome do logradouro.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para identificar o tipo do logradouro.
     *
     * @return  Tipo do logradouro.
     */
    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    /**
     * Definie o tipo do logradouro.
     *
     * @param tipoLogradouro    Tipo do logradouro.
     */
    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }
}
