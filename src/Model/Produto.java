package Model;

public abstract class Produto {


    private String nome;
    private String id;
    private double preco;
    private int quantidade;
    private String marca;
    private int ano;


    public Produto(String nome, String id, double preco, int quantidade, String marca, int ano) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.marca = marca;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", id: " + id + ", preco: " + preco + ", quantidade: " + quantidade + ", marca: " + marca + ", ano:" + ano ;
    }
}
