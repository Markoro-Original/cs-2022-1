public class AnimalTeste {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro("cachorro 1", 10);
        Animal animal2 = new Cavalo("cavalo 1", 7);
        Animal animal3 = new Preguica("preguica 1", 20);
        Animal animal4 = new Cachorro("cachorro 2", 11);
        Animal animal5 = new Cavalo("cavalo 2", 8);
        Animal animal6 = new Preguica("preguica 2", 21);
        Animal animal7 = new Cachorro("cachorro 3", 12);
        Animal animal8 = new Cavalo("cavalo 3", 9);
        Animal animal9 = new Preguica("preguica 3", 22);
        Animal animal10 = new Cachorro("cachorro 4", 13);
        
        animal1.emitirSom();
        animal2.emitirSom();
        animal3.emitirSom();
        System.out.println("\n\n");

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(animal1);
        veterinario.examinar(animal2);
        veterinario.examinar(animal3);
        System.out.println("\n\n");

        Zoologico zoologico = new Zoologico();

        zoologico.criarJaula(animal1);
        zoologico.criarJaula(animal2);
        zoologico.criarJaula(animal3);
        zoologico.criarJaula(animal4);
        zoologico.criarJaula(animal5);
        zoologico.criarJaula(animal6);
        zoologico.criarJaula(animal7);
        zoologico.criarJaula(animal8);
        zoologico.criarJaula(animal9);
        zoologico.criarJaula(animal10);

        zoologico.jaulas.get(0).emitirSom();
        zoologico.jaulas.get(0).acao();
        zoologico.jaulas.get(1).emitirSom();
        zoologico.jaulas.get(1).acao();
        zoologico.jaulas.get(2).emitirSom();
        zoologico.jaulas.get(3).emitirSom();
        zoologico.jaulas.get(3).acao();
        zoologico.jaulas.get(4).emitirSom();
        zoologico.jaulas.get(4).acao();
        zoologico.jaulas.get(5).emitirSom();
        zoologico.jaulas.get(6).emitirSom();
        zoologico.jaulas.get(6).acao();
        zoologico.jaulas.get(7).emitirSom();
        zoologico.jaulas.get(7).acao();
        zoologico.jaulas.get(8).emitirSom();
        zoologico.jaulas.get(9).emitirSom();
        zoologico.jaulas.get(9).acao();
    }
}
