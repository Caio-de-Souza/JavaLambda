package com.lima.souza.caio.lambdas;

@FunctionalInterface //Força a interface ter apenas um método abstrato apenas
public interface Calculo {

	double executar(double a, double b);
}
