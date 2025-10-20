package helloJava.personal.P003_EIPTest;

public class P003_2025_04_exam{

    public static void change(String[] data, String s){
        data[0] = s;
        s="Z"; 
    }

    public static void main(String[] args) {

        String[] data = {"A"};
        String s = "B"; 
        change(data, s); 
        System.out.println(data[0]+s);
        
    }
}
