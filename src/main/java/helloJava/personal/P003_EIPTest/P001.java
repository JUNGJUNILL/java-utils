package helloJava.personal.P003_EIPTest;

public class P001 {

    public static void main(String[] args) {

        int[][] a = {{1,2},{3},{4,5,6}};
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);

        String str1= "A";
        String str2 = "A";
        String str1_1=str1;
        //A라는 문자가 String pool에 저장되어 str1과 str2는 동일한 A를 바라보기때문에 TRUE값이 나온다.
        System.out.println("str1 == str2 : "+ (str1 == str2));
        System.out.println("str1 == str1_1 : "+(str1 == str1_1));

        //NEW 방식은 HEAP에 따로따로 메모리에 할당함으로 FALSE가 나옴
        String str3 =new String("A");
        String str4 =new String("A");
        System.out.println(str3 == str4);      //주소값을 비교
        System.out.println(str3.equals(str4)); // 문자열 자체를 비교

        System.out.println(5+2+"=3+4");


    }
}
