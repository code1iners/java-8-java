package main.java.hello.codeliner.java8.functional_interface;

/**
 * @implSpec
 * 함수형 인터페이스.
 * 추상 메서드가 하나만 존재.
 * @FunctionalInterface 어노태이션을 명시함으로써 좀 더 견고하게 관리할 수 있음.
 */
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
