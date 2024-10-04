package helloJava.personal.P003_EIPTest;

class Parent007 {
    int x =100;
    Parent007(){
        this(500);
    }

    Parent007(int x){
        this.x = x;
    }

    int getX(){
        return x;
    }
}

class Child007 extends Parent007 {
    int x = 4000;

    Child007(){
        this(5000);
    }

    Child007(int x){
        this.x=x;
    }
}
public class P003_2023_03_exam_Hard {

    //출력결과를 작성하시오
    public static void main(String[] args) {

        Child007 obj = new Child007();
        System.out.println(obj.getX());

    }

}









































//500