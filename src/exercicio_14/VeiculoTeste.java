package exercicio_14;

public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        System.out.println("Comportamento do Carro:");
        carro.mover();

        System.out.println("\nComportamento da Bicicleta:");
        bicicleta.mover();
    }
}
