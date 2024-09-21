package helloJava.personal.P003_EIPTest;



class Parent005 {
    int a;
    public Parent005(int a){
        this.a =a;
    }

    int func(){
        int b=1;
        for(int i=1; i<a; i++){
            b = a * i + b;
        }
        return a+b;
    }
}
public class P003_2022_02_exam {
    
    public static void main(String[] args) {

        Parent005 obj = new Parent005(3);
        obj.a = 5;
        int b = obj.func();
        System.out.println(obj.a + b);

    }

}
