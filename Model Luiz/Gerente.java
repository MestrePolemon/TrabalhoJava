

public class Gerente extends Funcionario {

    private float bonus;

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
}
