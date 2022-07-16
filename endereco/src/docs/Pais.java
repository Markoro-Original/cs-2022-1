package src.docs;

/**
 * Classe para representar um país.
 *
 * @author Marcos V. de Moraes
 */
public class Pais {
    private String nome;

    /**
     * Método construtor da classe Pais
     *
     * @param nome  Nome do país
     */
    Pais(String nome){
        this.nome = nome;
    }

    /**
     * Método para obter o nome do país.
     *
     * @return  Nome do país.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do país.
     *
     * @param nome  Nome do país.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
