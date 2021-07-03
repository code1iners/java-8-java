package main.java.hello.codeliner.java8.functional_interface.basic;

/**
 * @implSpec
 * 함수형 인터페이스.
 * 추상 메서드가 하나만 존재.
 * @FunctionalInterface 어노태이션을 명시함으로써 좀 더 견고하게 관리할 수 있음.
 * 함수를 (First object class) 로 사용할 수 있다.
 * 순수 함수(Pure function) : 사이드 이펙트를 만들 수 없으며, 상태가 없다.
 * 고차 함수(High-Order function) : 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수 있다.
 */
public class Runner {
    public static void main(String[] args) {

        // note. 함수형 인터페이스 -> 익명 내부 클래스.
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
