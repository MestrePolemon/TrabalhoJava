package Model;

public class Pecas extends Produto{

    private String tipo;
    private String modelo;

    public Pecas(String nome, String id, double preco, int quantidade, String marca, int ano, String tipo, String modelo) {
        super(nome, id, preco, quantidade, marca, ano);
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo + ", Modelo: " + modelo;
    }

}
