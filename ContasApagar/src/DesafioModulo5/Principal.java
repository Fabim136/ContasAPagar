package DesafioModulo5;

public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		
		
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		System.out.println(imobiliaria.nome);

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		
		ContasAPagar conta1 = new ContasAPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);
		
		ContasAPagar conta2 = new ContasAPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		
		ContasAPagar conta3 = new ContasAPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
		
		conta1.pagar();
		
		conta2.cancelar();
		conta2.pagar();
		
		
		conta3.pagar();
		conta3.pagar();
		

	}

}
