import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class venda {
	
	private long id;
	private String descricaoVenda;
	private String clienteNome;
	private String endereco;
	private BigDecimal valortotal;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	public List<Produto> getListaProdutos() {return listaProdutos;}
	
	@Override
	public String toString() {return "venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", clienteNome=" + clienteNome + ", endereco=" + endereco + ", valortotal=" + valortotal + ", listaProdutos=" + listaProdutos + "]";}
	
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	public String getDescricaoVenda() {return descricaoVenda;}
	public void setDescricaoVenda(String descricaoVenda) {this.descricaoVenda = descricaoVenda;}
	public String getClienteNome() {return clienteNome;}
	public void setClienteNome(String clienteNome) {this.clienteNome = clienteNome;}
	public String getEndereco() {return endereco;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public BigDecimal getValortotal() {this.valortotal = BigDecimal.valueOf(totalvenda()); 
									   return valortotal;}
	public void setValortotal(BigDecimal valortotal) {this.valortotal = valortotal;}

	public void addProduto(Produto produto) {this.listaProdutos.add(produto);}/*Permite fazer validações na lista*/
	
	private double totalvenda() {
		double total = 0.0;
		for(Produto produto : listaProdutos) {total += produto.getValor().doubleValue();}
		return total;
	}
	
}
