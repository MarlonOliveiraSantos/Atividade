package Javinha.estudoCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collections_lista01_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<String> vetor = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma cor: ");
            vetor.add(ler.nextLine());
        }

        System.out.println("Listar todas as cores: " + vetor);
        //Collections.sort(vetor[i]);
        System.out.println("Ordenar todas as cores: " + vetor);

    }
}
