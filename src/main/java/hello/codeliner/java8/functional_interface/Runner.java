package main.java.hello.codeliner.java8.functional_interface;

public class Runner {
    public static void main(String[] args) {

        // note. 함수형 인터페이스 -> 익명 클래스.
        FunctionalInterfaceNoArg noArgAnonymousClass = new FunctionalInterfaceNoArg() {
            @Override
            public void print() {
                System.out.println("hello");
            }
        };
        noArgAnonymousClass.print();

        // note. 함수형 인터페이스 -> 람다 표현식.
        FunctionalInterfaceNoArg noArgLambda = () -> System.out.println("Hello");
        noArgLambda.print();

        FunctionalInterfaceArg argLambda = (number) -> System.out.println(number);
        argLambda.print(3);
    }
}
