import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Desafio01 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */
public class Desafio01 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //ordena lista em ordem crescente
        Collections.sort(numeros,(num1,num2)-> num1.compareTo(num2));

        //exibir lista ordenada
        for(Integer numero : numeros){
            System.out.print(numero + " ");
        }

    }
}