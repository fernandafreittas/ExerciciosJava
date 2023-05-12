
public class Pessoa {
	
	private int cpf;
	private String nome;
	private String dataNasc;
	
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public Pessoa() {
		
	}
	
	public void cadastro(int cpf, String nome, String dataNasc ) {
		
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.nome = nome;
		
	}
	

}
