import java.util.Arrays;
import java.util.List;

/**
 * Desafio02 - - Imprima a soma dos números pares da lista:
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o
 * resultado no console.
 */
public class Desafio02 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra apenas números pares
                .mapToInt(Integer::intValue)// Converte para um fluxo de inteiros
                .sum();// Soma os números pares

        System.out.println("A soma dos números pares é: " + somaPares);

    }
}