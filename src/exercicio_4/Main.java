package exercicio_4;

public class Main {
    public static void main(String[] args) {

        Rodizio jogo = new Rodizio();
        jogo.adicionar(new Jogador("Carmilla"));
        jogo.adicionar(new Jogador("Charllote"));
        jogo.adicionar(new Jogador("Daphine"));
        jogo.adicionar(new Jogador("Darla"));

        jogo.avancar();
        jogo.avancar();
        jogo.remover("Carla");
        jogo.avancar();
        jogo.avancar();
        jogo.avancar();
    }
}