public class ProjetoLivraria {
public static void main(String[] args) {
    Livro livro1 = new Livro("Capa Média", "Fantasia", "Editora Moderna", "Gleici Santos", 2025);
    Livro livro2 = new Livro("Capa Dura", "Ficção", "Editora Fantasia", "João Silva", 2022);

System.out.println("Livros antes da alteração");
        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        
        livro1.setCapa("Capa dura");
        livro2.setEditora("Editora Nova Era");
        
System.out.println("Livros após a alteração");
        
        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}