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
	
	void pagar() {
		System.out.println("  ");
		System.out.println("Informações do pagamento");
		System.out.println("Descrição" + this.descricao);
		System.out.println("Valor: R$" + this.valor);
		System.out.println("Data de vencimento" + this.dataVencimento);
		System.out.println("Fornecedor" + fornecedor.getNome());
		System.out.println("++++++++++++++++++++++++++++");
		
	}
	
}
