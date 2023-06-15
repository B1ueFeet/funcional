package com.funcional;

import java.util.function.Function;

public interface Compo {
	Function<Function<Integer, Integer>, Function<Function<Integer, Integer>, Function<Integer, Integer>>> composicion();
	static Function<Function<Integer, Integer>, Function<Function<Integer, Integer>, Function<Integer, Integer>>> composicion2(){
		return f -> (g -> x -> f.apply(g.apply(x)));
	}
	
	static Function <Integer,Integer> composicion3 (Function<Integer, Integer> f, Function<Integer, Integer> g){
		return x -> f.apply(g.apply(x));
	}
			
}
