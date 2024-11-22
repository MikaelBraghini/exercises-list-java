package exercicio_20;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 3000);
        System.out.println("Salário do Funcionário: R$ " + funcionario.calcularSalario());

        Gerente gerente = new Gerente("Ana", 5000, 1500);
        System.out.println("Salário do Gerente (com bônus): R$ " + gerente.calcularSalario());
    }
}
