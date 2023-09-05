package Javinha.Collections;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections_lista01_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<Integer> vetor = new ArrayList<Integer>();
        Integer n;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o vetor: ");
            vetor.add(ler.nextInt());
        }

        System.out.println("Digite o número que você deseja encontrar: ");
        n = ler.nextInt();

        if (vetor.contains(n)) {
            int indice = vetor.indexOf(n);
            System.out.println("O número " + n + " está localizado na posição: " + indice);
        } else {
            System.out.println("O número " + n + " não foi encontrado!");
        }
    }
}
