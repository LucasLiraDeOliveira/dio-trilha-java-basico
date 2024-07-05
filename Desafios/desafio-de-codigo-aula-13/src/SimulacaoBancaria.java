import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Qual das opcoes abaixo você deseja executar:\nPara Depositar dinheiro - Digite 1\nPara Sacar dinheiro     - Digite 2\nPara Consultar Saldo    - Digite 3\nPara Encerrar           - Digite 0");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Que valor deseja Depositar?");
                    double deposito = scanner.nextDouble();
                    
                    saldo += deposito;
                    System.out.println("O Saldo atual eh de R$" + saldo + "\n");
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Que valor deseja Sacar?");
                    double saque = scanner.nextInt();
                    
                    if(saque > saldo){
                      System.out.println("Valor que deseja sacar é maior do que o valor em conta!\n");
                    }
                    else{
                      saldo -= saque;
                      System.out.println("Valor de R$" + saque + " sacado!\nSaldo atual eh de R$" + saldo + "\n");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("O Saldo atual eh de R$" + saldo + "\n");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

