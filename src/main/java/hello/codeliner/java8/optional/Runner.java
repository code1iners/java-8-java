package main.java.hello.codeliner.java8.optional;

import java.util.ArrayList;
import java.util.List;

import main.java.hello.codeliner.java8.stream.OnlineClass;

public class Runner {
    
    public static void main(String[] args) {
        List<List<OnlineClass>> ocs = getOnlineClasses();
        List<OnlineClass> springs = ocs.get(0);

        OptionalExample.getProgress();
        OptionalExample.getProgressWithOptional();
        OptionalExample.isPresentAndIsEmpty(springs);
        OptionalExample.getItem(springs);
        OptionalExample.getOrElse(springs);
        OptionalExample.getOrElseGet(springs);
        OptionalExample.getOrElseThrow(springs);
        OptionalExample.optionalFilter(springs);
        OptionalExample.optionalMap(springs);
        OptionalExample.getOptionalTypeItem(springs);
        OptionalExample.optionalFlatMap(springs);
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
