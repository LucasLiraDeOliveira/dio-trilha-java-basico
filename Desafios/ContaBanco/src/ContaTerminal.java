import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o Nome do cliente !");
            String nome = scanner.next();

            System.out.println("Por favor, digite o ultimo Sobrenome do cliente !");
            String sobrenome = scanner.next();

            System.out.println("Por favor, digite o número da Conta !");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência !");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o Saldo atual !");
            double saldo = scanner.nextDouble();

            System.out.println("\nOlá " + nome + " " + sobrenome + "! Obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque!\n");
        }
    }
}
