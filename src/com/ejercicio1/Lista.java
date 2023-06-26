package com.ejercicio1;

public sealed interface Lista <T> permits Nil, Cons{

	Lista NIL = new Nil<>();
	
	T head();
	
	Lista<T> tail();
	
	boolean isEmpty();
	
	static <T>Lista<T> of (T head, Lista<T> tail){
		
		return new Cons<>(head, tail);
	}
	
	static <T> Lista<T> of(T... elems){
		Lista<T> ret = Lista.NIL;
		
		for(int i=  elems.length -1; i>=0; i--) {
			
			T h =  elems[i];
			
			var tmp = Lista.of(h,ret);
			
			ret = tmp;
		}
		
		return ret;
	}
	
	default Lista<T> append(T elem){
		
		return isEmpty()? Lista.of(elem) : Lista.of(head(), tail().append(elem));
	}
	
	default Lista<T> preppend(T elem){
		
		return Lista.of(elem, this) ;
	}
	
	default Lista<T> drop(int n){
		
		return isEmpty() || n <=0? this : tail().drop(n-1);
	}
	
	default Lista<T> take(int n){
		
		return isEmpty() || n <= 0? NIL : Lista.of(head(), tail().take(n-1));
	}
	
	default Integer size(Lista<T> lista) {
		
		return isEmpty() || lista.tail() == null?  0 : lista.size(lista.tail()) + 1;
	}
} 
