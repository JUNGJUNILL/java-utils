package helloJava.personal.P003_EIPTest;

public class P003_2024_09_exam {

  static void func() throws Exception {
    throw new NullPointerException(); 
  }

    public static void main(String[] args) {
      int sum = 0;
      try {
          func();
      } catch (NullPointerException e) {
          sum = sum + 1;
      } catch (Exception e) {
          sum = sum + 10;
      } finally {
          sum = sum + 100;
      }
      System.out.print(sum);
     
  }


}