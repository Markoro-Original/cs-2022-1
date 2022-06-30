package src;

import java.util.ArrayList;
import java.util.Date;


public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

    public PessoaFisica(String nome, String sexo, Date dataNascimento, ArrayList<Endereco> enderecos) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
