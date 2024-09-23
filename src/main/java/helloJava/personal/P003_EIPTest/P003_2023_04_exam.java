package helloJava.personal.P003_EIPTest;

public class P003_2023_04_exam {
    
    //출력결과를 작성하시오
    public static void main(String[] args) {

      String s1 ="hello";
      String s2 = "hello";
      String s3 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));


    }

}
