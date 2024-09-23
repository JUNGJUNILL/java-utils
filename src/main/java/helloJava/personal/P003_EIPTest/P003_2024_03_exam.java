package helloJava.personal.P003_EIPTest;


class Parent012 {

    int a,b;
    public Parent012(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class Child012 extends Parent012 {

    int c=3;
    public Child012(int i){
        super(i,i+1);
    }
    public void print(){
        System.out.println(c*c);
    }

}
public class P003_2024_03_exam {
    public static void main(String[] args) {
        Child012 a = new Child012(10);
        a.print();

    }

}
