package exemplos;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {

	public static void main(String[] args) {

		List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!").limit(5).toList();

		listaSaudacoes.forEach(s -> System.out.println(s));
		// listaSaudacoes.forEach(System.out::println);

		/*
		 * Exemplo 1 List<String> listaSaudacoes = Stream.generate(saudacao) .limit(5)
		 * .toList();
		 * 
		 * //listaSaudacoes.forEach(s -> System.out.println(s));
		 * listaSaudacoes.forEach(System.out::println);
		 */
	}

}
