package Generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMaps {
    public static void main(String[] args) {
        //EXEMPLO SEM GENERICS
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 3", "valor");//PERMITE ADICINAR TIPOS DISTINTOS

        //EXEMPLO COM GENERICS
        Map <String, Integer>  mapaGenerics = new HashMap<>();
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20);

        //ITERANDO SOBRE O MAPA COM GENERICS
        for(Map.Entry<String, Integer> entry : mapaGenerics.entrySet()){
            String chave  = entry.getKey();
            int valor = entry.getValue();
            System.out.printf("Chave: %s\nValo: %d\n", chave, valor);
        }
        System.out.println();

        //ITERANDO SOBRE O MAPA SEM GENERICS(NECESSÁRIO O CAST)
        for(Object obj : mapaSemGenerics.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + "\nValor: " + valor);

        }

    }
}
