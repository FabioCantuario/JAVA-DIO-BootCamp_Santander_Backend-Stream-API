package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

	public static void main(String[] args) {
/*
 	// Modelo com Lambda 
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6,7, 8, 9, 10);
  	numeros.forEach(n -> { if (n % 2 == 0) { System.out.println(n); } } );
 */
	// Modelo com Lambda e Predicate
	List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

/*	Consumer<Integer> imprimirNumeroPar = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};
*/
		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}