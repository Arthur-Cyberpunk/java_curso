public class PromocaoAutomatica {
    public static void main(String[] args) {
        byte quantidadeFarinha = 10;
        short quantidadeAcucar = 5;
        char tipoFarinha = 'A';
        int quantidadeOvos = 12;
        long quantidadeLeite = 1000L;
        float precoFarinha = 2.5f;
        double precoAcucar = 1.75;

        // Operações matemáticas com as variáveis
        int somaIngredientes = quantidadeFarinha + quantidadeAcucar + quantidadeOvos; // promoção: total de unidades
        int diferencaFarinhaAcucar = quantidadeFarinha - quantidadeAcucar; // diferença entre quantidades
        double custoFarinha = quantidadeFarinha * precoFarinha; // custo total da farinha
        double custoAcucar = quantidadeAcucar * precoAcucar; // custo total do açúcar
        double custoTotal = custoFarinha + custoAcucar; // custo combinado

        // média de preço entre farinha e açúcar
        double precoMedio = (precoFarinha + precoAcucar) / 2.0;

        // divisão inteira e float — ovos por pacote de farinha
        int ovosPorFarinha = quantidadeOvos / quantidadeFarinha;
        double ovosPorFarinhaPreciso = (double) quantidadeOvos / quantidadeFarinha; // com precisão

        // operação com long e double (exemplo: custo por ml de leite assumindo 0.002 por ml)
        double precoLeitePorMl = 0.002;
        double custoLeite = quantidadeLeite * precoLeitePorMl;
        double custoGeral = custoTotal + custoLeite;

        // mostrar resultados
        System.out.println("Soma de ingredientes: " + somaIngredientes);
        System.out.println("Diferença (farinha - açúcar): " + diferencaFarinhaAcucar);
        System.out.println("Custo farinha: R$ " + custoFarinha);
        System.out.println("Custo açúcar: R$ " + custoAcucar);
        System.out.println("Custo total (farinha + açúcar): R$ " + custoTotal);
        System.out.println("Preço médio (farinha & açúcar): R$ " + precoMedio);
        System.out.println("Ovos por unidade de farinha (inteiro): " + ovosPorFarinha);
        System.out.println("Ovos por unidade de farinha (preciso): " + ovosPorFarinhaPreciso);
        System.out.println("Custo leite: R$ " + custoLeite);
        System.out.println("Custo geral (incluindo leite): R$ " + custoGeral);
        System.out.println("Tipo de farinha: " + tipoFarinha);
    }
}
