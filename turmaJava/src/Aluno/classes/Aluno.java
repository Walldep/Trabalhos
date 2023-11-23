package Aluno.classes;

import java.util.ArrayList;
import java.util.List;

import constantes.StatusAluno;

/*Classe filho - Aluno*/
public class Aluno extends Pessoa {

	private String dataMatricula;
	private String serie;
	private String nomeEscola;
	
	private List<Disciplina> materias = new ArrayList<Disciplina>();
	
	public void setMaterias(List<Disciplina> materias) {this.materias = materias;}
	
	public List<Disciplina> getMaterias() {return materias;}

	/* Cria os dados na memória de modo padrão do java */
	public Aluno() {}

	public Aluno(String nomePadrao) {nome = nomePadrao;}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	/* metodos SETTERS e GETTERS *//* SET = adicionar ou receber os dados de atributos */
	/* GET = resgatar ou obter o valor dos atributos */
	/* função SET e GET */
	public void setNome(String nome) {this.nome = nome;}
	public String getNome() {return nome;}
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
	public String getDataMatricula() {return dataMatricula;}
	public void setDataMatricula(String dataMatricula) {this.dataMatricula = dataMatricula;}
	public String getSerie() {return serie;}
	public void setSerie(String serie) {this.serie = serie;}
	public String getNomeEscola() {return nomeEscola;}
	public void setNomeEscola(String nomeEscola) {this.nomeEscola = nomeEscola;}

	/* Método que retorna a media */
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : materias) {somaNotas += disciplina.getMediaNotas();}
			return somaNotas / materias.size();}

	/* metodo que retorna true para aprovado e false para reprovado */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false; } 
	}

	/* metodo que retorna a string "aluno aprovado ou não" */
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {return StatusAluno.APROVADO;} 
					else {return StatusAluno.RECUPERACAO;}
		} else {return StatusAluno.REPROVADO;}
	}

	@Override
	public String toString() {return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", ID=" + ID
									 + ", NCPF=" + NCPF + ", nomeMae=" + nomeMae + ", nomepai=" + nomepai + ", dataMatricula="
									 + dataMatricula + ", serie=" + serie + ", nomeEscola=" + nomeEscola + "]";}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NCPF == null) ? 0 : NCPF.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (NCPF == null) {
			if (other.NCPF != null)
				return false;
		} else if (!NCPF.equals(other.NCPF))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	/*Identifica método utilizado em outra classe "da superclasse"*/
	@Override
	public boolean maiorIdade() {
		
		return idade >= 20;
	}
	
	public String msgmaiorIdade() {return this.maiorIdade() ? "Aluno maior de idade! " : "aluno menor de idade! "; }

	@Override
	public double salario() {return 1562; }

}
