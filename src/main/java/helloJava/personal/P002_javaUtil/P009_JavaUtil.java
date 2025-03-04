package helloJava.personal.P002_javaUtil;

import java.util.ArrayList;
import java.util.List;

//제네릭 : 반환 타입을 호출하는쪽에서 지정하도록 하는 것 , <T> 타입변수, 타입 매개변수라고도 함
//제네릭 클래스
class P009_1<T> {
    List<T> fruits = new ArrayList<>(); 
    public void add(T fruit){
        fruits.add(fruit); 
    }
}

public class P009_JavaUtil {

    //제네릭 메서드
     static <T> T hello(T param){
        return param; 
     }
    public static void main(String[] args) {
        
        P009_1<String> string = new P009_1();    
        string.add("hello");

        P009_1<Integer> integer = new P009_1();    
        integer.add(1);

        String  a = hello("1"); 
        Integer b = hello(1); 
        float   c = hello(10.9f); 

        final String aa = "123";
        final String aaa;
        // aa = "999" ; //다시 변수를 넣을 수 없음
        String bb ="123"; 
        bb = "999";
        aaa="999";
        System.out.println(aa+" :: "+ bb +" :: "+aaa);

    }
}
