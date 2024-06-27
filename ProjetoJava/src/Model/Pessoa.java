package Model;

abstract public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public static boolean verificarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11 || cpf.chars().allMatch(Character::isDigit)) {
            return false;
        }

        int[] numeros = cpf.chars().map(Character::getNumericValue).toArray();

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (10 - i);
        }

        int digito1 = 11 - (soma % 11);
        if (digito1 >= 10) digito1 = 0;

        soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (11 - i);
        }
        soma += digito1 * 2;

        int digito2 = 11 - (soma % 11);
        if (digito2 >= 10) digito2 = 0;

        return digito1 == numeros[9] && digito2 == numeros[10];
    }



    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "  Idade: " + this.idade + "  CPF: " + this.cpf;
    }
    
}
