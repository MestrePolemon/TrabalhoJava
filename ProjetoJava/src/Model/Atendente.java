package Model;

public class Atendente extends Funcionario implements CalcularSalario{

    private float comissao;
    private float valorComissao;

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

    public void atualizarComissao(float valorVenda){
        this.valorComissao += valorVenda * (comissao/100);
    }

    @Override
    public void calcularSalario() {
        this.setSalario(getSalario() + valorComissao);
    }

    @Override
    public String toString() {
        return super.toString() + " Salario: " + getSalario();
    }

}