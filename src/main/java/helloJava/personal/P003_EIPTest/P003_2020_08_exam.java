package helloJava.personal.P003_EIPTest;

public class P003_2020_08_exam {

    //다음은 n이 10일 때 10을 이진수로 반환하는 자바소스코드이다
    //?에 들어갈 값을 적으시오
    public static void main(String[] args) {
        int[][] a = new int[3][5];

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                a[i][j] = j*3 + (i+1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
