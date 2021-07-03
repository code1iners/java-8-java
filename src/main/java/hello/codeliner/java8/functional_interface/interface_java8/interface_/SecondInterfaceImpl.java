package main.java.hello.codeliner.java8.functional_interface.interface_java8.interface_;

public class SecondInterfaceImpl implements SecondInterface {

    private String name = "second guest";

    public SecondInterfaceImpl(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
