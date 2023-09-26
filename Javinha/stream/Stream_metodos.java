package Javinha.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_metodos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> numerosAoCubo = numeros.stream()
                .map(x -> x*x*x)
                .collect(Collectors.toList());

        System.out.println("\nNúmeros elevados ao cubo: " + numerosAoCubo);

        List<Integer> numPar = numeros.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Esses são os números pares do array: " + numPar);


        List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais",
                "Espirito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná");

        long numerosEstadosTerminaComO = estados.stream()
                .filter(x -> x.toString().endsWith("o"))
                .count();

        System.out.println("\nNúmero de Estados cujo nome terminam com a letra O: " + numerosEstadosTerminaComO);

        estados.stream()
                .filter(x -> x.toString().startsWith("S"))
                .forEach(System.out::println);

    }
}
