package exemplos;

import java.util.Arrays;
import java.util.List;

public class FunctionExample {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).toList();

		numerosDobrados.forEach(System.out::println);
		numerosDobrados.forEach(n -> System.out.println(n));

		/*
		 * Exemplo 1 List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		 * 
		 * Function<Integer, Integer> dobrar = numero -> numero * 2;
		 * 
		 * List<Integer> numerosDobrados = numeros.stream() .map(dobrar)
		 * .collect(Collectors.toList());
		 * 
		 * numerosDobrados.forEach(n -> System.out.println(n));
		 */
	}

}
