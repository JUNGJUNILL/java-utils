package helloJava.personal.P003_EIPTest;


class Parent004 {
    int a;
    int b;
}
public class P003_2022_01_exam {

    static void func1(Parent004 p){
        p.a *=10;
    }

    static void func2(Parent004 p){
        p.a += p.b;
    }

    //출력결과를 쓰시오.
    public static void main(String[] args) {

        Parent004 m =new Parent004();
        m.a = 100;
        func1(m);

        m.b = m.a;
        func2(m);
        System.out.printf("%d",m.a);

    }
}
