package Ejercicio3;

import Ejercicio3.Operacion;

public class Main {
	public static void main(String[] args) {

	Operacion suma = (a, b) -> a + b;
	int resultado = suma.calcular(10,4);
	System.out.println("La suma es: " + resultado);
	
	Operacion resta = (a, b) -> a - b;
	int resultado2 = resta.calcular(10,4);
	System.out.println("La suma es: " + resultado2);
	
	Operacion multiplicacion = (a, b) -> a * b;
	int resultado3 = multiplicacion.calcular(10,4);
	System.out.println("La suma es: " + resultado3);
	
	}
}
