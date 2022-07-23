package src;

/**
 * Classe para representar uma cidade.
 *
 * @author Marcos Vinícius de Moraes
 */
public class Cidade {
    private String nome;
    private Estado estado;

    /**
     * Método construtor da classe Cidade.
     *
     * @param nome      Nome da cidade.
     * @param estado    Estado ao qual a cidade pertence.
     */
    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
    }

    /**
     * Método para obter o nome da cidade.
     *
     * @return      Nome da cidade.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da cidade.
     *
     * @param nome      Nome da cidade.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o estado ao qual a cidade pertence.
     *
     * @return      Estado ao qual a cidade pertence.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Método para definir o estado ao qual a cidade pertence.
     *
     * @param estado        Estado ao qual a cidade pertence.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
}
