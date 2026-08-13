public class Aplication2 {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Java Programming", "John Doe");
        Livro livro3 = new Livro("Python Guide", "Jane Smith", 2020, 29.99);

        System.out.println("Detalhes do Livro 1:");
        livro1.exibirDetalhes();

        System.out.println("\nDetalhes do Livro 2:");
        livro2.exibirDetalhes();

        System.out.println("\nDetalhes do Livro 3:");
        livro3.exibirDetalhes();
    }
}
