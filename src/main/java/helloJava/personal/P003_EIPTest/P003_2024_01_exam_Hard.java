package helloJava.personal.P003_EIPTest;


class Parent010 {
    static private Parent010 instance = null;
    private int count = 0;
    static public Parent010 get(){
        if(instance == null){
            instance =new Parent010();
        }
        return instance;
    }

    public void count(){count++;}
    public int getCount(){return count;}
}
public class P003_2024_01_exam_Hard {

    //출력결과를 작성하시오
    public static void main(String[] args) {

        Parent010 s1 = Parent010.get();
        s1.count();

        Parent010 s2 = Parent010.get();
        s2.count();

        Parent010 s3 = Parent010.get();
        s3.count();
        s1.count();

//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
//        System.out.println(s3.toString());

        System.out.println(s1.getCount());
    }

}










































//4