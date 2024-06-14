package TrabalhoJava.src;

 abstract public class Funcionario extends Pessoa {

    private float salario, bonus;

    public Funcionario(String nome, int idade, String cpf, float bonus, float salario){

        super(nome, idade, cpf);
        this.salario = salario;
        this.bonus = bonus;

    }

    public double getSalario(){
        return this.salario;

    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getBonus() {
        return bonus;
    }

    
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    

    
}
