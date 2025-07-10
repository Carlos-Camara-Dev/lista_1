package exercicio_2;

public class Playlist {
    private Lista musica_atual;
    private int tamanho;

    public Playlist() {
        this.musica_atual = null;
        this.tamanho = 0;
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public void adicionar(Musica musica) {
        Lista lista_nova = new Lista(musica);
        if (vazia()) {
            musica_atual = lista_nova;
            lista_nova.proximo = lista_nova;
            lista_nova.anterior = lista_nova;
        } else {
            Lista ultimo = musica_atual.anterior;
            ultimo.proximo = lista_nova;
            lista_nova.anterior = ultimo;
            lista_nova.proximo = musica_atual;
            musica_atual.anterior = lista_nova;
        }
        tamanho++;
        System.out.println(musica.nome + " adicionada à playlist.");
    }

    public void musica_remover() {
        if (vazia()) {
            System.out.println("Playlist está vazia.");
            return;
        }
        System.out.println(musica_atual.musica.nome + " foi removida.");
        if (tamanho == 1) {
            musica_atual = null;
        } else {
            Lista lista_anterior = musica_atual.anterior;
            Lista lista_proxima = musica_atual.proximo;
            
            lista_anterior.proximo = lista_proxima;
            lista_proxima.anterior = lista_anterior;
            musica_atual = lista_proxima;
        }
        tamanho--;
    }

    public void tocar() {
        if (vazia()) {
            System.out.println("Playlist está vazia.");
        } else {
            System.out.println("Tocando agora: " + musica_atual.musica.toString());
        }
    }

    public void avancar() {
        if (!vazia()) {
            musica_atual = musica_atual.proximo;
            tocar();
        } else {
             System.out.println("Playlist está vazia.");
        }
    }

    public void voltar() {
        if (!vazia()) {
            musica_atual = musica_atual.anterior;
            tocar();
        } else {
             System.out.println("Playlist está vazia.");
        }
    }
}