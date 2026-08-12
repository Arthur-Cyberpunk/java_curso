public class Carro {
    public String marcaDoCarro;
    public String modeloDoCarro ;
    public int anoDoCarro;

    public Carro() {
        this.marcaDoCarro = "Desconhecida";
        this.modeloDoCarro = "Desconhecido";
        this.anoDoCarro = 0;
    }

    public Carro(String marcaDoCarro, String modeloDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = 0;
    }

    public Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marcaDoCarro);
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano: " + anoDoCarro);
    }

}
