package exercicio_4;

public class Jogador {
    String nome;
    int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    @Override
    public String toString() {
        return "Jogador{nome = '" + nome + ", pontuacao=" + pontuacao + '}';
    }
}