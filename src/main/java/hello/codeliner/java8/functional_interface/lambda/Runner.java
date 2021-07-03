package main.java.hello.codeliner.java8.functional_interface.lambda;

import java.util.function.Consumer;

public class Runner {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
    }

    /**
     * Shadowing test (Scope duplicate test).
     */
    private void run() {
        final int baseNumber = 3;

        /**
         * LocalClass (not duplicate scope).
         * possible shadowing.
         */
        class LocalClass {
            int baseNumber = 22; // note. possible use baseNumber variable name.
            void printBaseNumber() {
                System.out.println("baseNumber = " + baseNumber);
            }
        }

        /**
         * Anonymous class (not duplicate scope).
         * possible shadowing.
         */
        Consumer<Integer> printBaseNumber = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNumber = 11; // note. possible use baseNumber variable name.
                System.out.println("baseNumber = " + baseNumber);
            }
        };

        /**
         * lambda express (duplicate scope).
         * impossible shadowing (can't use baseNumber variable name).
         */
//        Consumer<Integer> printBaseNumber = (baseNumber)  // note. will raise compile error.
//                -> System.out.println("baseNumber = " + baseNumber);
        Consumer<Integer> printBaseNumber_ = (bNumber) // note. will not raise compile error.
                -> System.out.println("baseNumber = " + baseNumber); // note. can't use baseNumber.
    }
}
