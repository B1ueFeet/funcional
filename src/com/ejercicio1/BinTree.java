package com.ejercicio1;

public sealed interface  BinTree <T> permits Nodo, Leaf{
	
	BinTree LEAF = new Leaf<>();

	T root();
	
	BinTree<T> left();
	
	BinTree<T> right();
	
	boolean isEmpyt();
	
	static <T>BinTree<T> buildTree(Lista<T> lista){
		
		if(lista.isEmpty()) {
			return LEAF;
		}else {
			int mid = lista.size(lista.tail())/2 ;
			return new Nodo<T>(lista.head(), BinTree.buildTree(lista.tail().take(mid)), BinTree.buildTree(lista.tail().drop(mid)));
		}
	}
	
	default Integer size(BinTree<T> arbol) {
		int count = 0; // Contar el nodo actual
        if (!arbol.left().isEmpyt()) {
            count += arbol.size(left()) + 1; // Contar los nodos del subárbol izquierdo
        }
        if (!arbol.right().isEmpyt()) {
            count += arbol.size(right()) + 1; // Contar los nodos del subárbol derecho
        }
        return count;
    }
	
}
