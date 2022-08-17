package classes;

import interfaces.escreveNome;

public class NomeCompleto {
    public static void main(String[] args) {
        escreveNome nome = new escreveNome() {

            public String nomes(String nome1, String nomemeio, String sobrenome) {

                return (nome1+" "+nomemeio.charAt(0)+". "+sobrenome);
            }
        };

        System.out.println(nome.nomes("Marcos", "Vinicius", "Moraes"));
    }
}
