package helloJava.personal.P003_EIPTest;


class Parent001 {
    private int a;
    public Parent001 (int a){
        this.a = a;
    }
    public void display(){
        System.out.println("a="+a);
    }
}

class Child001 extends Parent001 {
    public Child001(int a){
        super(a);
        super.display();
    }
}
public class P003_2000_04_exam {

    public static void main(String[] args) {
        Child001 obj = new Child001(10);
    }
}
