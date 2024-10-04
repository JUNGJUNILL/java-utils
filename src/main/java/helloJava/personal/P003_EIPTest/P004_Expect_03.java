package helloJava.personal.P003_EIPTest;

public class P004_Expect_03 {
    public static void main(String[] args) {
        int a=26;
        int b=91;
        int i=0, g=0;
        int min = a < b ? a:b;

        for(i=2; i<min; i++){
            if(a % i == 0 && b % i == 0){
                g = i;
            }
        }

        System.out.println(g);

    }
}
