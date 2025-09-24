package DesafioModulo5;

public class Conta {
	String descricao;
	String dataVencimento;
	double valor;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	
	
	
	public Conta (Fornecedor fornecedor, String descricao,  double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	
	
	public Conta() {
		
	}
	
	void cancelar() {
		
	}

}
