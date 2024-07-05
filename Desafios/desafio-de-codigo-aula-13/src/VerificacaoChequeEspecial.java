import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        System.out.println("Qual é o seu saldo atual?");
        double saldo = scanner.nextDouble();
        
        System.out.println("Qual é o valor que deseja sacar?");
        double saque = scanner.nextDouble();

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transação realizada com sucesso.");
        } else if((saldo + limiteChequeEspecial) >= saque) {
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
        }
        else
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}