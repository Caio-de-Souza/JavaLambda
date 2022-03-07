package com.lima.souza.caio.lambdas.javaFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Televisão", 12500.45, 0.05);
		Produto p3 = new Produto("Fogão", 800.50, 0.1);
		Produto p4 = new Produto("Sofá", 1240.65, 0.25);
		Produto p5 = new Produto("Tapete", 50.0, 0.0);
		Produto p6 = new Produto("Cama", 2543.67, 0.15);


		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		produtos.forEach(imprimir);
		//produtos.forEach(prod -> System.out.println(prod.preco)); //Versão Alternativa
		//produtos.forEach(System.out::println); //Versão Alternativa
	}
}
