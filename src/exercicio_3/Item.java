package exercicio_3;

public class Item {
    String nome;
    int quantidade;
    double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item{nome = '" + nome + '\'' + ", quantidade = " + quantidade + ", preco = " + preco + '}';
    }
}