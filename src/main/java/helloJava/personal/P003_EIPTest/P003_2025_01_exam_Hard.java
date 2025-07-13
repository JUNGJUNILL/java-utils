package helloJava.personal.P003_EIPTest;

public class P003_2025_01_exam_Hard {


    public static void main(String[] args) {
        int a = 6;
        int b = 10; 
         a+= b++;
         System.out.println("a="+a);
        new Child01(); 
       System.out.println(Parent01.total);
    }
}


//이런 경우 자식생성자 실행 시 부모생성자가 먼저 실행되며
//부모 show함수실행 시 자식의 show 함수가 실행된다. 

//전위 후위 연산자 생각하고....
class Parent01 {
    static int total = 0; 
    int v =1; 
    public Parent01(){
        System.out.println("parent");
        total += (++v); 
        show(); 
    }

    public void show(){
        total += total;
        System.out.println("parent show="+total);
 
    }

}

class Child01 extends Parent01 {
    int v =10;

    public Child01(){
        System.out.println(total +" child");
        total += v++; 
        show(); 
    }

    @Override
    public void show(){
        System.out.println(total+"child show"+total);
        total += total*2; 
    }
}