public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de preguica.");
    }
    
    @Override
    public void acao(){
        System.out.println("Preguica subindo em arvore.");
    }
}
