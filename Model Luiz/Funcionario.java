

abstract public class Funcionario extends Pessoa {

    private float salario;

    public Funcionario(String nome, int idade, String cpf, float salario){

        super(nome, idade, cpf);
        this.salario = salario;

    }

    public double getSalario(){
        return this.salario;

    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    
}
