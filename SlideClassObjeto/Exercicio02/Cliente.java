public class Cliente {
    String nome;
    int idade;
    String email;
    String contato;

    public Cliente(String nome, int idade, String email, String contato) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.contato = contato;
    }
    public void fazerCadastro() {
        System.out.println("O cliente " + this.nome + " está realizando seu cadastro.");
    }

    public void comprarLivro() {
        System.out.println("O cliente " + this.nome + " efetuando a compra do livro.");
    }
}