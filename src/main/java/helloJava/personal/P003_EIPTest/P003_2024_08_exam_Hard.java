package helloJava.personal.P003_EIPTest;

public class P003_2024_08_exam_Hard {

    public static void main(String[] args){
      Base a =  new Derivate(); //변수는 오버라이딩되지 않는다.
      Derivate b = new Derivate();
      
      System.out.print(a.getX() + a.x + b.getX() + b.x);
    } 
}

class Base {
  int x = 3;
  int getX(){
     return x * 2; 
  }
  
}
 
class Derivate extends Base {
  int x = 7;

  @Override
  int getX(){
     return x * 3;
  }

}
