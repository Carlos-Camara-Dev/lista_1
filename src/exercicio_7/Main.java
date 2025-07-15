package exercicio_7;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.executar(new Operacao("adicionar", "Olá"));
        editor.executar(new Operacao("adicionar", " Mundo"));
        editor.executar(new Operacao("adicionar", "!"));

        editor.desfazer();
        editor.desfazer();
        editor.refazer();
        editor.executar(new Operacao("remover", " Mundo"));
        editor.refazer();
        editor.desfazer();
    }
}