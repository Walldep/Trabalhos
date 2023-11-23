package turmaJava;

import Aluno.classes.Aluno;
import Aluno.classes.Diretor;
import Aluno.classes.Pessoa;
import Aluno.classes.Secretario;

public class TesteClasseFilhos {

	public static void main(String[] args) {
	
		Aluno aluno = new Aluno();
			aluno.setNome("Prism - Aluno");
			aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
			diretor.setNome("Dub - diretor");
			diretor.setIdade(50);
			
		Secretario secretario = new Secretario();
			secretario.setNome("Kim - secretario");
			secretario.setIdade(23);
			
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.maiorIdade() + " - " + aluno.msgmaiorIdade());
		System.out.println(diretor.maiorIdade());
		System.out.println(secretario.maiorIdade());
	
		System.out.println(" Salário Aluno: " + aluno.salario());
		System.out.println(" Salário Diretor: " + diretor.salario());
		System.out.println(" Salário Secretario: " + secretario.salario());
		
/*TESTE de impressão do polimorfismo*/
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}

	public static void teste(Pessoa pessoa) {System.out.println("Teste pessoa? " + pessoa.getNome() + " Possui salário de: " + pessoa.salario()); }
	
}
