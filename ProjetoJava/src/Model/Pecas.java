package Model;

public class Pecas extends Produto implements Vender {

    private String tipo;



    public Pecas(String nome, float preco, int quantidade, String marca, int ano, String tipo) {
        super(nome, preco, quantidade, marca, ano);
        this.tipo = tipo;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }

    @Override
    public void vender(int quant){

        System.out.println("TOTAL: "+quant*getPreco());
        setQuantidade(getQuantidade()-quant);
        System.out.println("VENDA DE PEÇA CONFIRMADA!!!");
    }
}
