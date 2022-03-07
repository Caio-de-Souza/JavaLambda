package com.lima.souza.caio.lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Beto", "Lia", "Gui", "Tati");
		
		System.out.println("Forma tradicional");
		for(String aprovado : aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("");
		System.out.println("Lambda 01");
		aprovados.forEach(aprovado -> System.out.println(aprovado));
		
		System.out.println("");
		System.out.println("Method Reference 01");
		aprovados.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("Lambda 02");
		aprovados.forEach(aprovado -> meuImprimir(aprovado));
		
		System.out.println("");
		System.out.println("Method Reference 02");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
