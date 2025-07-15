package exercicio_6;

public class Main {
    public static void main(String[] args) {
        Historico restaurante = new Historico();
        restaurante.adicionar(new Pedido(201, "Charllote", 145.50));
        restaurante.adicionar(new Pedido(202, "Carmilla", 29.00));
        restaurante.adicionar(new Pedido(203, "Diablo", 82.75));

        restaurante.listar();
        restaurante.cancelar(202);
        restaurante.listar();
    }
}