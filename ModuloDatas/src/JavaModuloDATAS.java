import java.util.Date;

public class JavaModuloDATAS {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Dia do m�s: " + date.getDate());
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Hora: " + date.getHours());
		System.out.println("Minutos: " + date.getMinutes());
		System.out.println("M�s: " + (date.getMonth() + 1));
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Ano: " + (date.getYear() + 1900));
	}
}
