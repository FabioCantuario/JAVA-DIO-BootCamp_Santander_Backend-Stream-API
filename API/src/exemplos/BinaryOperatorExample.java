package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

// Sem Lambda e com Classe Anônima /////////////////////////////////////
/*
		BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer num1, Integer num2) {
				return num1 + num2;
			}
		};
		int resultado = numeros.stream()
				.reduce(0,somar);
		System.out.println("A soma dos números é: " + resultado);
*/			
// Com Lambda para Somar /////////////////////////////////////////////
 	  
 	 //Exemplo 1
		//BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;
	 //Exemplo 2
 	    BinaryOperator<Integer> somar = Integer::sum;
		
		int resultado = numeros.stream()
				.reduce(0,somar);
		
		System.out.println("A soma dos números é: " + resultado);

// Com Lambda /////////////////////////////////////
/*
	 //Exemplo 1
		//int resultado = numeros.stream().reduce(0, (n1,n2) -> n1 + n2);
	 //Exemplo 2
		int resultado = numeros.stream().reduce(0, Integer::sum);
		
		System.out.println("A soma dos números é: " + resultado);
*/
	}

}