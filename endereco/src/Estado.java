package src;

/**
 * Classe para representar uma confederação de um país.
 *
 * @author Marcos Vinícius de Moraes
 */
public class Estado {
    private String sigla;
    private String nome;
    private Pais pais;

    /**
     * Método construtor da classe Estado
     *
     * @param sigla     Sigla que representa o estado.
     * @param nome      Nome do estado.
     * @param pais      País ao qual o estado pertence.
     */
    Estado(String sigla, String nome, Pais pais){
        this.sigla = sigla;
        this.nome = nome;
    }

    /**
     * Método para obter a sigla do estado.
     *
     * @return  Sigla que representa o estado.
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Método para definir a sigla do estado.
     *
     * @param sigla Sigla que representa o estado.
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * Método para obter o país ao qual o estado pertence.
     *
     * @return  País ao qual o estado pertence.
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Método para definir a qual país o estado pertence.
     *
     * @param pais  País ao qual o estado pertence.
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Método para obter o nome do estado.
     *
     * @return  Nome do estado.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do estado.
     *
     * @param nome  Nome do estado.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
