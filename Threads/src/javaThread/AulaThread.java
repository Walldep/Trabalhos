package javaThread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		/*Transformando a thread em objeto + a função runnable*/
		Thread rotina1 = new Thread(thread1);
		rotina1.start(); /* Start, inicia a thread que fica processando paralelamente por trás */
		
		Thread rotina2 = new Thread(thread2);
		rotina2.start();
	
		
		System.out.println("rodando teste de timer");
		JOptionPane.showMessageDialog(null, "Sistema em execução: AGUARDE!");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() { /* Void run: Codigo de rotina que executa o que queremos */
			
			/* Processo PRIMARIO de envio pelo thread */
			
			/* laço for: cria um timer para executar o codigo por demanda de tempo */	
			for (int pos = 0; pos < 5; pos ++) {
				System.out.println("teste de rotina 1");
					try {Thread.sleep(2000); } 
						catch (InterruptedException e) {e.printStackTrace(); } 
		  } /*Final do codigo de teste de rotina do temporizador*/
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			/* Processo SECUNDARIO de envio pelo thread */
			
			for (int pos = 0; pos < 5; pos ++) {
				System.out.println("teste de rotina 2");
					try {Thread.sleep(3000); } 
						catch (InterruptedException e) {e.printStackTrace(); } 
			} 
		}
	};
}
