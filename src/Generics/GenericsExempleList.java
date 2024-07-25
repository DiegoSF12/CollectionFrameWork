package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsExempleList {
    public static void main(String[] args){
        //EXEMPLO SEM GENERICS
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        //EXEMPLO COM GENERICS
        List <String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("Elemento 1");
        listaComGenerics.add("Elemento 2");

        //ITERANDO SONRE A LISTA COM GENERICS
        for(String elemento : listaComGenerics){
            System.out.println(elemento);
        }

        //ITERANDO SOBRE A LISTA SEM GENERICS (NECESSARIO FAZER CAST)
        for(Object elemento : listaSemGenerics){
            //VERIFICA SE O ELEMENTO É UMA STRING ANTES DE FAZER O CAST
            //instaceof = É UM OPERADOR PARA VERIFICAR SE O OBJETO É UMA INSTACIA DE UMA DETERMINADA CLASSE
            if(elemento instanceof String){
                String str = (String) elemento;
                System.out.println(str);
            }else {
                System.out.println("Elemento não é do mesmo tipo: " + elemento);
            }

        }
    }
}

