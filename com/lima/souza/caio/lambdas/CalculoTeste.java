package com.lima.souza.caio.lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo calc = new Soma();
		System.out.println(calc.executar(1, 3));

		calc = new Multiplicacao();
		System.out.println(calc.executar(2, 5));
	}
}
