package Model;

public class Consoles extends Produto{

    private String tipo;
    private String modelo;
    private String memoria;

    public Consoles(String nome, String id, double preco, int quantidade, String marca, int ano, String tipo, String modelo, String memoria) {
        super(nome, id, preco, quantidade, marca, ano);
        this.tipo = tipo;
        this.modelo = modelo;
        this.memoria = memoria;
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

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo + ", Modelo: " + modelo + ", Memória: " + memoria;
    }
}
