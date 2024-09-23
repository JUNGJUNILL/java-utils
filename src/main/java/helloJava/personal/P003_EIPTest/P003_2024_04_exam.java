package helloJava.personal.P003_EIPTest;

public class P003_2024_04_exam {

    public static void check(int[] a, int[] b){
        if(a==b){
            System.out.print("O");
        }else{
            System.out.print("N");
        }
    }
    //출력결과를 작성하시오
    public static void main(String[] args) {

        int[] a =new int[]{1,2,3,4};
        int[] b =new int[]{1,2,3,4};
        int[] c =new int[]{1,2,3};
        check(a,b);
        check(b,c);
        check(a,c);

    }

}
