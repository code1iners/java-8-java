package main.java.hello.codeliner.java8.interface_java8.java8_;

import java.util.List;
import java.util.stream.Collectors;

/**
 * stream()
 * parallelStream()
 * removeIf(Predicate)
 */
public class CollectionExample {

    public static void stream(List<String> names) {
        System.out.println("CollectionExample.stream");
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .filter(s -> s.contains("1"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    public static void removeIf(List<String> names, String option) {
        System.out.println("CollectionExample.removeIf");
        names.removeIf(name -> name.contains(option));
        names.forEach(System.out::println);
        names.add("name 3");
    }
}
