package com.lima.souza.caio.lambdas;

public class CalculoTesteLambda {

	public static void main(String[] args) {
		//Funcão anonima
		Calculo calc = (a, b) -> {
			return a + +b;
		};
		System.out.println(calc.executar(1, 2));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 5));
	}
}
