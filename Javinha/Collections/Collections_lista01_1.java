package Javinha.Collections;

import java.util.*;

public class Collections_lista01_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<String> vetor = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma cor entre: Azul,Verde,Amarelo,Branco,Laranja: ");
            vetor.add(ler.nextLine());
        }
        System.out.println("Listar todas as cores: \n" + vetor);
        Collections.sort(vetor);
        System.out.println("Ordenar as cores: \n" + vetor);
    }
}
