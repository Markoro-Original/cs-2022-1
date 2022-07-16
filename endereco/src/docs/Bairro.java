package src.docs;

/**
 * Classe para representar um bairro.
 *
 * @author Marcos Vinícius de Moraes
 */
public class Bairro {
    private String nome;
    private Cidade cidade;

    /**
     * Método construtor da classe Bairro
     *
     * @param nome      Nome do bairro
     * @param cidade    Cidade onde o bairro é situado
     */
    public Bairro(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    /**
     * Método para obter o nome do bairro.
     *
     * @return      o nome do bairro.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do bairro.
     *
     * @param nome      Nome do bairro.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter a cidade onde o bairro se situa.
     *
     * @return      a cidade onde o bairro está.
     */
    public Cidade getCidade() {
        return cidade;
    }

    /**
     * Método para definir a cidade onde o bairro está situado.
     *
     * @param cidade        Cidade onde está o bairro.
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    
}
