import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Desafio 7 - Encontrar o segundo número maior da lista:
// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remove duplicatas
                .sorted((num1, num2) -> num2.compareTo(num1))// Ordena em ordem decrescente
                .skip(1)// Pula o primeiro elemento (o maior número)
                .findFirst();// Pega o segundo maior

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número é: " + segundoMaior.get());
        } else {
            System.out.println("Não foi possível encontrar o segundo maior número na lista.");
        }
    }
}
