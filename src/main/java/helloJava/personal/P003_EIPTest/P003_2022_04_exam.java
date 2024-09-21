package helloJava.personal.P003_EIPTest;

public class P003_2022_04_exam {

    static int[] MakeArray(){
        int[] tempArr = new int[4];
        for(int i=0; i<tempArr.length; i++){
            tempArr[i] = i;
        }
        return tempArr;
    }
    //출력결과를 작성하시오
    public static void main(String[] args) {

        int[] intArr;
        intArr = MakeArray();
        for(int i=0; i<intArr.length; i++){
            System.out.print(intArr[i]);
        }


    }

}
