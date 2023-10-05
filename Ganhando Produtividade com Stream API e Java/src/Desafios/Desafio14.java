import java.util.Arrays;
import java.util.List;
// Desafio 14 - Encontre o maior número primo da lista:
// Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> maiorPrimo = numeros.stream()
        .filter(Desafio14::isPrimo) // Filtra números primos
        .max(Integer::compare); // Encontra o maior número primo

if (maiorPrimo.isPresent()) {
    System.out.println("O maior número primo na lista é: " + maiorPrimo.get());
} else {
    System.out.println("Não foi encontrado nenhum número primo na lista.");
}
}

// Função para verificar se um número é primo
public static boolean isPrimo(int numero) {
if (numero <= 1) {
    return false;
}
for (int i = 2; i <= Math.sqrt(numero); i++) {
    if (numero % i == 0) {
        return false;
    }
}
return true;
}
   
}
