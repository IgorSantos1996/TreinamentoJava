package services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<T>> T max(List<T> list) { // recebe uma lista de inteiros
        if (list.isEmpty()) { // verifica se a lista está vazia
            throw new IllegalArgumentException("a lista não pode ser vazia.");
        }

        T max = list.get(0); // pega o primeiro elemento da lista
        for (T item : list) { // fazer um for comparando se cada item dessa lista
            // é mais do que max
            if (item.compareTo(max) > 0) { // se a comparação de objeto com outro
                // for mais que 0, que dizer que o primeiro é maior
                max = item; // atualizamos a variável max
            }
        }
        return max;
    }
}
