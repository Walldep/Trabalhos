package Aluno.classes;

/*"PESSOA" classe master, superclasse, classe pai de todos objetos filhos*/
/*"Abstract" bloqueia a classe pessoa para impedir a instancia direta em outras classes*/
public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String ID;
	protected String NCPF;
	protected String nomeMae;
	protected String nomepai;
	
	/*método "salario" obrigatorio para ser utilizado nas classes filhos*/
	public abstract double salario();
	
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public int getIdade() {return idade;}
	public void setIdade(int idade) {this.idade = idade;}
	public String getDataNascimento() {return dataNascimento;}
	public void setDataNascimento(String dataNascimento) {this.dataNascimento = dataNascimento;}
	public String getID() {return ID;}
	public void setID(String iD) {ID = iD;}
	public String getNCPF() {return NCPF;}
	public void setNCPF(String nCPF) {NCPF = nCPF;}
	public String getNomeMae() {return nomeMae;}
	public void setNomeMae(String nomeMae) {this.nomeMae = nomeMae;}
	public String getNomepai() {return nomepai;}
	public void setNomepai(String nomepai) {this.nomepai = nomepai;}
	
	/*Retorna true or false para idade maior 18*/
	public boolean maiorIdade() {return idade >= 18; }
	public boolean autenticar() {return false;	}
	
}
