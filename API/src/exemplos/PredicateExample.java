package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
	// Modelo com Lambda	
		List<String> palavras = Arrays.asList("Java","Kotlin","Python","JavaScript","C","Go","Ruby");		
		palavras.stream()
			.filter(p -> p.length() > 5)
			.forEach(System.out::println);
		
/*	// Modelo modificado entre sem e com Lambda
	List<String> palavras = Arrays.asList("Java","Kotlin","Python","JavaScript","C","Go","Ruby");
		
	//Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
	palavras.stream()
		.filter(new Predicate<String>() {
			@Override
			public boolean test(String p) {
				return p.length() > 5;
				}
			}
		)
		.forEach(System.out::println);
*/
		
/*	 Modelo sem Lambda
		List<String> palavras = Arrays.asList("Java","Kotlin","Python","JavaScript","C","Go","Ruby");
		
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
			
		palavras.stream()
			.filter(maisDeCincoCaracteres)
			.forEach(System.out::println);
*/
	}

}
