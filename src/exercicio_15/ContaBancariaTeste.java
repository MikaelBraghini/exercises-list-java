package exercicio_15;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", 500.0);

        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Saldo Inicial: R$" + conta.getSaldo());

        System.out.println(conta.depositar(150.0));
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        System.out.println(conta.depositar(-50.0));
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
