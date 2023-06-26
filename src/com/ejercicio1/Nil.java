package com.ejercicio1;

public final class Nil<T> implements Lista<T> {

	protected Nil() {
		
	}
	
	@Override
	public T head() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lista<T> tail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Nil";
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
