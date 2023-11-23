package principio.responsabilidade;

public class testeconta {

	public static void main(String[] args) {
	
		ContaBanco banco = new ContaBanco();
	
		banco.setConta("Total da conta");
			System.out.println(banco);
		
		banco.menos100();
			System.out.println(banco);
		
		banco.saque(400);
			System.out.println(banco);
			
		banco.deposito(1000);
			System.out.println(banco);
		
		banco.soma100();
			System.out.println(banco);
	}
}
