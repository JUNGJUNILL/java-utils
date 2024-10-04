package helloJava.personal.P003_EIPTest;

public class P003_2020_07_exam_Hard {

    //다음은 n이 10일 때 10을 이진수로 반환하는 자바소스코드이다
    //?에 들어갈 값을 적으시오
    //(답은 하단에 있음 생각좀 해보자)
    public static void main(String[] args) {
       int a[] =new int[8];
       int i=0;
       int n=10;

//       while( ? ){
//        a[i++] = ? ;
//        n /=2;
//       }

       for(i=7; i>=0; i--){
           System.out.print(a[i]); //출력결과 00001010
       }


    }
}










































// n > 0
// n % 2