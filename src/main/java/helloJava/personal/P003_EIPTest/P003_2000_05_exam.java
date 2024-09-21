package helloJava.personal.P003_EIPTest;

public class P003_2000_05_exam {



    public static void main(String[] args) {

        int i=0;
        int sum=0;

        while(i<10){
            i++;
            if(i%2 == 1)
                continue;
            sum +=i;
        }

        System.out.println(sum);

    }
}
