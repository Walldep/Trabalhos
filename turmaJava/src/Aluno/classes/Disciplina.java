package Aluno.classes;

import java.util.Arrays;

/*classe Disciplina que será utilizada para todos objetos e instâncias de notas e matérias*/
public class Disciplina {

	/*private double nota;*/
	private double[] nota = new double[4];
	private String materia;
	
	
	/*public double getNota() {return nota;}
	public void setNota(double nota) {this.nota = nota;}*/
	public double[] getNota() {return nota;	}
	public void setNota(Object notas) {this.nota = (double[]) notas;}

	public double getMediaNotas() {double somaTotal = 0;
									for (int pos = 0; pos < nota.length; pos ++) {somaTotal += nota[pos]; }
									return somaTotal; }
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		result = prime * result + Arrays.hashCode(nota);
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
		Disciplina other = (Disciplina) obj;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}
	public String getMateria() {return materia;}
	public void setMateria(String materia) {this.materia = materia;}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Disciplina other = (Disciplina) obj;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}*/
	
	@Override
	public String toString() {return "Disciplina [nota=" + nota + ", materia=" + materia + "]";}

	
}
