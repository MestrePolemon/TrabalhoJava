package Model;

public class Consoles extends Produto implements Vender{

    private String tipo;
    private String memoria;

    public Consoles(String nome, float preco, int quantidade, String marca, int ano, String tipo, String memoria) {
        super(nome, preco, quantidade, marca, ano);
        this.tipo = tipo;
        this.memoria = memoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo + ", Memória: " + memoria;
    }

    @Override
    public void vender(int quant){

        System.out.println("TOTAL: "+quant*getPreco());
        setQuantidade(getQuantidade()-quant);
        System.out.println("VENDA DE CONSOLE CONFIRMADA!!!");
        
    }

}
