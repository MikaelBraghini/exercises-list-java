package exercicio_16;

public class Processador {
    private String modelo;
    private double frequencia;
    private int nucleos;

    public Processador(String modelo, double frequencia, int nucleos) {
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.nucleos = nucleos;
    }

    public String getDetalhes() {
        return String.format("Modelo: %s, Frequência: %.2f GHz, Núcleos: %d", modelo, frequencia, nucleos);
    }
}
