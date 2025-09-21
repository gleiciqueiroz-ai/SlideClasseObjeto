
public class Livro {

    String capa;
    String genero;
    String editora;
    String autor;
    int anoPublicacao;

    public Livro(String capa, String genero, String editora, String autor, int anoPublicacao) {
        this.capa = capa;
        this.genero = genero;
        this.editora = editora;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void setCapa(String novaCapa) {
        this.capa = novaCapa;
    }

    public void setEditora(String novaEditora) {
        this.editora = novaEditora;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Livro");
        System.out.println("Capa: " + this.capa);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Editora: " + this.editora);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
    }
}
