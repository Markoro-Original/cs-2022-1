public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void acao(){
        System.out.println("Cachorro correndo");
    }
}
