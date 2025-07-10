package exercicio_1;

public class Lista {
    Paciente paciente;
    Lista proximo;

    public Lista(Paciente paciente) {
        this.paciente = paciente;
        this.proximo = null;
    }
}