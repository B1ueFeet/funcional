package com.funcional;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {

		Function<Integer, Integer> triple = x -> 3 * x;
		Function<Integer, Integer> square = x -> x * x;

		Function<Integer, Integer> fog = Compo.composicion2().apply(triple).apply(square);
		Function<Integer, Integer> gof = Compo.composicion2().apply(square).apply(triple);

		Function<Integer, Integer> fog1 = Compo.composicion3(triple, square);
		Function<Integer, Integer> gof1 = Compo.composicion3(square, triple);
		
		System.out.println("fog " + fog.apply(2));
		System.out.println("gof " + gof.apply(2));
		
		System.out.println("fog " + fog1.apply(2));
		System.out.println("gof " + gof1.apply(2));

		// Hacer un metodo funcional de composicion en una clase y todo como la lista

	}
}
