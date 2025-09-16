package DesafioModulo5;

public class ContasAPagar {
	private String descricao;
	private int valor;
	private String dataVencimento;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public int getValor() {
		return valor;		
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getDataVencimento () {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) { 
		this.dataVencimento = dataVencimento;
	}
	
	Fornecedor fornecedor = new Fornecedor();
	

	
	

	ContasAPagar (String descricao, Fornecedor fornecedor, double valor, String dataVencimento) {
		this.descricao = "teste";
		//this.fornecedor;
		this.valor = 32;
		this.dataVencimento = "Venceu";
		
		
	}
	
	public void pagar() {
		
	}
	
}
