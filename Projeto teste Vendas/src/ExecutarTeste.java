import java.math.BigDecimal;

public class ExecutarTeste {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
			produto1.setId(10L);
			produto1.setNome("MOOV");
			produto1.setValor(BigDecimal.valueOf(100));
			
		Produto produto2 = new Produto();
			produto2.setId(20L);
			produto2.setNome("KOOV");
			produto2.setValor(BigDecimal.valueOf(300));
			
		Produto produto3 = new Produto();
			produto3.setId(30L);
			produto3.setNome("TKOOV");
			produto3.setValor(BigDecimal.valueOf(250));
			
		Produto produto4 = new Produto();
			produto4.setId(30L);
			produto4.setNome("TKOOV");
			produto4.setValor(BigDecimal.valueOf(200));
		
		venda venda = new venda();
			venda.setDescricaoVenda("Venda curso JAVA");
			venda.setEndereco("Entrega por email");
			venda.setId(10L);
			venda.setClienteNome("Fernando");
			
				
			venda.getListaProdutos().add(produto1);
			venda.getListaProdutos().add(produto2);/*Não permite fazer validações*/
			venda.addProduto(produto3);/*Permite fazer validações antes de adicionar na lista*/
			venda.addProduto(produto4);
			

			System.out.println("Valor da variável total venda: " + venda.getValortotal());
		
	}
}
