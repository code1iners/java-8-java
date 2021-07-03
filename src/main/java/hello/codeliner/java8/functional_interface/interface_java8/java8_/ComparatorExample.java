package main.java.hello.codeliner.java8.functional_interface.interface_java8.java8_;

import java.util.Comparator;
import java.util.List;

/**
 * reversed()
 * thenComparing()
 * static reverseOrder() / naturalOrder()
 * static nullsFirst() / nullsLast()
 * static comparing()
 */
public class ComparatorExample {

    public static void sort(List<String> names) {
        System.out.println("ComparatorExample.sort");
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed());
        names.forEach(System.out::println);
    }
}
