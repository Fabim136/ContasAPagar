package DesafioModulo5;

public class ContasAPagar {
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	
	
	//Fornecedor fornecedor = new Fornecedor();
	
	public ContasAPagar() {
		
	}
	//ContasAPagar conta1 = new ContasAPagar();
	public ContasAPagar (Fornecedor fornecedor, String descricao,  double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	

	
	public void pagar() {
		
	}
	
	//Métodos get e set
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public double getValor() {
		return valor;		
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDataVencimento () {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) { 
		this.dataVencimento = dataVencimento;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
