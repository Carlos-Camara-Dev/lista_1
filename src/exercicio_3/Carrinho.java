package exercicio_3;

public class Carrinho {
    private Lista inicio;
    private Lista fim;
    private Lista navegacao;

    public Carrinho() {
        this.inicio = null;
        this.fim = null;
        this.navegacao = null;
    }

    public boolean vazio() {
        return inicio == null;
    }

    public void adicionar(Item item) {
        Lista lista = new Lista(item);
        if (vazio()) {
            inicio = lista;
            fim = lista;
            navegacao = inicio;
        } else {
            fim.proximo = lista;
            lista.anterior = fim;
            fim = lista;
        }
        System.out.println("Adicionado " + item.nome);
    }

    public void remover(String nome) {
        if (vazio()) {
            System.out.println("Carrinho está vazio.");
            return;
        }
        Lista atual = inicio;
        while (atual != null && !atual.item.nome.equalsIgnoreCase(nome)) {
            atual = atual.proximo;
        }
        if (atual == null) {
            System.out.println(nome + " não encontrado");
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
            atual.proximo.anterior = atual.anterior;
        }
        if (navegacao == atual) {
            navegacao = atual.anterior != null ? atual.anterior : inicio;
        }
        System.out.println(nome + " removido");
    }
    
    public void item_ver() {
        if (navegacao != null) {
            System.out.println(navegacao.item + " sendo reviosado");
        } else {
            System.out.println("Carrinho vazio.");
        }
    }

    public void proximo() {
        if (navegacao != null && navegacao.proximo != null) {
            navegacao = navegacao.proximo;
            item_ver();
        } else {
            System.out.println("Fim do carrinho.");
        }
    }

    public void anterior() {
        if (navegacao != null && navegacao.anterior != null) {
            navegacao = navegacao.anterior;
            item_ver();
        } else {
            System.out.println("Início do carrinho.");
        }
    }

    public void listar() {
        if (vazio()) {
            System.out.println("\nCarrinho está vazio.");
            return;
        }
        System.out.println("\n--- Itens no Carrinho ---");
        Lista atual = inicio;
        while (atual != null) {
            System.out.println("- " + atual.item.toString());
            atual = atual.proximo;
        }
    }
}