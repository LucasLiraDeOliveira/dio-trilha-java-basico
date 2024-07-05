// case 1: Início do processo seletivo onde avaliará a proposta salarial do do possível funcionário e o teto que a empresa está disposta a pagar

public class ProcessoSeletivo {
	public static void main(String[] args) {
		//salario base maior que salario pretendido
		case1(2000.0, 1900.0);
		
		//salario base igual que salario pretendido
		case1(2000.0, 2000.0);
		
		//salario base igual que salario pretendido
		case1(1900.0, 2000.0);
	}
	static void case1(double salarioBase, double salarioPretendido) {
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
