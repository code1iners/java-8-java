package main.java.hello.codeliner.java8.interface_java8.interface_;

public interface FirstInterface {

    void printName();

    String getName();

    static void printHello() {
        System.out.println("hello");
    }

    /**
     * @ImplSpec
     * This implementation is print name by uppercase.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }
}
