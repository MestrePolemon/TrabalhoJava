package Model;

public class Gerente extends Funcionario implements CalcularSalario{

    private float bonus;
    private float valorBonus;

    public Gerente(String nome, int idade, String cpf, float bonus, float salario) {
        super(nome, idade, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public void atualizarBonus(float valorVenda){
        this.valorBonus += valorVenda * (bonus/50);

    }


    @Override
    public void calcularSalario() {
        this.setSalario(getSalario() + valorBonus);

    }

    @Override
    public String toString() {
        return super.toString() + "Salario: " + getSalario();
    }


}
