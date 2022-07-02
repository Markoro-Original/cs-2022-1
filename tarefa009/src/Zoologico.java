import java.util.ArrayList;

public class Zoologico {
    public ArrayList<Animal> jaulas = new ArrayList<Animal>();

    public void criarJaula(Animal nova_jaula){
        jaulas.add(nova_jaula);
    }
}
