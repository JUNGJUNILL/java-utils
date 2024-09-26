package helloJava.personal.P003_EIPTest;



class Parent003 {
    public int compute(int num){
        if(num <= 1) return num;
        return compute(num-1) + compute(num-2);
    }

}

class Child003 extends Parent003 {
    public int compute(int num){
        if(num <=1 ) return num;
        return compute(num-1) + compute(num-3);
    }
}

public class P003_2020_09_exam {

    public static void main(String[] args) {

        Parent003 obj = new Child003();
        System.out.println(obj.compute(4));
    }
}
