package main.java.hello.codeliner.java8.functional_interface.method_reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Runner {

    public static void main(String[] args) {

        String name = "guest";

        withNormally(name);
        withStaticMethod(name);
        withInstanceMethod(name);
        withConstructorNoArg(name);
        withConstructorArg(name);
        sortStringListWithArrays();
    }

    public static void withNormally(String name) {
        System.out.println("Runner.withNormally");
        UnaryOperator<String> normally = (s) -> "hi + " + s;
        String result = normally.apply(name);
        System.out.println("result = " + result);
    }

    public static void withStaticMethod(String name) {
        System.out.println("Runner.withStaticMethod");
        UnaryOperator<String> hiWithMethodReference = Greeting::hi;
        String result = hiWithMethodReference.apply(name);
        System.out.println("result = " + result);
    }

    public static void withInstanceMethod(String name) {
        System.out.println("Runner.withInstanceMethod");
        Greeting greeting = new Greeting();
        UnaryOperator<String> instanceMethod = greeting::hello;
        String result = instanceMethod.apply(name);
        System.out.println("result = " + result);
    }

    public static void withConstructorNoArg(String name) {
        System.out.println("Runner.withConstructor");
        Supplier<Greeting> withConstructor = Greeting::new;
        Greeting greeting = withConstructor.get();
        greeting.setName(name);
        String result = greeting.getName();
        System.out.println("result = " + result);
    }

    private static void withConstructorArg(String name) {
        System.out.println("Runner.withConstructorArg");
        Function<String, Greeting> withConstructorArg = Greeting::new;
        Greeting greeting = withConstructorArg.apply(name);
        String result = greeting.getName();
        System.out.println("result = " + result);
    }

    private static void sortStringListWithArrays() {
        String[] names = {"guest1", "guest3", "guest2"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
