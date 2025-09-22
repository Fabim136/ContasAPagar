package DesafioModulo5;

public class ContasAPagar {
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	
	
	
	
	//Fornecedor fornecedor = new Fornecedor();
	
	public ContasAPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
		
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
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	

	
	
	void pagar() {
		
		if(this.situacaoConta == SituacaoConta.PENDENTE) {
			System.out.println("Conta pendente. Prosseguindo com os dados para pagamento");
			
			System.out.println("  ");
			System.out.println("Informações do pagamento");
			System.out.println("Descrição" + this.descricao);
			System.out.println("Valor: R$" + this.valor);
			System.out.println("Data de vencimento" + this.dataVencimento);
			System.out.println("Fornecedor" + fornecedor.getNome());
			System.out.println("++++++++++++++++++++++++++++");
			
			this.situacaoConta = SituacaoConta.PAGA;
			
			
		}else if(this.situacaoConta == SituacaoConta.PAGA) {
			System.out.println("Conta já está paga.");
			} else {
				System.out.println("Conta já foi cancelada. Não é necessário realizar o pagamento");
			}
			
		}
	
	void cancelar() {
		if (this.situacaoConta == SituacaoConta.PENDENTE) {
			this.situacaoConta = SituacaoConta.CANCELADA;
		} else if (this.situacaoConta == SituacaoConta.CANCELADA){
				System.out.println("Conta foi cancelada. Não é possível pagar.");
			} else if (this.situacaoConta == SituacaoConta.PAGA) {
				System.out.println("Conta paga anteriormente. Não é possível pagar em duplicidade");
			}
		}
	}
		
	
	
	
	

