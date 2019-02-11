package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();

    public void addValue(T value) { // add um valor na lista
        list.add(value);

    }

    public T first() { // retorna o primeiro elemento da lista caso não seja vazia
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return list.get(0); // retorna primeiro elemento da lista
    }

    public void print() {
        System.out.println("[");
        if (!list.isEmpty()) { // lista não vazia
            System.out.println(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.println(", " + list.get(i));
        }

        System.out.println("]");
    }

}