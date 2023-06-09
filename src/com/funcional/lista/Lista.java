package com.funcional.lista;

import java.util.function.Predicate;

public sealed interface Lista<T> permits Nil, Cons {

	Lista NIL = new Nil();

	T head();

	Lista<T> tail();

	boolean isEmpty();

	static <T> Lista<T> of(T h, Lista<T> t) {
		return new Cons<>(h, t);
	}

	static <T> Lista<T> of(T... elems) {
		Lista<T> ret = Lista.NIL;
		for (int i = elems.length - 1; i >= 0; i--) {
			T h = elems[i];
			var tmp = Lista.of(h, ret);
			ret = tmp;
		}
		return ret;
	}

	default Lista<T> append(T elemen) {
		return isEmpty() ? Lista.of(elemen) : Lista.of(head(), tail().append(elemen));
	}

	default Lista<T> prepend(T elem) {
		return Lista.of(elem, this);
	}

	default Lista<T> remove(T elem) {
		return isEmpty() ? NIL : isEmpty() ? tail() : Lista.of(head(), tail().remove(elem));
	}

	default Lista<T> drop(int n) {
		// elimina un numero determinado de elemntos drop(2) // elimina dos elementos
		return isEmpty() || n <= 0 ? this : tail().drop(n - 1);
	}

	default Lista<T> dropWhile(Predicate<T> p) {
		return isEmpty() || p.test(head()) ? tail().dropWhile(p) : this;
	}

	default Lista<T> concat(Lista<T> a) {
		return isEmpty() ? a : Lista.of(head(), tail().concat(a));
	}

	default Lista<T> take(int n) {
		return isEmpty() || n < 0 ? NIL : Lista.of(head(), tail().take(n - 1));
	}

	default Lista<T> takeWile(Predicate<T> p) {
		return isEmpty() || !p.test(head()) ? NIL : Lista.of(head(), tail().takeWile(p));
	}
}
