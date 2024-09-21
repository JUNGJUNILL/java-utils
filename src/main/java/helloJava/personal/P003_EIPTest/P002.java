package helloJava.personal.P003_EIPTest;


class Parent {
    public Parent(){
        System.out.print("A");
    }

    public Parent(int a){
        System.out.print("B");
    }

    public void fn(){
        System.out.print("C");
    }

    public void fn2(){
        System.out.println("hello");
    }


}

class Child extends Parent {
    public Child(){
        //super(); 가 생략되어 있음
        System.out.print("D");
    }

    public Child(int a){
        super(1);
        System.out.print("E");
    }

    public void fn(){
        System.out.print("F");
    }

    public void fn2(){
        System.out.println("world");
    }
}

//new 하면 일단 첫번째로 1.생성자 함수 실행 , 두번쨰로 2.인스턴스 생성 임
//자식 클래스 생성시 부모클래스의 생성자가 먼저 호출된다.

public class P002 {
    public static void main(String[] args) {
        Parent a = new Parent();
        Parent b = new Parent(1);
        Parent c =new Child();
        Parent d =new Child(1);

        Child e =new Child();
        Child f =new Child(2);

        a.fn();
        e.fn();
        System.out.println();
        e.fn2();
    }
}
