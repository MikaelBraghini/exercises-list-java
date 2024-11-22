package exercicio_16;

public class Computador {
    private Processador processador;
    private Memoria memoria;

    public Computador(Processador processador, Memoria memoria) {
        this.processador = processador;
        this.memoria = memoria;
    }

    public void exibirCaracteristicas() {
        System.out.println("Características do Computador:");
        System.out.println("Processador: " + processador.getDetalhes());
        System.out.println("Memória: " + memoria.getDetalhes());
    }
}
