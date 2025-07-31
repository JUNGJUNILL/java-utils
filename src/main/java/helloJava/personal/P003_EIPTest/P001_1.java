package helloJava.personal.P003_EIPTest;

public class P001_1 {

    public static void main(String[] args) {
     
        A a = new B();
        System.out.println(a.a);
        System.out.println(a.getValue());
        
    }
}

class A {
    public int a=10;
    public int getValue(){
        return this.a;
    }
    public A(){
        System.out.println("A 생성자");
        show();
    }

    public void show(){
        System.out.println("A의 show함수");
    }


}

class B  extends A {
    public int a=20;

    @Override
    public int getValue(){
        return this.a;
    }
    public B(){
        System.out.println("B 생성자");
        show();
    }

    @Override
    public void show(){
        System.out.println("B의 show함수");
    }
}
