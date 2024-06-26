package Model;

public class Atendente extends Funcionario {

    private float comissao;

    public Atendente(String nome, int idade, String cpf, float comissao, float salario) {
        super(nome, idade, cpf, salario);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}