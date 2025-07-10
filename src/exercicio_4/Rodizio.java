package exercicio_4;

public class Rodizio {
    private Lista ultimo;
    private int quantidade;

    public Rodizio() {
        this.ultimo = null;
        this.quantidade = 0;
    }

    public boolean vazio() {
        return ultimo == null;
    }

    public void adicionar(Jogador jogador) {
        Lista lista_nova = new Lista(jogador);
        if (vazio()) {
            ultimo = lista_nova;
            lista_nova.proximo = ultimo;
        } else {
            lista_nova.proximo = ultimo.proximo;
            ultimo.proximo = lista_nova;
            ultimo = lista_nova;
        }
        quantidade++;
        System.out.println(jogador.nome + " entrou na partida.");
    }

    public void avancar() {
        if (!vazio()) {
            ultimo = ultimo.proximo;
            System.out.println("\nÉ a vez de " + ultimo.proximo.jogador.nome);
        } else {
            System.out.println("Não há jogadores.");
        }
    }

    public void remover(String nome) {
        if (vazio()) {
            System.out.println("Jogo vazio.");
            return;
        }
        Lista atual = ultimo.proximo;
        Lista anterior = ultimo;
        boolean encontrado = false;
        for (int i = 0; i < quantidade; i++) {
            if (atual.jogador.nome.equalsIgnoreCase(nome)) {
                encontrado = true;
                break;
            }
            anterior = atual;
            atual = atual.proximo;
        }
        if (!encontrado) {
            System.out.println(nome + " nao encontrado");
            return;
        }
        if (quantidade == 1) {
            ultimo = null;
        } else {
            anterior.proximo = atual.proximo;
            if (atual == ultimo)
                ultimo = anterior;
        }
        quantidade--;
        System.out.println(nome + " foi removido do jogo.");
    }
}