public class SalaDeAula {
    static int numeroDeAlunos = 0;

    public static void adicionarAluno() {
        numeroDeAlunos++;
    }

    public static void quantidadeAlunos() {
        System.out.println("Número de alunos: " + numeroDeAlunos);
    }
}
