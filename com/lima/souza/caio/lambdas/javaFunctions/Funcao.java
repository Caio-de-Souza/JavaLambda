package com.lima.souza.caio.lambdas.javaFunctions;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		Function<String, String> resultIs = valor -> "O resultado é " + valor;		
		Function<String, String> finalFrase = frase -> frase+"!!!!!";

		System.out.println(parOuImpar.apply(2));
		System.out.println(parOuImpar.apply(3));	
		
		String resultFinal = parOuImpar.andThen(resultIs).apply(2);
		System.out.println(resultFinal);
		
		resultFinal = parOuImpar.andThen(resultIs).apply(25);
		System.out.println(resultFinal);
		
		resultFinal= parOuImpar
				.andThen(resultIs)
				.andThen(finalFrase)
				.apply(25);
		System.out.println(resultFinal);
		
		resultFinal= parOuImpar
				.andThen(resultIs)
				.andThen(finalFrase)
				.apply(30);
		System.out.println(resultFinal);
	}
}
