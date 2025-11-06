package helloJava.personal.P003_EIPTest;

public class P003_2025_03_exam_Hard{
    public static void main(String[] args) {
        
        System.out.println(calc("5"));
    }

    static int calc(int v){
        if(v <=1) return v; 
        return calc(v -1) + calc(v - 2);
    }

    static int calc(String v){
        int value = Integer.valueOf(v); 
        if(value <=1) return value; 
        return calc(value -1) + calc(value - 3);
    }

}
