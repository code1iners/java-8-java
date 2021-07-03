package main.java.hello.codeliner.java8.functional_interface.basic;


@FunctionalInterface
public interface FunctionalInterfaceNoArg {

    abstract void print();    // note. 추상 메서드.

    static void printName() {
        System.out.println("Codeliner");
    }

    default void printAge() {
        System.out.println("30");
    }
}
