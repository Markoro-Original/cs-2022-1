package extractSuperclass.refactored;

public class Cliente extends Pessoa{
    private String formapagamento;

    /*Getters e Setters*/
    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }
}
