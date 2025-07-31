package helloJava.personal.P003_EIPTest;

public class P003_2024_10_exam_Hard {

  public static class Collection<T>{
    T value;
 
    public Collection(T t){
        value = t;
    }
 
    public void print(){
       new Printer().print(value);
    }
 
   class Printer{
      void print(Integer a){
        System.out.print("A" + a);
      }
      void print(Object a){
        System.out.print("B" + a);
      } 
      void print(Number a){
        System.out.print("C" + a);
      }
      void print(Long a){
        System.out.print("D" + a);

      }
   }
 }
 
  public static void main(String[] args) {
      new Collection<>(0).print();
  }

}