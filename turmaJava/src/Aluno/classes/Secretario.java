package Aluno.classes;

import turma_Interface.permitirAcesso;

/*Classe filho - Secretario*/
public class Secretario extends Pessoa implements permitirAcesso {
	
	private String registro;
	private String nivelCargo;
	private String XP;
	private String login;
	private String senha;
	
	public Secretario(String login, String senha) {this.login = login; this.senha = senha;}
	public Secretario () {}
		
	public String getRegistro() {return registro; }
	public void setRegistro(String registro) {this.registro = registro; }
	public String getNivelCargo() {return nivelCargo; }
	public void setNivelCargo(String nivelCargo) {this.nivelCargo = nivelCargo; }
	public String getXP() {return XP; }
	public void setXP(String xP) {XP = xP; }
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", XP=" + XP + ", nome=" + nome
				+ ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", ID=" + ID + ", NCPF=" + NCPF
				+ ", nomeMae=" + nomeMae + ", nomepai=" + nomepai + "]"; }
	
	@Override
	public double salario() {
		
		return 1750 * 1.15; }
	
	/*Metodo para o secretario logar no sistema através de senha e nick usuario*/
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar(); }
	
	@Override
	public boolean autenticar() {return login.equals("admin") && senha.equals("admin"); }
	
	

}
