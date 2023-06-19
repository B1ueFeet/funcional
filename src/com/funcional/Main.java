package com.funcional;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {

		Function<Integer, Integer> triple = x -> 3 * x;
		Function<Integer, Integer> square = x -> x * x;

		Function<Integer, Integer> comp1 = Compo.<Integer>composicion1().apply(square).apply(triple);
		System.out.println(comp1.apply(2));
		
		Function<Integer, Integer> comp2 = Compo.<Integer,Integer, Integer>composicion2().apply(triple).apply(square);
		System.out.println(comp2.apply(2));
		
		// dado un nString contar el numero de repeticiones de cada palabra 
		
		Function<String, String[]> f = a -> a.split(" ");
		
		f.apply("hola mundo en java hola hola");


	}
}
