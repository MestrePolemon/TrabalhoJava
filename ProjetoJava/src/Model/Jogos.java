package Model;

public class Jogos extends Produto implements Vender{

    private String genero;
    private String plataforma;
    private String midia;

    public Jogos(String nome, float preco, int quantidade, String marca, int ano, String genero, String plataforma, String midia) {
        super(nome, preco, quantidade, marca, ano);
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

    @Override
    public void vender(int quant){
        System.out.println("TOTAL: "+quant*getPreco());
        setQuantidade(getQuantidade()-quant);
        System.out.println("VENDA DE PEÇA CONFIRMADA!!!");
    }
    
}
