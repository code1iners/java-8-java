package main.java.hello.codeliner.java8.interface_java8.java8_;

import java.util.List;
import java.util.Spliterator;

/**
 * Almost not using iterable.
 * forEach()
 * spliterator()
 */
public class IterableExample {

    public static void forEach(List<String> names) {
        System.out.println("IterableExample.forEach");
        names.forEach(System.out::println);
    }

    public static void spliterator(List<String> names) {
        System.out.println("IterableExample.spliterator");
        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("====================");
        while(spliterator1.tryAdvance(System.out::println));
    }
}
