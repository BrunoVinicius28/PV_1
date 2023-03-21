import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Plataforma {
    String nome;
    ArrayList<Jogo> jogos;

    public Plataforma(String nome) {
        nome = nome;
        jogos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public void mostrarInformacoes() {
        System.out.println("Plataforma: " + nome);
        System.out.println("Jogos:");
        for (Jogo jogo : jogos) {
            System.out.println("- " + jogo.getNome() + ", Preço: R$" + jogo.getPreco() + ", Tem DLC: " + jogo.temDlc());
        }
    }

    public void mostrarJogoMaisCaroMaisBarato() {
        Jogo jogoMaisCaro = Collections.max(jogos, Comparator.comparing(Jogo::getPreco));
        Jogo jogoMaisBarato = Collections.min(jogos, Comparator.comparing(Jogo::getPreco));
        System.out.println("Jogo mais caro: " + jogoMaisCaro.getNome() + ", Preço: R$" + jogoMaisCaro.getPreco());
        System.out.println("Jogo mais barato: " + jogoMaisBarato.getNome() + ", Preço: R$" + jogoMaisBarato.getPreco());
    }

    public int contarJogosComDlc() {
        int count = 0;
        for (Jogo jogo : jogos) {
            if (jogo.temDlc()) {
                count++;
            }
        }
        return count;
    }
}
