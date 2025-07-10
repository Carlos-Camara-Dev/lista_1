package exercicio_1;

public class Main {
    public static void main(String[] args) {
        Fila_prioritaria fila = new Fila_prioritaria();

        fila.inserir(new Paciente("Cadu da Silva", 35, 1));
        fila.inserir(new Paciente("Maria Costa", 15, 2));
        fila.inserir(new Paciente("Ruth PereLimaira", 85, 3));
        fila.inserir(new Paciente("Mario Ferreira", 70, 4));

        fila.vizualisar_pacientes();
        fila.proximo();
        fila.vizualisar_pacientes();
        fila.proximo();
        fila.vizualisar_pacientes();
        fila.proximo();
        fila.vizualisar_pacientes();
        fila.proximo();
        fila.vizualisar_pacientes();
    }
}