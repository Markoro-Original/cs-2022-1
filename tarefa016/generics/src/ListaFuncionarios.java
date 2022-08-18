import java.util.ArrayList;
import java.util.List;

public class ListaFuncionarios {

    public List<Funcionario> addFuncionarioWithGenerics(int quant){

        List<Funcionario> funcionario = new ArrayList<Funcionario>();
        for(int i = 0; i < quant; i++){
            funcionario.add(new Funcionario());
        }
        return funcionario;
    }

    public static void main(String[] args) {

        ListaFuncionarios app = new ListaFuncionarios();

        int quant = 5;
        int cont = 1;

        List<Funcionario> lista = app.addFuncionarioWithGenerics(quant);
        System.out.println("Quantidade de funcionários na lotação: " + lista.size());
        System.out.println("Lista de funcionários");
        for(Funcionario ap : lista){
            System.out.println(ap.toString() + " 0" + cont++ + ".");
        }
    }
}
