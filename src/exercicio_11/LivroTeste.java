package exercicio_11;

public class LivroTeste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 256);

        System.out.println("Detalhes do Livro 1:");
        livro1.exibirDetalhes();

        System.out.println("\nDetalhes do Livro 2:");
        livro2.exibirDetalhes();
    }
}
