package helloJava.personal.P003_EIPTest;


interface exInterFace {
    int sum(int[] a, boolean odd);
}

class exInterFaceImpl implements exInterFace {

    public  int sum(int[] a, boolean odd){
        int result = 0 ;

        for(int i=0; i<a.length; i++){
            if((odd && a[i] % 2 !=0) || (!odd && a[i] % 2 == 0)){
                result+=a[i];
            }
        }
        return result;
    }
}
public class P003_2024_05_exam {

    //출력결과를 작성하시오
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8,9};
        exInterFaceImpl x = new exInterFaceImpl();
        System.out.println(x.sum(a,true) + ", " + x.sum(a,false));
    }

}
