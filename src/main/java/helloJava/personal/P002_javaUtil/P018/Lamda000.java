package helloJava.personal.P002_javaUtil.P018;


@FunctionalInterface 
// - 함수형 인터페이스란 **단 하나의 추상 메서드(Single Abstract Method, SAM)**만을 가지는 인터페이스를 말합니다.
// - 단, default 메서드나 static 메서드는 여러개 있어도 상관없습니다.
public interface Lamda000 {
    int calculate(int a, int b); 

    default void printHelloWolrd(){
        System.out.println("hello world");
    }

    public static void staticMethod(){
        System.out.println("static method");
    }

}
