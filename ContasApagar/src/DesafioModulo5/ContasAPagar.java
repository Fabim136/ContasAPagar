package DesafioModulo5;

public class ContasAPagar extends Conta {
	//private String descricao;
	//private double valor;
	//private String dataVencimento;
	//protected Fornecedor fornecedor;
	protected SituacaoConta situacaoConta;
	
	
	
	
	//Fornecedor fornecedor = new Fornecedor();
	
	public ContasAPagar() {
		super();
		this.situacaoConta = SituacaoConta.PENDENTE;
		
	}
	//ContasAPagar conta1 = new ContasAPagar();
	
	public ContasAPagar (Fornecedor fornecedor, String descricao,  double valor, String dataVencimento) {
		super(fornecedor, descricao, valor, dataVencimento);
		this.situacaoConta = SituacaoConta.PENDENTE;
		
	}
	


	
	public void pagar() {
		
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
	
	public void cancelar() {
		if (this.situacaoConta == SituacaoConta.PENDENTE) {
			this.situacaoConta = SituacaoConta.CANCELADA;
		} else if (this.situacaoConta == SituacaoConta.CANCELADA){
				System.out.println("Conta foi cancelada. Não é possível pagar.");
			} else if (this.situacaoConta == SituacaoConta.PAGA) {
				System.out.println("Conta paga anteriormente. Não é possível pagar em duplicidade");
			}

		}
	
	}
		
	
	
	
	

