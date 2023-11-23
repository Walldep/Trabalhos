package Pacote.excecao;

@SuppressWarnings("serial")
public class excecaoTurmaJava extends Exception {
	
	public excecaoTurmaJava(String erro) {super("Erro no processamento do arquivo ao processar as notas do aluno " + erro); }

}
