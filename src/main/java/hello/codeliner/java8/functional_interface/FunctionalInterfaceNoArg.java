package main.java.hello.codeliner.java8.functional_interface;


@FunctionalInterface
public interface FunctionalInterfaceNoArg {

    void print();    // note. 추상 메서드. (abstract 디폴트로 설정되어있다.)

    static void printName() {
        System.out.println("Codeliner");
    }

    default void printAge() {
        System.out.println("30");
    }
}
