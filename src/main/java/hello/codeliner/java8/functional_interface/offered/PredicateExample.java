package main.java.hello.codeliner.java8.functional_interface.offered;

import java.util.function.Predicate;

public class PredicateExample {

    public static void predicateIs10(int param) {
        System.out.println("PredicateExample.predicateIs10");
        Predicate<Integer> is10 = (num) -> num == 10;
        boolean result = is10.test(param);
        System.out.println("result = " + result);
    }

    public static void predicateIsGuest(String param) {
        System.out.println("PredicateExample.predicateIsGuest");
        Predicate<String> isGuest = (name) -> name.toLowerCase().equals("guest");
        boolean result = isGuest.test(param);
        System.out.println("result = " + result);
    }

    public static void predicateIsEven(int param) {
        System.out.println("PredicateExample.predicateIsEven");
        Predicate<Integer> isEven = (num) -> num%2 != 0;
        boolean result = isEven.test(param);
        System.out.println("result = " + result);
    }
}
