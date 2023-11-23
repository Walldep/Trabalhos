package turmaJava;

import Aluno.classes.Aluno;
import Aluno.classes.Disciplina;

public class ArrayVetor {


	public static void main(String[] args) {
		
		double[] notas = {8.5, 7.5, 6.2, 6.0};
		double[] notaslogica = {7.2, 7.5, 8.2, 5.0};
		
		/*Criando aluno*/
		Aluno aluno = new Aluno();
			aluno.setNome("Jon Kim");
			aluno.setNomeEscola("JDEV treinos");
		
		/*Criando as materias*/
		Disciplina disciplina = new Disciplina();
			disciplina.setMateria("Java Full Stack");
			disciplina.setNota(notas);
			
		Disciplina disciplina2 = new Disciplina();
			disciplina2.setMateria("Java Logica Soft");
			disciplina2.setNota(notaslogica);
		
					
			aluno.getMaterias().add(disciplina);
			aluno.getMaterias().add(disciplina2);
			
		/*Manipulando array de alunos*/
		Aluno[] arrayAlunos = new Aluno[1];
			arrayAlunos[0] = aluno;
			
		for (int pos = 0; pos < arrayAlunos.length; pos ++) {System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
			for(Disciplina disc : arrayAlunos[pos].getMaterias()) {System.out.println("Nome da disciplina: " + disc.getMateria());
				for(int arrayNotas = 0; arrayNotas < disc.getNota().length; arrayNotas ++) {System.out.println("A maior nota: " + arrayNotas + " = " + disc.getNota()[arrayNotas]); }
			}
		}
	} 
}

/* Descobrindo Maior < e menor > nota aluno:
 * System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
			System.out.println("------Disciplina do aluno-------");
		
	for (Disciplina disc : aluno.getMaterias()) {System.out.println("Disciplina: " + disc.getMateria()); 
														System.out.println("Notas das disciplinas: ");
														
	double notaMax = 0.0;
		
	for(int pos = 0; pos < disc.getNota().length; pos ++) {System.out.println("Nota: " + pos + " = " + disc.getNota()[pos]); 
					
	if(pos == 0) {notaMax = disc.getNota()[pos]; } 
	else {if(disc.getNota()[pos] > notaMax) {notaMax = disc.getNota()[pos];}
	}
}
	System.out.println("A maior nota da disciplina= " + disc.getMateria() + " e de valor:  " + notaMax);
} */


/* String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter?");

/*Array pode ser qualquer tipo de dados e objetos, tendo a quantidade de posições definidas:
double[] notas = new double[Integer.parseInt(posicoes)];

for (int pos = 0; pos < notas.length; pos++) {String valor = JOptionPane.showInputDialog("Valor da posição = " + pos); 
											  	notas[pos] = Double.valueOf(valor); }

for (int pos = 0; pos < notas.length; pos++) {System.out.println("nota: " + (pos + 1) + " = " + notas[pos]); } */


/* outra forma de criar as posições do tipo double: 
 * * double[] valores = {9.2, 7.5, 6.5}
 * 
 * passar varios tipos de dados para as posições:
 * * String[] valores = new String[4];
 * * valores[0] = "jon";
 * * valores[1] = "98,5";
 * * valores[2] = "email";
 * * valores[3] = "8778954564";
 * 
 * exemplo de como passar direto:
 * * String[] valores = {"jon","40","email","tel:989745645"}; 
 * 
 * tipos de array:
 * * int[] inteiros = new int[10];
 * * float[] floats = new floats[10]; */