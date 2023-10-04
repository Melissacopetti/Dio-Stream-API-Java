package ExemplosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "c", "go", "ruby");

        //Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        // Predicate<String> maisQueCincoCaracteres = palavra -> palavra.length() > 5;

        //usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida, imprimir cada palavra que passou no filtro

        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
