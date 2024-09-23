package helloJava.personal.P003_EIPTest;


class Parent006 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void Usort(int[] a, int len){
        for(int i=0; i<len; i++){
            for(int j=0; j<len-i-1; j++){
                if(a[j] > a[j+1]){
                    swap(a,j,i+1);
                }
            }
        }
    }
}
public class P003_2023_02_exam {
    
    //출력결과를 작성하시오
    public static void main(String[] args) {
        int[] items = {5,4,9,1,3,7};
        int nx = 6;
        Parent006.Usort(items,nx);
        for(int data : items){
            System.out.print(data+" ");
        }


    }

}
