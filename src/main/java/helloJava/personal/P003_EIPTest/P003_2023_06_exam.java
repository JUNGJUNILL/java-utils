package helloJava.personal.P003_EIPTest;

public class P003_2023_06_exam {


    public static int fact(int n){
        if(n == 1){
            return 1;
        }else{
            return n * fact(n-1);
        }
    }
    //출력결과를 작성하시오
    public static void main(String[] args) {

        int sum = fact(7);
        System.out.println(sum);

    }

}
