package Model;

import java.util.List;

public class Genero {

    private String nome;
    private List<Jogos> jogos;

    public Genero(String nome, List<Jogos> jogos) {
        this.nome = nome;
        this.jogos = jogos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogos> getJogos() {
        return jogos;
    }

    public void addJogos(Jogos jogos) {
        this.jogos.add(jogos);
    }
}
