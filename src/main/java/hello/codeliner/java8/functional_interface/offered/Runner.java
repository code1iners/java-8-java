package main.java.hello.codeliner.java8.functional_interface.offered;

public class Runner {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 7;
        System.out.println("num1 = " + num1 +", num2 = " + num2);

        /**
         * Function example.
         * Single parameter, Single output.
         */
        FunctionExample.plus10(num1);
        FunctionExample.multiply2(num1);
        FunctionExample.composePlus10AndMultiply2(num1);
        FunctionExample.andThenPlus10AndMultiply2(num1);

        /**
         * BiFunction example.
         */
        FunctionExample.biFunctionSum(num1, num2);

        /**
         * UnaryOperator example.
         */
        FunctionExample.unaryOperatorPlus10(num1);

        /**
         * BinaryOperator example.
         */
        FunctionExample.binaryOperatorSum(num1, num2);

        /**
         * Consumer example.
         */
        ConsumerExample.consumerPrint("Guest");

        /**
         * Supplier example.
         */
        SupplierExample.supplierGet10();

        /**
         * Predicate example.
         */
        PredicateExample.predicateIs10(10);
        PredicateExample.predicateIsGuest("Guest");
        PredicateExample.predicateIsGuest("guest");
        PredicateExample.predicateIsEven(2);
        PredicateExample.predicateIsEven(3);

    }
}
