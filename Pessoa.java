package TrabalhoJava.src;

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

    public String getCpf(){
        return this.cpf;
    }

    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "  Idade: " + this.idade + "  CPF: " + this.cpf + "  Endereço: ";
    }
    
}
