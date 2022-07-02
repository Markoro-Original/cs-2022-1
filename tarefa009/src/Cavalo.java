public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de relinche");        
    }

    @Override
    public void acao(){
        System.out.println("Cavalo correndo");
    }    
}
