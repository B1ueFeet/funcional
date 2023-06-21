package com.funcional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// dado un nString contar el numero de repeticiones de cada palabra 
		
		Function<String, String[]> f = a -> a.split(" ");
		
		Function<String[], List<Tupla<String, Integer>>> g = b ->{
			Set<String> set = new HashSet<>(Arrays.asList(b));
			List<Tupla<String, Integer>> lista = set.stream().map(c -> Tupla.<String,Integer>getTupla(b,c)).collect(Collectors.toList());
			return lista;
		};
		
		var a = f.apply("hola mundo en java hola hola");
		
		for (int i = 0; i< a.length; i++ ) {
			System.out.println(a[i]);
		}
		
		var d = g.apply(a);
		
		d.stream().forEach(System.out::println);
		
		System.out.println("**************************************");

		
		Function<String, List<Tupla<String, Integer>> > comp = Compo.<String,String[], List<Tupla<String, Integer>> >composicion2().apply(f).apply(g);
		System.out.println(comp.apply("hola mundo en java hola hola mundo en hola java"));
	}
}
