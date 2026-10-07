package ejercicio5;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Predicate<Integer> mayorque100=p->p>100;
		System.out.println(mayorque100.test(200));
		System.out.println(mayorque100.test(50));
	}

}
