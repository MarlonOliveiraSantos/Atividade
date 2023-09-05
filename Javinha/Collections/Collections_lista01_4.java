package Javinha.Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collections_lista01_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Set<Integer> setN = new HashSet<Integer>();
        int n;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o número do vetor: ");
            setN.add(ler.nextInt());
        }

        System.out.println("Digite o número que você deseja encontrar: ");
        n = ler.nextInt();

        if (setN.contains(n)) {
            System.out.println("O número " + n + " foi encontrado! ");
        } else {
            System.out.println("O número " + n + " não foi encontrado!");
        }
    }
}
