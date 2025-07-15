package exercicio_7;

public class Editor {
    private StringBuilder conteudo;
    private Lista acao_atual;

    public Editor() {
        this.conteudo = new StringBuilder();
        this.acao_atual = null;
    }

    public void executar(Operacao op) {
        if ("adicionar".equals(op.tipo)) {
            conteudo.append(op.texto);
        } else if ("remover".equals(op.tipo)) {
            int start = conteudo.length() - op.texto.length();
            if (start >= 0 && conteudo.substring(start).equals(op.texto)) {
                conteudo.delete(start, conteudo.length());
            }
        }

        Lista acao_nova = new Lista(op);
        if (acao_atual != null) {
            acao_atual.proximo = acao_nova;
            acao_nova.anterior = acao_atual;
        }
        acao_atual = acao_nova;
        imprimir();
    }

    public void desfazer() {
        if (acao_atual == null) {
            System.out.println("Nada a desfazer.");
            return;
        }

        Operacao op = acao_atual.operacao;
        if ("adicionar".equals(op.tipo)) {
            int start = conteudo.length() - op.texto.length();
            if (start >= 0) {
                conteudo.delete(start, conteudo.length());
            }
        } else if ("remover".equals(op.tipo)) {
            conteudo.append(op.texto);
        }

        acao_atual = acao_atual.anterior;
        System.out.println("Ação desfeita.");
        imprimir();
    }

    public void refazer() {
        Lista proximaAcao = (acao_atual == null) ? null : acao_atual.proximo;

        if (acao_atual != null && acao_atual.proximo == null) {
            proximaAcao = null;
        } else if (acao_atual == null && nao_vazio()) {
            proximaAcao = get_primeira_acao();
        } else {
            proximaAcao = acao_atual.proximo;
        }

        if (proximaAcao == null) {
            System.out.println("Nada a refazer.");
            return;
        }

        acao_atual = proximaAcao;
        Operacao op = acao_atual.operacao;

        if ("adicionar".equals(op.tipo)) {
            conteudo.append(op.texto);
        } else if ("remover".equals(op.tipo)) {
            int start = conteudo.length() - op.texto.length();
            if (start >= 0) {
                conteudo.delete(start, conteudo.length());
            }
        }
        System.out.println("Ação refeita.");
        imprimir();
    }

    private boolean nao_vazio() {
        if (acao_atual == null)
            return false;
        Lista cursor = acao_atual;
        while (cursor.anterior != null) {
            cursor = cursor.anterior;
        }
        return cursor != null;
    }

    private Lista get_primeira_acao() {
        if (acao_atual == null)
            return null;
        Lista cursor = acao_atual;
        while (cursor.anterior != null) {
            cursor = cursor.anterior;
        }
        return cursor;
    }

    private void imprimir() {
        System.out.println("=> Conteúdo: [" + conteudo.toString() + "]");
    }
}