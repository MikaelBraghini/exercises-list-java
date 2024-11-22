package exercicio_16;

public class ComputadorTeste {
    public static void main(String[] args) {
        Processador processador = new Processador("Ryzen 5700X", 4.6, 8);
        Memoria memoria = new Memoria("DDR4", 16);

        Computador computador = new Computador(processador, memoria);

        computador.exibirCaracteristicas();
    }
}
