import java.util.Scanner;

public class PrincipalPessoa {
	
	Scanner ler = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		int op = 0;
		Scanner ler = new Scanner (System.in);
			
		while(op != 3) {
		System.out.println("*****ESCOLHA UMA OPÇÃO*****");
		System.out.println("1- CADASTRAR");
		System.out.println("2-IMPRIMIR");
		System.out.println("3-SAIR");
		op = ler.nextInt();
		
		
		switch(op) {
		
		case 1: 
			cadastrar();
				break;
			
		case 2:
			imprimir();
			break;
			
		case 3:
			System.out.println("Você saiu!!");
			System.exit(0);
			break;
			
		}
		
		}
	}
	
	static Pessoa obj = new Pessoa();
	public static void cadastrar() {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe seu nome: ");
		String nome = ler.next();
		obj.setNome(nome);
		System.out.println("Informe seu cpf: ");
		int cpf = ler.nextInt();
		obj.setCpf(cpf);
		for (;;) {
		
			System.out.println("Informe sua data de nascimento: ");
			String dataNasc = ler.next();
			if (dataNasc.length() == 10) {
				
				char aux = dataNasc.charAt(4);
				char aux1 = dataNasc.charAt(7);
				if (aux == '/' && aux1 == '/') {
					obj.setDataNasc(dataNasc);
					break;
				}
				
			}
		
		}
		
	}
	public static void imprimir() {
		
		System.out.println("Nome: "+obj.getNome());
		System.out.println("Cpf: "+obj.getCpf());
		System.out.println("Data de Nascimento: "+obj.getDataNasc());
		
	}

}
