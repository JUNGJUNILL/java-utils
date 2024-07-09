package helloJava.personal.P002_javaUtil;

public class P004_JavaUtil {


    public static void main(String[] args) {

        SingleTonClass obj1 = new SingleTonClass();
        System.out.println(obj1);
        SingleTonClass obj2 = new SingleTonClass();
        System.out.println(obj2);

        SingleTonClass s1 = SingleTonClass.getInstance();
        s1.logic();

        SingleTonClass s2 = SingleTonClass.getInstance();
        s2.logic();

    }
}

class SingleTonClass {

    static final SingleTonClass instance = new SingleTonClass();

    static SingleTonClass getInstance(){
        return instance;
    }

    void logic(){
        System.out.println(this);
    }


}