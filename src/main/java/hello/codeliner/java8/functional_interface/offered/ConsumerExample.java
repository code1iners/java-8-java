package main.java.hello.codeliner.java8.functional_interface.offered;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void consumerPrint(String name) {
        System.out.println("ConsumerExample.consumerPrint");
        Consumer<String> print = System.out::println;   // note. method reference.
        print.accept(name);
    }
}
