package helloJava.personal.P003_EIPTest;

class Parent000 {
    public void show(){
        System.out.println("Parent");
    }
}

//?에 들어갈 키워드를 작성하시오
class Child000 extends Parent000 {
    public void show(){
        System.out.println("Child");
    }
}
public class P003_2000_03_exam {
    public static void main(String[] args) {
        Parent000 pa = new Child000();
        pa.show();
    }
}
