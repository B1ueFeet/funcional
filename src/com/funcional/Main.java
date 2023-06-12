package com.funcional;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {

		Function<Integer, Integer> triple = x -> 3 * x;

		Function<Integer, Integer> square = x -> x * x;

		Function<Function<Integer, Integer>, Function<Function<Integer, Integer>, Function<Integer, Integer>>> comp = f -> g -> x -> f
				.apply(g.apply(x));

		Function<Integer, Integer> fog = comp.apply(square).apply(triple);
		Function<Integer, Integer> gof = comp.apply(triple).apply(square);

		System.out.println("fog " + fog.apply(2));
		System.out.println("gof " + gof.apply(2));

		// Hacer un metodo funcional de composicion en una clase y todo como la lista

	}
}
