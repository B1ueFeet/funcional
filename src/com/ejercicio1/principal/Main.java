package com.ejercicio1.principal;

import com.ejercicio1.BinTree;
import com.ejercicio1.Lista;
import com.ejercicio1.Nil;

public class Main  {

	public static void main(String[] args) {
		Lista<Integer> l1 = Lista.of(1,2,3,4,5,6,7,8);
		
		Lista NIL = Lista.of();
		
		System.out.println(l1.size(l1));
	
		BinTree<Integer> arbol = BinTree.buildTree(l1);
		BinTree<Integer> arbol1= BinTree.buildTree(NIL);
		
		System.out.println(arbol);
		System.out.println(arbol1);
		
		System.out.println("Size:" + arbol.size(arbol));
	}
}
