package helloJava.personal.P003_EIPTest;

class Parent011 {
    int x,y;
    Parent011(int x, int y){ // 1
        this.x = x;
        this.y = y;
    }

    int getA(){ // 2
        return x+y;
    }
}

class Child011 extends Parent011 {
    int x;
    Child011(int x){ // 3
        super(x+1,x);
    }

    int getA(int n){ // 4
        return x+x;
    }
}

public class P003_2024_02_exam_Hard {
    //프로그램 동작 순서를 1~7의 번호로 쓰시오
    //단 번호는 중복되지 않아야 한다.
    public static void main(String[] args) { // 5

        Parent011 parent =new Child011(3); // 6
        System.out.println(parent.getA()); // 7

    }

}


























// 5 - 6 - 3 - 1 - 7 - 2