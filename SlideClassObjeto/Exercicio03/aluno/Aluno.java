package aluno;

public class Aluno {
String nome;
int matricula;
double notaAv1;
double notaAv2;

void status(){
        System.out.println("Nome Aluno " + this.nome);
        System.out.println("Qual sua Matricula " + this.matricula);
        System.out.println("Nota av1 " + this.notaAv1);
        System.out.println("Nota da Av2 " + this.notaAv2);
}
void dados(String nome, int matricula, double av1, double av2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = av1;
        this.notaAv2 = av2;
}
void media(){
        double media = (this.notaAv1 + this.notaAv2) / 2;
        System.out.println("Média: " + media);
}
void verificacao(){
        double media = (this.notaAv1 + this.notaAv2) / 2;
        if (media >= 7.0) {
        System.out.println("Status: APROVADO");
        } else {
        System.out.println("Status: REPROVADO");
        }
}
}