package main.java.hello.codeliner.java8.functional_interface.stream;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream pipe line (intermediate operation / terminal operation).
 * parallelStream()
 * map()
 * filter()
 *
 */
public class StreamExample {

    public static void stream(List<String> names) {
        System.out.println("stream");
        names.stream()
                .map((name)-> {
                    System.out.println("name = " + name + ", thread = " + Thread.currentThread().getName());
                    return name.toUpperCase();
                })
                .collect(Collectors.toList());
    }

    public static void parallelStream(List<String> names) {
        System.out.println("parallelStream");
        names.parallelStream()
                .map((name) -> {
                    System.out.println("name = " + name + ", thread = " + Thread.currentThread().getName());
                    return name.toUpperCase();
                })
                .collect(Collectors.toList());
    }

    public static void startsWithSpring(List<OnlineClass> ocs) {
        System.out.println("startsWithSpring");
        List<OnlineClass> result = ocs.stream()
            .filter((c) -> c.getTitle().contains("spring"))
            .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    public static void notClosedClasses(List<OnlineClass> ocs) {
        System.out.println("notClosedClasses");
        List<OnlineClass> result = ocs.stream()
            .filter((oc) -> !oc.isClosed())
            .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    public static void notClosedClasses2(List<OnlineClass> ocs) {
        System.out.println("notClosedClasses2");
        List<OnlineClass> result = ocs.stream()
            .filter(Predicate.not(OnlineClass::isClosed))
            .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    public static void convertByClassTitle(List<OnlineClass> ocs) {
        System.out.println("convertByClassTitle");
        List<String> result = ocs.stream()
            .map(OnlineClass::getTitle)
            .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    public static void printAllClassesId(List<List<OnlineClass>> all) {
        System.out.println("printAllClassesId");
        List<OnlineClass> result = all.stream()
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
        result.forEach(System.out::println);
    } 

    public static void iterate() {
        System.out.println("iterate");
        Stream.iterate(10, i->i+1)
            .skip(10)
            .limit(10)
            .forEach(System.out::println);
    }

    public static void anyMatch(List<OnlineClass> springs) {
        System.out.println("anyMatch");
        boolean result = springs.stream().anyMatch(c -> c.getTitle().contains("test"));
        System.out.println("result : " + result);
    }

    public static void containsSpringInTitle(List<OnlineClass> springs) {
        System.out.println("containsSpringInTitle");
        List<String> result = springs.stream()
            .map(OnlineClass::getTitle)
            .filter(s -> s.contains("spring"))
            .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
