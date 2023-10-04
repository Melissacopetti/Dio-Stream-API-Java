package ExemplosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Usar consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        };
        //Usar o Consumer para imprimir numeros pares no Sream
        numeros.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}

