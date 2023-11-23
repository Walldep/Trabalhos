package turmaJava;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Kongli, full stack java, 90, 80, 70, 60";
		
			String[] valoresArray = texto.split(",");
			
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4: " + valoresArray[5]);

		//Convertendo array em lista
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {System.out.println(valorString);}
		
		//converter lista em array
		String[] converterArray = list.toArray(new String[6]);
			System.out.println(converterArray);
		/* for (int pos = 0; pos < converterArray.length; pos ++) {System.out.println(converterArray[pos]);} */
		
	}
}

