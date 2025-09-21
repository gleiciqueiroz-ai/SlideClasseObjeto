package aluno;

public class ProjetoAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.dados("Gleici", 12345, 8.5, 6.0);

        aluno1.status();
        aluno1.media();
        aluno1.verificacao();
    }
}