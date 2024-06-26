package Model;

public class Jogos extends Produto{

    private String genero;
    private String plataforma;
    private String midia;

    public Jogos(String nome, String id, double preco, int quantidade, String marca, int ano, String genero, String plataforma, String midia) {
        super(nome, id, preco, quantidade, marca, ano);
        this.genero = genero;
        this.plataforma = plataforma;
        this.midia = midia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + ", id: " + getId() + ", preco: " + getPreco() + ", quantidade: " + getQuantidade() + ", produtora: " + getMarca() + ", ano: " + getAno() + ", genero: " + genero + ", plataforma: " + plataforma + ", midia: " + midia + "\n";
    }
}
