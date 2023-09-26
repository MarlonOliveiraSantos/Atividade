package Javinha.ContaBancária;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int escolha;

        List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais",
                "Espirito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná","Coma Banana", "Coma Aveia", "Coma Proteinas em geral", "Coma Grãos", "Evitar embutidos", "Evitar Margarina", "Evitar Açucares em excesso");

            System.out.println("digite um numero");
            escolha = ler.nextInt();
        if (escolha == 1) {
            List<String> estadosR = estados.stream()
                    .filter(x -> x.toString().startsWith("C"))
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("\nEstados cujo nome começam com a letra R: " + estadosR);
        }



    }
}
