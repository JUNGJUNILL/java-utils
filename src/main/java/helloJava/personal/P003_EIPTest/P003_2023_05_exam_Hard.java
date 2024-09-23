package helloJava.personal.P003_EIPTest;

class Parent008 {
    public void paint(){
        System.out.print("A");
    }
    public void draw(){
        System.out.print("B");
        draw();
    }
}

class Child008 extends Parent008 {
    public void paint(){
        super.draw();
        System.out.print("C");
        this.draw();
    }
    public void draw(){
        System.out.print("D");
    }
}
public class P003_2023_05_exam_Hard {
    
    //출력결과를 작성하시오
    public static void main(String[] args) {

        Parent008 c =new Child008();
        c.paint();
        c.draw();
    }
}
