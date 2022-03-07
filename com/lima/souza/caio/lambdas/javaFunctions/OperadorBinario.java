package com.lima.souza.caio.lambdas.javaFunctions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		BinaryOperator<Double> media = (a, b) -> (a+b)/2;
		BiFunction<Double, Double, String> resultado = 
				(a, b) -> (((a+b)/2) >= 7 ? "Aprovado" : "Reprovado");
	    
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println(media.apply(9.7, 8.7));
		System.out.println(resultado.apply(9.7, 8.7));
		
		System.out.println(conceito.apply(media.apply(9.7, 8.7)));
		System.out.println(media.andThen(conceito).apply(9.7, 8.7));

	}
}
