package main.java.hello.codeliner.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> names = getNames();
        List<List<OnlineClass>> ocs = getOnlineClasses();
        List<OnlineClass> springClesses = ocs.get(0);
        List<OnlineClass> javaClasses = ocs.get(1);

        StreamExample.stream(names);
        StreamExample.parallelStream(names);
        StreamExample.startsWithSpring(springClesses);
        StreamExample.notClosedClasses(javaClasses);
        StreamExample.notClosedClasses2(javaClasses);
        StreamExample.convertByClassTitle(springClesses);
        StreamExample.printAllClassesId(ocs);
        StreamExample.iterate();
        StreamExample.anyMatch(springClesses);
        StreamExample.containsSpringInTitle(springClesses);
    }

    private static List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("name 1");
        names.add("name 2");
        names.add("name 3");
        names.add("name 4");
        return names;
    }

    private static List<List<OnlineClass>> getOnlineClasses() {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", false));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring restful api", true));
        springClasses.add(new OnlineClass(5, "netflix", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(5, "java test", true));
        javaClasses.add(new OnlineClass(5, "java code minipulation", false));
        javaClasses.add(new OnlineClass(5, "java 8 api", true));

        List<List<OnlineClass>> result = new ArrayList<>();
        result.add(springClasses);
        result.add(javaClasses);
        return result;
    }
}
