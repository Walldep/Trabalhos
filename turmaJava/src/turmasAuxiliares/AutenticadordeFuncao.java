package turmasAuxiliares;

import turma_Interface.permitirAcesso;

/*Uso exclusivo para usuarios legais e de direito pelo acesso ao sistema por meio de senha e usuario*/
public class AutenticadordeFuncao {
	
	private permitirAcesso permitirAcesso;
	
	public boolean AcessoMaster() {return permitirAcesso.autenticar(); }
	
	public AutenticadordeFuncao(permitirAcesso acesso) {this.permitirAcesso = acesso; }
}
