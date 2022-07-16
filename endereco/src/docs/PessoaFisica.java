package src.docs;

import java.util.ArrayList;
import java.util.Date;


/**
 * Classe para representar uma pessoa.
 *
 * @author Marcos V. de Moraes
 */
public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

    /**
     * Método construtor da classe PessoalFisica
     *
     * @param nome              Nome da pessoa.
     * @param sexo              Sexo da pessoa.
     * @param dataNascimento    Data de nascimento da pessoa.
     * @param enderecos         Endereço da pessoa.
     */
    public PessoaFisica(String nome, String sexo, Date dataNascimento, ArrayList<Endereco> enderecos) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
    }

    /**
     * Método para obter o nome da pessoa.
     *
     * @return  Nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da pessoa.
     *
     * @param nome  Nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o sexo da pessoa.
     *
     * @return  Sexo da pessoa.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Método para definir o sexo da pessoa.
     *
     * @param sexo  Sexo da pessoa.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método para obter a data de nascimento da pessoa.
     *
     * @return  Data de nascimento da pessoa.
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Método para definir a data de nascimento da pessoa.
     *
     * @param dataNascimento    Data de nascimento da pessoa.
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Método para obter o(s) endereço(s) da pessoa.
     *
     * @return  Endereço da pessoa.
     */
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * Método para definir o(s) endereço(s) da pessoa.
     *
     * @param enderecos Endereço da pessoa.
     */
    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
