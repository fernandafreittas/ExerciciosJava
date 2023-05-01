package Teste;

public class Eleitoral {
	int idade;
	String nome;
	
	public void imprimir() {
		System.out.println("Idade: "+idade);
		System.out.println("Nome: "+nome);
		verificar();
	}

	public void verificar() {
		if (idade<16) {
			System.out.println("Eleitor nao deve votar ");
		}
		else if (idade >= 16 && idade < 65) {
			System.out.println("Eleitor deve votar ");
		}
		else {
			System.out.println("Voto facultativo ");
		}
	}
}
