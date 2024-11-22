package exercicio_12;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 25);
        Pessoa pessoa2 = new Pessoa("Carlos", 30);

        System.out.println("Informações da Pessoa 1:");
        pessoa1.exibirInformacoes();

        System.out.println("\nInformações da Pessoa 2:");
        pessoa2.exibirInformacoes();
    }
}
