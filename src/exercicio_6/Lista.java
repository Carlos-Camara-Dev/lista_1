package exercicio_6;

public class Lista {
    Pedido pedido;
    Lista proximo;
    Lista anterior;

    public Lista(Pedido pedido) {
        this.pedido = pedido;
    }
}