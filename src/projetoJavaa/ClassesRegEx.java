package projetoJavaa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassesRegEx {

	public static void main(String[] args) {
	String texto = "@gmail.com";
		
		Pattern subtextoPadrao = Pattern.compile("[a-zA-Z0-9]@gmail.com");
		
		Matcher combina = subtextoPadrao.matcher(texto);
		
		if(combina.matches()) {
			System.out.println("validado!");
			
		}else{
			
			System.out.println("Não Validado!");
		}

	}

}
