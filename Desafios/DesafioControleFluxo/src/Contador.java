import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
            terminal.close();
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("Por favor reinicie o código! O segundo número deve ser maior que o primeiro!");
		}
		
	}

    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
        System.out.println("A diferença entre o segundo número e o primeiro número é de " + contagem);
        for(int i=1; i <= contagem; i++){
            System.out.println("Imprimindo número " + i);
        }
	}
}

