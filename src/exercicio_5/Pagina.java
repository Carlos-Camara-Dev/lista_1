package exercicio_5;

public class Pagina {
    String url;
    String titulo;

    public Pagina(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "PaginaWeb{url = '" + url + '\'' + ", titulo='" + titulo + '\'' + '}';
    }
}