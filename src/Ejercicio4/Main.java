package Ejercicio4;

public class Main {
	public static void main(String[] args) {
		Operacion suma = (x, y) -> x + y; // creo una lambda que implementa Operacion y devuelve "x+y" 

        Operacion multiplicacion = (x, y) -> x * y;

        int resultadoSuma = operar(20, 5, suma);
        int resultadoMultiplicacion = operar(2, 5, multiplicacion);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
	}
}
