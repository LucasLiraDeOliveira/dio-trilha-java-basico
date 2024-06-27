// Exemplo para explicar o BREAK e o CONTINUE em Estruturas de Repetição
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break; // Se ao invés do BREAK fosse CONTINUE, em vez de sair do laço, ele apenas pularia a iteração atual do laço
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ?

    }
}
