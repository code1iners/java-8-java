package main.java.hello.codeliner.java8.functional_interface.interface_java8.interface_;

public class FirstInterfaceImpl implements FirstInterface {

    private String name = "guest";

    public FirstInterfaceImpl(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
