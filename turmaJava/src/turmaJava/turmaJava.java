package turmaJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Aluno.classes.Aluno;
import Aluno.classes.Diretor;
import Aluno.classes.Disciplina;
import constantes.StatusAluno;
import turmasAuxiliares.AutenticadordeFuncao;

public class turmaJava {
public static void main(String[] args) {
	
		try {	
			
			LerArquivo();
			
		String login = JOptionPane.showInputDialog("login padrão");
		String senha = JOptionPane.showInputDialog("Senha padrão");
						
		/*Validação de acesso por meio de senha e usuario*/
			
				
		if (new AutenticadordeFuncao(new Diretor(login, senha)).AcessoMaster()) {
				
				List<Aluno> alunos = new ArrayList<Aluno>();
		
		/* lista que contem uma chave para identificar uma lista de valores de uma variável */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>(); 
			
		for (int qtd = 1; qtd <=1; qtd++) {

		/* objeto criado para memória */
		String nome = JOptionPane.showInputDialog("qual nome do aluno "+qtd+" ?");
		String idade = JOptionPane.showInputDialog("qual idade do aluno?");
		
		/* outras referencias de mensagens impressas >>
		String mae = JOptionPane.showInputDialog("qual nome da mãe do aluno?");
		String pai = JOptionPane.showInputDialog("qual nome do pai do aluno?");
		String Escola = JOptionPane.showInputDialog("qual nome da escola?");
		String dataNascimento = JOptionPane.showInputDialog("data de nascimento do aluno?");
		String ID = JOptionPane.showInputDialog("qual ID do aluno?");
		String NCPF = JOptionPane.showInputDialog("qual NCPF do aluno?");
		String data_Matricula = JOptionPane.showInputDialog("qual data de matrícula aluno?");
		String serie = JOptionPane.showInputDialog("qual a série do aluno?"); <<*/
			
		Aluno aluno1 = new Aluno(); /*objeto sendo criado, por isso ainda sem função*/
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
		
		/*outras referencias de objetos para o codigo >>
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setID(ID);
		aluno1.setNCPF(NCPF);
		aluno1.setNomeMae(mae);
		aluno1.setNomepai(pai);
		aluno1.setDataMatricula(data_Matricula);
		aluno1.setSerie(serie);
		aluno1.setNomeEscola(Escola); << */
		
		for (int pos = 1; pos <= 1; pos++) {
			String nomeMateria = JOptionPane.showInputDialog("Nome da matéria "+pos+" ?");
			String notaMateria = JOptionPane.showInputDialog("Nota da matéria "+pos+" ?");
			
			Disciplina materia = new Disciplina();
			materia.setMateria(nomeMateria);
			materia.setNota(Double.valueOf(notaMateria));
			
			aluno1.getMaterias().add(materia);} 
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma matéria?");

				/*opção SIM e ZERO*/
		if (escolha == 0) {
			int removeroutrasmaterias = 0;
				int posicao = 1;
					while (removeroutrasmaterias == 0) {
						String materiaRemover = JOptionPane.showInputDialog("remover qual matéria?");
						aluno1.getMaterias().remove(Integer.valueOf(materiaRemover).intValue() - posicao); posicao ++;
						removeroutrasmaterias = JOptionPane.showConfirmDialog(null, "remover outras matérias?"); } }
				alunos.add(aluno1); }
		
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			
		for(Aluno aluno : alunos) {/* separados em listas */	
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){maps.get(StatusAluno.APROVADO).add(aluno);} 
				else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){maps.get(StatusAluno.RECUPERACAO).add(aluno);}
					else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){maps.get(StatusAluno.REPROVADO).add(aluno);} }
		
			System.out.println("__________Lista dos Aprovados___________");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {System.out.println("Aluno: " + aluno.getNome() + "-> " + "Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());}
		
			System.out.println("__________Lista dos Reprovados___________");
		for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {System.out.println("Aluno: " + aluno.getNome() + "-> " + "Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());}
		
			System.out.println("__________Lista dos Recuperação___________");
		for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {System.out.println("Aluno: " + aluno.getNome() + "-> " + "Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());}
		
		 /* outro codigo para imprimir as posições:
		for (int pos = 0; pos < alunos.size(); pos ++) { 
					Aluno aluno = alunos.get(pos);
				
				if (aluno.getNome().equalsIgnoreCase("alex")) {
					Aluno trocar = new Aluno();	
					Disciplina Materias = new Disciplina();
					aluno = alunos.get(pos);
					alunos.set(pos, trocar); 
					
					trocar.setNome("Aluno trocado");
					trocar.getMaterias().add(Materias);
					Materias.setMateria("Português");
					Materias.setNota(95); }
					
		System.out.println("Aluno = " + aluno.getNome());
		System.out.println("Média do aluno = " + aluno.getMediaNota());
		System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				
				for (int posd = 0; posd < aluno.getMaterias().size(); posd ++) {
						Disciplina mate = aluno.getMaterias().get(posd);
		System.out.println("Matéria= " + mate.getMateria() + " Nota= " + mate.getNota());
		System.out.println("________________________________"); } } */

			} else {JOptionPane.showMessageDialog(null, "Acesso não permitido"); }
		} catch (NumberFormatException e) {
				StringBuilder saida = new StringBuilder();
		
				/*<< imprime o erro no console*/
				e.printStackTrace();
							
				/*Mensagem do erro ou causa*/
				System.out.println("Mensagem: " +  e.getMessage());
							
		for (int pos = 0; pos < e.getStackTrace().length; pos++) {
								
					saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
					saida.append("\n Método de erro: " + e.getStackTrace()[pos].getMethodName());
					saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
					saida.append("\n Tipo do erro: " + e.getClass().getName()); }
				JOptionPane.showMessageDialog(null, "Erro da conversão do número" + saida.toString()); }
			
		catch (NullPointerException e) {JOptionPane.showMessageDialog(null, "Erro do Null pointer" + e.getClass());
										e.printStackTrace(); }
		
		/*Captura todas exceções de erros não previstos*/
		catch (FileNotFoundException e) {JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getClass().getName());
										 e.printStackTrace(); }
		
		/*sempre é executado ocorrendo erros ou não*/	
		finally {JOptionPane.showMessageDialog(null, "Obrigado por finalizar essa aula"); }
 	}

/*fazendo o tratamento de erro e enviando pra cima do codigo*/
public static void LerArquivo () throws FileNotFoundException {
		File fil = new File("C://lines.txt");
  		try (Scanner scanner = new Scanner(fil)) {} }
}


