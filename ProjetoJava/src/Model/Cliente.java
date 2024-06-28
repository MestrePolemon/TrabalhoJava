package Model;

public class Cliente extends Pessoa {


    private boolean fidelidade;


    public Cliente(String nome, int idade, String cpf, boolean fidelidade){
        super(nome, idade, cpf);
        this.fidelidade = fidelidade;

    }

    public boolean getFidelidade(){
        return this.fidelidade;
    }
    
    public void setFidelidade(boolean fidelidade) {
        this.fidelidade = fidelidade;
    }

    @Override
    public String toString() {
        if(fidelidade)
            return super.toString() + " Fidelidade: Sim";
        else
            return super.toString() + " Fidelidade: Não";
    }


  
}
