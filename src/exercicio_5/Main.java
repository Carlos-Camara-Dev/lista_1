package exercicio_5;

public class Main {
    public static void main(String[] args) {
        Navegador brave = new Navegador();
        brave.visitar(new Pagina("google.com", "Google"));
        brave.visitar(new Pagina("youtube.com", "Youtube"));
        brave.visitar(new Pagina("ifrn.com", "IFRN"));

        brave.voltar();
        brave.voltar();
        brave.avancar();
        brave.visitar(new Pagina("Gmail.com", "Gmail"));
        brave.avancar();
    }
}