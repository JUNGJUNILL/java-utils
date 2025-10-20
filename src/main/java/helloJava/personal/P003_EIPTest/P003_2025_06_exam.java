package helloJava.personal.P003_EIPTest;

public class P003_2025_06_exam{

    public static class P1 {
        public int x(int i) { return i + 2; }
        public static String id() { return "P";}
        public void hello(){System.out.println("helloworld");}
    }
    public static class C1 extends P1 {
        public int x(int i) { return i + 3; }
        public String x(String s) { return s + "R"; }
        public static String id() { return "C"; }
    }

    public static void main(String[] args) {
        P1 ref = new C1();
        //다형성
        // - 참조 타입은 P1이지만, 실제 객체는 C1입니다. 이것을 다형성이라고 합니다.
        // - 컴파일 시점에는 ref의 타입이 P1이므로 P1의 메서드가 호출될 것처럼 보일 수 있습니다.
        // - 하지만 자바는 동적 디스패치를 사용하기 때문에 실제 객체 타입C1의 메서드가 실행됩니다.
        // - 즉, 참조 타입이 아니라 실제 객체 타입이 중요하다 

        //static 메서드 
        // - static 메서드는 오버라이딩이 불가능하다.
        // - 대신 숨김(hide) 이라는 개념이 적용됩니다.
        // - 즉, 참조 변수의 컴파일 시점 타입에 따라 어떤 메서드가 호출될지 결정됩니다.
        // - P1 ref = new C1(); -> 참조 타입은 P1, 실제 객체는 C1
        // - ref.id() 호출 시, 컴파일러는 ref의 타입(P1)을 기준으로 결정
        // - 인스턴스 메서드는 동적 바인딩(런타임에 실제 객체 기준), 정적 메서드(컴파일 시점에 참조 타입 기준)는 정적 바인딩으로 동작합니다.


        System.out.println(ref.x(2) + ref.id());
    

    }
}
