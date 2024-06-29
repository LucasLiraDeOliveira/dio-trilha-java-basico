// Exemplo para ver bem sobre a ferramenta de debugging e como utilizá-la

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble(); // o erro se dava pois tanto
            // o método quanto o scanner estava recebendo o valor
            // em int, logo as casas decimais não apareciam
            soma += nota;
        }

        return soma / alunos.length;
    }

}


