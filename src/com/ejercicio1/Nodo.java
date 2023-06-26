package com.ejercicio1;

public final class Nodo<T> implements BinTree<T>{

	private final T root;
	private final BinTree<T> left;
	private final BinTree<T> right;
	
	
	public Nodo(T root,BinTree<T> left, BinTree<T> right) {
		this.root = root;
		this.left = left;
		this.right = right;
	}

	@Override
	public BinTree<T> left() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public BinTree<T> right() {
		// TODO Auto-generated method stub
		return right;
	}

	@Override
	public T root() {
		// TODO Auto-generated method stub
		return root;
	}

	@Override
	public boolean isEmpyt() {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public String toString() {
		return String.format("[%s,%s,%s]", root, left.toString(), right.toString());
	}
	
 
}
