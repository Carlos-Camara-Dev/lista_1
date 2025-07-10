package exercicio_2;

public class Lista {
    Musica musica;
    Lista proximo;
    Lista anterior;

    public Lista(Musica musica) {
        this.musica = musica;
        this.proximo = null;
        this.anterior = null;
    }
}