package exercicio_5;

public class Navegador {
    private Lista pagina_atual;

    public Navegador() {
        this.pagina_atual = null;
    }

    public void visitar(Pagina pagina_nova) {
        Lista lista_nova = new Lista(pagina_nova);
        if (pagina_atual != null) {
            pagina_atual.proximo = lista_nova;
            lista_nova.anterior = pagina_atual;
        }
        pagina_atual = lista_nova;
        System.out.println("Visitando " + pagina_atual.pagina.titulo);
    }

    public void voltar() {
        if (pagina_atual != null && pagina_atual.anterior != null) {
            pagina_atual = pagina_atual.anterior;
            System.out.println("Voltando para " + pagina_atual.pagina.titulo);
        } else {
            System.out.println("Não há histórico anterior.");
        }
    }

    public void avancar() {
        if (pagina_atual != null && pagina_atual.proximo != null) {
            pagina_atual = pagina_atual.proximo;
            System.out.println("Avançando para " + pagina_atual.pagina.titulo);
        } else {
            System.out.println("Não há histórico posterior.");
        }
    }
}