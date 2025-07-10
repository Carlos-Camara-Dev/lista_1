package exercicio_1;

public class Paciente {
    String nome;
    int idade;
    int senha;

    public Paciente(String nome, int idade, int senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Paciente [Senha: " + senha + ", Nome: " + nome + ", Idade: " + idade + "]";
    }
}