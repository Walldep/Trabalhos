package operações_log.Aninhadas;

public class operações_aninhadas {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* operações de logicas aninhadas */

		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("aluno aprovado com honras " + media);
				} else {
					System.out.println("aluno aprovado direto " + media);
				}
			} else {
				System.out.println("aluno esta de recuperacao " + media);
			}
		} else {
			System.out.println("reprovado direto " + media);
		}
	}
}
