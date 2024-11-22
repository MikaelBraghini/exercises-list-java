package exercicio_19;

public class LojaTeste {
    public static void main(String[] args) {
        Loja loja = new Loja();

        double precoUnitario = 50.0;
        int quantidade = 3;
        double precoSemDesconto = loja.calcularPreco(precoUnitario, quantidade);
        System.out.println("Preço sem desconto: R$ " + precoSemDesconto);

        double descontoPercentual = 10.0;
        double precoComDesconto = loja.calcularPreco(precoUnitario, quantidade, descontoPercentual);
        System.out.println("Preço com desconto de 10%: R$ " + precoComDesconto);
    }
}
