package desafio4;

public class Estado {
	String nome;
	double faturamento;
	public Estado(String nome, double faturamento) {
		super();
		this.nome = nome;
		this.faturamento = faturamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}
	
}
