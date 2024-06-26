// Exemplo da Estruturas de Repetição FOR EACH em Array
public class ExemploForEachArray {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
        for(String aluno : alunos) { // A cada iteração de alunos o elemento aluno receberá o alunos do índice atual
          System.out.println("Nome do aluno é: " + aluno);
        }
    
    }
}

