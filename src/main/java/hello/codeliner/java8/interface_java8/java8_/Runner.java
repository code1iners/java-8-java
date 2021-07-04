package main.java.hello.codeliner.java8.interface_java8.java8_;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("name 1");
        names.add("name 2");
        names.add("name 3");
        names.add("name 4");


        // note. Iterable.
        IterableExample.forEach(names);     // note. forEach().
        IterableExample.spliterator(names); // note. spliterator().

        // note. Collection.
        CollectionExample.stream(names);    // note. stream().
        CollectionExample.removeIf(names, "3");

        // note. Comparator.
        ComparatorExample.sort(names);
    }
}
