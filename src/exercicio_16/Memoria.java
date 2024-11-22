package exercicio_16;

public class Memoria {

    private String tipo;
    private int capacidade;

    public Memoria(String tipo, int capacidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getDetalhes() {
        return String.format("Tipo: %s, Capacidade: %d GB", tipo, capacidade);
    }

}
