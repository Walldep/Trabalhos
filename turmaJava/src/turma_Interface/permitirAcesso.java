package turma_Interface;

/*Essa interface vai permitir o acesso via autenticação*/
public interface permitirAcesso {

	/*Declarando metodo*/
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
	
	
}
