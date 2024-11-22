package exercicio_15;

public class ContaBancaria {
    private double saldo;
    private String numero;

    public ContaBancaria(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial > 0 ? saldoInicial : 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String depositar(double valor) {
        return valor > 0 ? "Depósito de R$" + (saldo += valor) + " realizado com sucesso." : "O valor para depósito deve ser positivo.";
    }

    public String getNumero() {
        return numero;
    }
}
