import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Desafio 4 - Remova todos os valores ímpares:
// Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // filtra pares
                .collect(Collectors.toList()); // coleta apenas os pares
        System.out.println("Lista sem os números ímpares " + numerosPares);
    }
}
