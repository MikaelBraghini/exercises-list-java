package exercicio_19;

public class Loja {

    public double calcularPreco(double precoUnitario, int quantidade) {
        return precoUnitario * quantidade;
    }

    public double calcularPreco(double precoUnitario, int quantidade, double descontoPercentual) {
        double precoTotal = precoUnitario * quantidade;
        double desconto = precoTotal * (descontoPercentual / 100);
        return precoTotal - desconto;
    }
}
