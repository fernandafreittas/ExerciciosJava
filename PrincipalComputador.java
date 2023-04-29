package Teste;

public class PrincipalComputador {
	public static void main (String[] args) {
		Computador obj = new Computador();
		obj.cor = "Azul";
		obj.marca = "HP";
		obj.modelo = "Loira";
		obj.numeroSerie = 1234;
		obj.preco = 1000;
		System.out.println();
		obj.imprimir();
		obj.calcularValor();
		obj.imprimir();
		System.out.println();
		Computador loira = new Computador();
		loira.cor = "Vermelho";
		loira.marca = "IBM";
		loira.modelo = "Loira";
		loira.numeroSerie = 12345;
		loira.preco = 100;
		loira.calcularValor();
		loira.imprimir();
		loira.alterarValor(100);
		if (loira.alterarValor(100)==1) {
			System.out.println("Valor alterado com sucesso!!");
			
		}
		else if (loira.alterarValor(100)==0) {
			System.out.println("Valor NAO alterado!!");
		}
		loira.imprimir();
		System.out.println();
		loira.alterarValor(-1);
		if (loira.alterarValor(-1)==1) {
			System.out.println("Valor alterado com sucesso!!");
			
		}
		else if (loira.alterarValor(-1)==0) {
			System.out.println("Valor NAO alterado!!");
		}
		loira.imprimir();
		
	}

}
