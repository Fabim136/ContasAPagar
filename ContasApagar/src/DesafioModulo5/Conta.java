package DesafioModulo5;

public abstract class Conta {
	String descricao;
	String dataVencimento;
	double valor;
	protected Fornecedor fornecedor;
	protected SituacaoConta situacaoConta;
	
	
	
	public Conta (Fornecedor fornecedor, String descricao,  double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.situacaoConta = SituacaoConta.PENDENTE;
		
	}
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
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
	
	
	public Conta() {
		
	}
	
	public abstract void pagar();
	
	public void cancelar() {
		this.situacaoConta = SituacaoConta.CANCELADA;
		System.out.println("Conta cancelada");
	};
	

}
