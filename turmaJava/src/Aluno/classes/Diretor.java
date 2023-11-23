package Aluno.classes;

import turma_Interface.permitirAcesso;

/*Classe filho - Diretor*/
public class Diretor extends Pessoa implements permitirAcesso {
	
	private String registroEducacional;
	private String tempoDirecao;
	private String titulacao;
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha; }
	
	public Diretor() {}
		
	public String getRegistroEducacional() {return registroEducacional;}
	public void setRegistroEducacional(String registroEducacional) {this.registroEducacional = registroEducacional;}
	public String getTempoDirecao() {return tempoDirecao;}
	public void setTempoDirecao(String tempoDirecao) {this.tempoDirecao = tempoDirecao;}
	public String getTitulacao() {return titulacao;}
	public void setTitulacao(String titulacao) {this.titulacao = titulacao;}
	
	@Override
	public String toString() {
		return "Diretor [registroEducacional=" + registroEducacional + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", ID="
				+ ID + ", NCPF=" + NCPF + ", nomeMae=" + nomeMae + ", nomepai=" + nomepai + "]";
	}
	@Override
	public double salario() {
		
		return 2542;
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar(); }
	
	@Override
	public boolean autenticar() {return login.equals("admin") && senha.equals("admin"); }
	
	

}
