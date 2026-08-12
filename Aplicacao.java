public class Aplicacao {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Toyota", "Corolla");
        Carro carro3 = new Carro("Honda", "Civic", 2020);

        System.out.println("Detalhes do Carro 1:");
        carro1.exibirDetalhes();

        System.out.println("\nDetalhes do Carro 2:");
        carro2.exibirDetalhes();

        System.out.println("\nDetalhes do Carro 3:");
        carro3.exibirDetalhes();
    }
}
