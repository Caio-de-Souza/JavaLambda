package com.lima.souza.caio.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTesteLambda2 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (a, b) -> {
			return a + +b;
		};
		System.out.println(calc.apply(1.0, 2.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 5.0));
	}
}
