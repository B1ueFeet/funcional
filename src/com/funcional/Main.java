package com.funcional;


import com.funcional.lista.Cons;
import com.funcional.lista.Lista;

public class Main {
    public static void main(String[] args) {

    Lista<Integer> miLista = Lista.of(2,3,7,4,8);
        System.out.println("LISTA:");
        System.out.println(miLista.toString()+ "\n");
        
        System.out.println("APPEND");
        var l2 = miLista.append(99);
        System.out.println(l2 + "\n");  
        
        System.out.println("PREPEND");
        var l3 = miLista.prepend(99);
        System.out.println(l3+ "\n");
        
        System.out.println("REMOVE");
        var l4 = miLista.remove(3);
        System.out.println((l4)+ "\n");
        
        
        System.out.println("DROP");
        var l5 = miLista.drop(2);
        System.out.println(l5+ "\n");
        
        System.out.println("DROPWHILE");
        var l10 = Lista.of();
        var l6 = miLista.dropWhile(t->t%2==0);
        System.out.println(l6+ "\n");
        System.out.println(l10+ "\n");
        
        System.out.println("CONCAT");
        var l7 = miLista.concat(miLista);
        System.out.println(l7+ "\n");
        
        System.out.println("TAKE");
        var l8 = miLista.take(2);
        System.out.println(l8+ "\n");
                
        System.out.println("TAKEWHILE");
        var l9 = miLista.takeWile(t->t%2==0);
        System.out.println(l9+ "\n");
        
        

    }
}

