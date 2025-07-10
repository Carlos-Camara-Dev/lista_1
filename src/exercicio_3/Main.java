package exercicio_3;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Item("Java", 2, 49.70));
        carrinho.adicionar(new Item("SSD", 3, 350.87));
        carrinho.adicionar(new Item("Mouse sem Fio", 2, 123.00));

        carrinho.listar();
        carrinho.remover("SSD");
        carrinho.listar();
        carrinho.item_ver();
        carrinho.proximo();
        carrinho.anterior();
    }
}