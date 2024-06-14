package TrabalhoJava.src;

abstract public class Cliente extends Pessoa{


    private int fidelidade;
    private float desconto;

    public Cliente(String nome, int idade, String cpf, int fidelidade, float desconto){
        super(nome, idade, cpf);
        this.fidelidade = fidelidade;
        this.desconto = desconto;
    }

    public int getFidelidade(){
        return this.fidelidade;
    }
    
    public void setFidelidade(int fidelidade) {
        this.fidelidade = fidelidade;
    }

    public float getDesconto() {
        return desconto;
    }
    
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

  
}
