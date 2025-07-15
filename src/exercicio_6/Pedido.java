package exercicio_6;

public class Pedido {
    int numero;
    String nome;
    double total;

    public Pedido(int numero, String nome, double total) {
        this.numero = numero;
        this.nome = nome;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{numero = " + numero + ", cliente = '" + nome + '\'' + ", valor = R$" + total + '}';
    }
}