package Teste;
import java.util.Scanner;
public class PrincipalContaCorrente {
	ContaCorrente con = new ContaCorrente();
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		PrincipalContaCorrente obj = new PrincipalContaCorrente();
		int op=0;
		while (op != 5) {
			System.out.println();
			System.out.println("*****ESCOLHA UMA DAS OPÇÕES ABAIXO*****");
			System.out.println();
			System.out.println("OPCÇÃO 1 = CADASTRAR");
			System.out.println();
			System.out.println("OPCÇÃO 2 = SACAR");
			System.out.println();
			System.out.println("OPCÇÃO 3 = DEPOSITAR");
			System.out.println();
			System.out.println("OPCÇÃO 4 = CONSULTAR");
			System.out.println();
			System.out.println("OPCÇÃO 5 = SAIR");
			System.out.println();
			System.out.print("Opção escolhida: ");
			op = ler.nextInt();
			switch (op) {
			case 1:
				System.out.println("***Cadastro de conta***");
				System.out.println();
				obj.execCadastro();
				break;
				
			case 2:
				System.out.println("***Saque***");
				System.out.println();
				obj.execSaque();
				break;
				
			case 3:
				System.out.println("***Deposito***");
				System.out.println();
				obj.execDeposito();
				break;
				
			case 4:
				System.out.println("***Consulta***");
				System.out.println();
				obj.execConsulta();
				break;	
				
			case 5:
				System.out.println("***Sair***");
				System.out.println();
				break;
			
			}
		}
		

	}
	Scanner ler2 = new Scanner (System.in);
	public void execCadastro() {
		System.out.println("Informe o numero da sua conta: ");
		con.conta = ler2.nextInt();
		System.out.println("Informe o numero da sua agencia: ");
		con.agencia = ler2.nextInt();
		System.out.println("Informe seu nome: ");
		con.nomeCliente = ler2.next();
		
		
	}
	public void execSaque() {
		float saque=0;
		System.out.println("Informe o valor que voce deseja sacar: ");
		saque = ler2.nextFloat();
		con.Sacar(saque);
		if (con.Sacar(saque)==1) {
			System.out.println("Saque realizado com sucesso!!");
		}
		else {
			System.out.println("Saque não realizado, saldo insuficiente");
		}
		
	}
	public void execDeposito() {
		float deposito;
		System.out.println("Informe o valor que voce deseja depositar: ");
		deposito = ler2.nextFloat();
		con.depositar(deposito);
	}
	public void execConsulta() {
		con.imprimir();
	}

}
