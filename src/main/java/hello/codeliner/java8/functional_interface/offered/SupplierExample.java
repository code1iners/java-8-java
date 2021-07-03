package main.java.hello.codeliner.java8.functional_interface.offered;

import java.util.function.Supplier;

public class SupplierExample {

    public static void supplierGet10() {
        System.out.println("SupplierExample.supplierGet10");
        Supplier<Integer> get10 = () -> 10;
        Integer result = get10.get();
        System.out.println("result = " + result);
    }
}
