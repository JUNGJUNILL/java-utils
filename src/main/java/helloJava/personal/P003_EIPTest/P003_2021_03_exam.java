package helloJava.personal.P003_EIPTest;

public class P003_2021_03_exam {
    public static void main(String[] args) {

        P003_2021_03_exam a1 =new P003_2021_03_exam();
        Over2 a2 = new Over2();
        System.out.println(a1.san(3,2) + a2.san(3,2));
    }
    int san(int x, int y){
        return x+y;
    }
}

class Over2 extends P003_2021_03_exam {
    int san(int x, int y){
        return x-y + super.san(x,y);
    }
}