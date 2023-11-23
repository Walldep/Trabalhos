package FilaePilha;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjFilaThread> filapilha = new ConcurrentLinkedQueue<ObjFilaThread>();
	public static void add(ObjFilaThread objFilaThread) { filapilha.add(objFilaThread); }
	
	@Override
	public void run() { 
		System.out.println("FILA RODANDO");
			while(true) {
				synchronized (filapilha) {
					Iterator <ObjFilaThread> iteracao = filapilha.iterator();
						while(iteracao.hasNext()) { ObjFilaThread processar = (ObjFilaThread) iteracao.next();
				
						System.out.println("--------------------------");
						System.out.println(processar.getNome());
						System.out.println(processar.getEmail());
					
						iteracao.remove();
			
			try { Thread.sleep(1000); } 
				catch (InterruptedException e) { e.printStackTrace(); } } }
			
			try { Thread.sleep(1000); } 
				catch (InterruptedException e) { e.printStackTrace(); } }
	}
}