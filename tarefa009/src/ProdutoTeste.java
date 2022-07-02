import java.util.ArrayList;

public class ProdutoTeste {
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();

        Produto produto1 = new Mouse("mouse 3000 dpi", "mouse sem fio");
        Produto produto2 = new Livro("1984", "George Orwell");
        Produto produto3 = new Livro("O Sol é para todos", "Harper Lee");

        carrinho.add(produto1);
        carrinho.add(produto2);
        carrinho.add(produto3);

        System.out.println(carrinho.get(0).getDescricao());
        System.out.println(carrinho.get(1).getDescricao());
        System.out.println(carrinho.get(2).getDescricao());
    }
}
