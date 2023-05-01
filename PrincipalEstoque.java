package Teste;

public class PrincipalEstoque {

	public static void main(String[] args) {
		Estoque est = new Estoque();
		est.nomeProduto = "Banana";
		est.valorProduto = 10;
		est.quantidade = 10;
		est.imprimir();
		if(est.verificarDisponibilidade(10) == 1) {
			System.out.println("Quantidade em estoque disponível: "+est.quantidade);
		}
		else {
			System.out.println("Não há quantidade em estoque");
		}
		
		est.removerProdutos(1);
		est.imprimir();
	}

}
