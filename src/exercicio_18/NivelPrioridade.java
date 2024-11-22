package exercicio_18;

public enum NivelPrioridade {
    BAIXO(1),
    MEDIO(2),
    ALTO(3),
    URGENTE(4);

    private final int codigo;

    NivelPrioridade(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDetalhes() {
        return String.format("Nível: %s, Código: %d", this.name(), this.codigo);
    }
}
