package exercicio_18;

import java.util.Arrays;

public class NivelPrioridadeTeste {
    public static void main(String[] args) {
        System.out.println("Detalhes dos Níveis de Prioridade:");

        for (NivelPrioridade prioridade : NivelPrioridade.values()) {
            System.out.println(prioridade.getDetalhes());
        }
    }
}
