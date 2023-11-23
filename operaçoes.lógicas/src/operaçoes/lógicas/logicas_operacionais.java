package operaçoes.lógicas;

public class logicas_operacionais {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* condições logicas IF e ELSE */

		if (media >= 70) {
			System.out.println("aluno aprovado " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("aluno em recuperacao " + media);
		} else {
			System.out.println("aluno reprovado " + media);
		}

		
		/* operadores ternarios para micro validação */

		String resultado;

		resultado = media >= 70 ? "aluno aprovado" : (media >= 45 && media <= 69) ? "aluno em recuperacao" : "aluno reprovado";

		System.out.println(resultado);

	}
}
