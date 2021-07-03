package main.java.hello.codeliner.java8.functional_interface.offered;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Need parameter and output.
 */
public class FunctionExample {

    /**
     * just plus 10.
     */
    public static void plus10(int number) {
        System.out.println("FunctionExample.plus10");
        Function<Integer, Integer> plus10 = (num) -> num + 10;
        Integer result = plus10.apply(number);
        System.out.println("result = " + result);
    }

    /**
     * just multiply 2.
     */
    public static void multiply2(int number) {
        System.out.println("FunctionExample.multiply2");
        Function<Integer, Integer> multiply2 = (num) -> num * 2;
        Integer result = multiply2.apply(number);
        System.out.println("result = " + result);
    }

    /**
     * compose.
     * first multiply 2 and then plus 10.
     */
    public static void composePlus10AndMultiply2(int number) {
        System.out.println("FunctionExample.plus10AndMultiply2");
        Function<Integer, Integer> plus10 = (num) -> num + 10;
        Function<Integer, Integer> multiply2 = (num) -> num * 2;
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        Integer result = multiply2AndPlus10.apply(number);
        System.out.println("result = " + result);
    }

    /**
     * andThen.
     * first plus 10 and then multiply 2.
     */
    public static void andThenPlus10AndMultiply2(int number) {
        System.out.println("FunctionExample.andThenPlus10AndMultiply2");
        Function<Integer, Integer> plus10 = (num) -> num + 10;
        Function<Integer, Integer> multiply2 = (num) -> num * 2;
        Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2);
        Integer result = plus10AndMultiply2.apply(number);
        System.out.println("result = " + result);
    }

    /**
     * BiFunction.
     */
    public static void biFunctionSum(int num1, int num2) {
        System.out.println("FunctionExample.biFunctionSum");
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;   // note. method reference.
        Integer result = sum.apply(num1, num2);
        System.out.println("result = " + result);
    }

    /**
     * UnaryOperator.
     */
    public static void unaryOperatorPlus10(int param1) {
        System.out.println("FunctionExample.unaryOperatorSum");
        UnaryOperator<Integer> plus10 = (num1) -> num1 + 10;
        Integer result = plus10.apply(param1);
        System.out.println("result = " + result);
    }

    /**
     * BinaryOperator.
     */
    public static void binaryOperatorSum(int param1, int param2) {
        System.out.println("FunctionExample.binaryOperatorPlus10AndMultiply2");
//        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> sum = Integer::sum; // note. same feature above.
        Integer result = sum.apply(param1, param2);
        System.out.println("result = " + result);
    }
}
