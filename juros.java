import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento (%): ");
        double percentual = scanner.nextDouble();

        // Cálculo do aumento
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;

        // Saída
        System.out.println("Aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        scanner.close();
    }
}