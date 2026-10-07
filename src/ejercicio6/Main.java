package ejercicio6;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>nombres=new ArrayList<>();
		nombres.add("Irene");
		nombres.add("Rebeca");
		nombres.add("fer");
		nombres.add("Sol");

		Predicate<String> masde4letras=p->p.length()>4; //ver si tiene mas de 4 letras
		Consumer<String>mostrarnombreenmayus = c->System.out.println(c.toUpperCase()); //ponerlo en mayus

		for (int i = 0; i < nombres.size(); i++) {
			if(masde4letras.test(nombres.get(i))) {
				mostrarnombreenmayus.accept(nombres.get(i));
			}
		}
	}

}
