package exercicio_2;

public class Musica {
    String nome;
    int duracao_segundos;

    public Musica(String nome, int duracao_segundos) {
        this.nome = nome;
        this.duracao_segundos = duracao_segundos;
    }

    @Override
    public String toString() {
        return "Musica{nome = '" + nome + "', duracao = " + duracao_segundos + "s}";
    }
}