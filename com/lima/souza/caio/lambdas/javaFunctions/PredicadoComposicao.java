package com.lima.souza.caio.lambdas.javaFunctions;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		System.out.println(isPar.and(isTresDigitos).test(222));
		System.out.println(isPar.and(isTresDigitos).test(12));
		System.out.println(isPar.or(isTresDigitos).test(123));
		System.out.println(isPar.or(isTresDigitos).test(10));
	}
}
