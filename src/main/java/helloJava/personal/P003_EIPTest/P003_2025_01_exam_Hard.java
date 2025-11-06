package helloJava.personal.P003_EIPTest;

public class P003_2025_01_exam_Hard {


    public static void main(String[] args) {
       new Child01(); 
       System.out.println(Parent01.total);
    }
}


// 이런 경우 자식생성자 실행 시 부모생성자가 먼저 실행되며
// 부모 show함수실행 시 자식의 show 함수가 실행된다. 

// 객체가 생성될 때, 실제 생성된 인스턴스는 자식 클래스인 Child01의 인스턴스입니다. 따라서 show() 메서드를 호출하면, 
// 자바는 컴파일 시점의 타입이 아닌 실행 시점의 실제 객체 타입을 기준으로 어떤 메서드를 실행할지 결정합니다. 
// 즉, Parent01의 생성자에서 show()를 호출하더라도, 현재 생성되고 있는 객체는 Child01이므로 Child01에서 오버라이드한 show() 메서드가 실행되는 것입니다.

//전위 후위 연산자 생각하고....
class Parent01 {
    static int total = 0; 
    int v =1; 
    public Parent01(){
        total += (++v); 
        show(); 
    }

    public void show(){
        System.out.println("parent show()");
        total += total;
 
    }

}

class Child01 extends Parent01 {
    int v =10;

    public Child01(){
        total += v++; 
        show(); 
    }

    @Override
    public void show(){
        System.out.println("child show()");
        total += total*2; 
    }
}