package helloJava.personal.P003_EIPTest;


class StaticClass {
    public int a=20;
    static int b = 0;
}
public class P003_2023_01_exam {

    //출력결과를 작성하시오
    public static void main(String[] args) {

        int a;
        a = 10;
        StaticClass.b = a;

        StaticClass st =new StaticClass();
        System.out.println(StaticClass.b++);
        System.out.println(st.b);
        System.out.println(a);
        System.out.println(st.a);

    }
}
