package main.java.hello.codeliner.java8.functional_interface.interface_java8.interface_;

public class Runner {

    public static void main(String[] args) {
        FirstInterfaceImpl guest = new FirstInterfaceImpl("guest");
        guest.printName();
        guest.printNameUpperCase();
        FirstInterface.printHello();

        SecondInterfaceImpl secondGuest = new SecondInterfaceImpl("second guest");
        secondGuest.printName();
        secondGuest.printNameUpperCase();
//        SecondInterface.printHello(); // note. compile error.
    }
}
