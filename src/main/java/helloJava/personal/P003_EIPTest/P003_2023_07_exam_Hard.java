package helloJava.personal.P003_EIPTest;

//다음은 자바 코드이다. 오류가 발생하는 라인의 번호를 쓰시오
class Parent009 {
    private String name;

    public Parent009(String val){
        name = val;
    }

//    public static String get(){
//        return name;
//    }

    public void print(){
        System.out.println(name);
    }
}
public class P003_2023_07_exam_Hard {

    public static void main(String[] args) {
        Parent009 p = new Parent009("Hello");
        p.print();
    }



}
