package com.correccion;

import java.util.Objects;
import java.util.function.Function;

import com.funcional.Compo;
import com.funcional.lista.Lista;

public class MainDeber {

	public static void main(String[] args) {

		/*
		 * de string con palabras repetidas
		 * 
		 */

		String txt = "hola mundo hola hola texto en java mundo";
		Function<String, String[]> fn1 = str -> str.split(" ");

		Function<String[], Lista<PairDeber>> fn2 = vstr -> contar(vstr);

		Function<String, Lista<PairDeber>> fog = Compo.<String, String[], Lista<PairDeber>>composicion2().apply(fn1).apply(fn2);

		Lista<PairDeber> tmp = fog.apply(txt);
		tmp.forEach(s -> {
			System.out.printf("%-10s: %d\n", s.palabra, s.Contador);
		});
	}

	public static Lista<PairDeber> contar(String[] vstr) {
		Lista<PairDeber> ret = Lista.NIL;

		for (String s : vstr) {
			PairDeber p = new PairDeber(s, 1);

			var tmp = ret.contains(p);

			if (tmp.isEmpty()) {
				ret = ret.prepend(p);
			} else {
				var item = tmp.get();
				ret.remplace(item, new PairDeber(s, item.Contador + 1));
			}
		}
		return ret;
	}

	record PairDeber(String palabra, Integer Contador) {
		@Override

		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PairDeber other = (PairDeber) obj;
			return Objects.equals(Contador, other.Contador) && Objects.equals(palabra, other.palabra);

		}

	}

}
