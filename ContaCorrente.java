package Teste;

public class ContaCorrente {
	int conta;
	int agencia;
	float saldo=0;
	String nomeCliente;
	public float Sacar(float saque){
		if (saldo>=saque) {
			saldo = saldo-saque;
			return 1;
		}
		else {
			return 0;
		}
	}
	public void depositar(float deposito) { 
		saldo += deposito;
	}
	public void imprimir() {
		System.out.println("Conta : "+conta);
		System.out.println("Agencia: "+agencia);
		System.out.println("Saldo : "+saldo);
		System.out.println("Nome do cliente : "+nomeCliente);
	}
	
	
}
