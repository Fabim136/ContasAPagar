package DesafioModulo5;


public abstract class ContasAReceber extends Conta {
	
	public ContasAReceber() { }
	
	public ContasAReceber (Fornecedor fornecedor, String descricao,  double valor, String dataVencimento) {
		super(fornecedor, descricao, valor, dataVencimento);
		this.situacaoConta = SituacaoConta.PENDENTE;
		
	}
	
	
	
	void receber() {
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
		if (this.valor >= 50000) {
			System.out.println("Valor acima ao permitido");
			
		} else {
			super.cancelar();
			System.out.println("Conta a receber cancelada com sucesso");
		}
		
	}
}
