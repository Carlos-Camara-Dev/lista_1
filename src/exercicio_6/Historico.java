package exercicio_6;

public class Historico {
    private Lista inicio;
    private Lista fim;

    public Historico() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean vazio() {
        return inicio == null;
    }

    public void adicionar(Pedido pedido) {
        Lista lista_nova = new Lista(pedido);
        if (vazio()) {
            inicio = lista_nova;
            fim = lista_nova;
        } else {
            fim.proximo = lista_nova;
            lista_nova.anterior = fim;
            fim = lista_nova;
        }
    }

    public void cancelar(int numero) {
        if (vazio())
            return;

        Lista atual = inicio;
        while (atual != null && atual.pedido.numero != numero) {
            atual = atual.proximo;
        }
        if (atual == null) {
            System.out.println("Pedido #" + numero + " não encontrado.");
            return;
        }
        if (atual == inicio) {
            inicio = atual.proximo;
        } else {
            atual.anterior.proximo = atual.proximo;
        }

        if (atual == fim) {
            fim = atual.anterior;
        } else {
            if (atual.proximo != null) {
                atual.proximo.anterior = atual.anterior;
            }
        }
        System.out.println("Pedido #" + numero + " foi cancelado.");
    }

    public void listar() {
        if (vazio()) {
            System.out.println("\nNenhum pedido no histórico.");
            return;
        }
        System.out.println("\n--- Histórico de Pedidos ---");
        Lista atual = inicio;
        while (atual != null) {
            System.out.println(atual.pedido.toString());
            atual = atual.proximo;
        }
        System.out.println("----------------------------");
    }
}