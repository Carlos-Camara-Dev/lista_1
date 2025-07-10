package exercicio_1;

public class Fila_prioritaria {
    private Lista inicio;
    private Lista fim;

    public Fila_prioritaria() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public void inserir(Paciente paciente) {
        Lista nova_lista = new Lista(paciente);
        if (vazia()) {
            inicio = nova_lista;
            fim = nova_lista;
            System.out.println("Paciente " + paciente.nome + " inserido na fila.");
            return;
        }
        if (paciente.idade > 60) {
            if (inicio.paciente.idade <= 60) {
                nova_lista.proximo = inicio;
                inicio = nova_lista;
            } else {
                Lista atual = inicio;
                while (atual.proximo != null && atual.proximo.paciente.idade > 60) {
                    atual = atual.proximo;
                }
                nova_lista.proximo = atual.proximo;
                atual.proximo = nova_lista;
                if (nova_lista.proximo == null) {
                    fim = nova_lista;
                }
            }
        } else {
            fim.proximo = nova_lista;
            fim = nova_lista;
        }
        System.out.println("Paciente " + paciente.nome + " inserido na fila.");
    }

    public void proximo() {
        if (vazia()) {
            System.out.println("A lista de atendimento está vazia.");
            return;
        }
        Paciente paciente_fila = inicio.paciente;
        System.out.println("\n--- Próximo Paciente ---");
        System.out.println(paciente_fila.toString());
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
    }

    public void vizualisar_pacientes() {
        if (vazia()) {
            System.out.println("\nNão ha pacientes na lista.");
            return;
        }
        System.out.println("\n--- Fila de Espera ---");
        Lista atual = inicio;
        int posicao = 1;
        while (atual != null) {
            System.out.println(posicao + "º: " + atual.paciente.toString());
            atual = atual.proximo;
            posicao++;
        }
    }
}