package Generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        //EXEMPLO SEM GENERICS
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);

        //EXEMPLO COM GENERICS
        Set <String> conjuntoComGenerics = new HashSet<>();
        conjuntoComGenerics.add("Elemento 1");
        conjuntoComGenerics.add("Elemento 2");

        //ITERANDO SOBRE O CONJUNTO COM GENERICS
        for(String elemento : conjuntoComGenerics){
            System.out.println(elemento);
        }

        //ITERANDO SOBRE O CONJUNTO SEM GENERICS(NECESSÁRIO CAST)
        for(Object elemento : conjuntoSemGenerics){
            //instaceof = OPERADOR DE JAVA PARA DETERMINAR SE TAL OBJETO FAZ PARTE DA CLASSE
            if(elemento instanceof String){
                String str = (String) elemento;
                System.out.println(str);
            }else {
                System.out.println("Elemento de tipo incompativel: " + elemento);
            }
        }

    }
}
