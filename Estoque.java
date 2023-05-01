package Teste;

public class Estoque {
	String nomeProduto;
	float valorProduto;
	int quantidade;
	public void imprimir() {
		System.out.println("Nome do produto : "+nomeProduto);
		System.out.println("Valor do produto: "+valorProduto);
		System.out.println("Quantidade em estoque: "+quantidade);
	}
	public int verificarDisponibilidade(int iquantidade) {
		if (iquantidade <= quantidade ) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	public int removerProdutos(int qtdRemover) {
		if (verificarDisponibilidade(quantidade) == 1) {
			quantidade -= qtdRemover;
			return 1;
		}
		else {
			return 0;
		}
	}

}
