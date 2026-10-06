package Ejercicio2;

public class Main {
	public static void main(String[] args) {

		OperacionSuma sumaTres = (a, b, c) -> a + b + c;

		int resultado = sumaTres.calcular(5, 10, 3);

		System.out.println("La suma es: " + resultado);
	}

}

