package ExemplosStream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // usar Supplier com expressão lambda para fornecer uma saudação personalizada
//        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        //Usar Supplier para obter lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(
                        () -> "Olá, seja bem-vindo(a)")
                .limit(3)
                .toList();
        //Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
