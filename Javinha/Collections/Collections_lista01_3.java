package Javinha.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collections_lista01_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Set<Integer> setN = new HashSet<Integer>();
        Iterator<Integer> iterator = setN.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            setN.add(ler.nextInt());
        }

        System.out.println("Listar dados do Set: " + setN);
    }
}
