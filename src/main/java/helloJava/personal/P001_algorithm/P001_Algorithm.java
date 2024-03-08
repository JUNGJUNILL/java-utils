package helloJava.personal.P001_algorithm;

//배열의 요소를 한칸씩 앞뒤로 바꾸기
public class P001_Algorithm {

    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5}; 
        int K=2; 
        //K 칸씩 뒤로 밀어보자

        int[] newArray01 = new int[array.length]; 
        int[] newArray02 = new int[array.length]; 
    
        for(int i=0; i<array.length; i++){
			
			int index = (K+i) % array.length; 
			newArray01[i] = array[index];
			newArray02[index]=array[i]; 
		}

        for(int n : newArray01){
			System.out.print(n);
		}
		System.out.println();
		System.out.println("======================");
		
		
		for(int n : newArray02){
			System.out.print(n);
		}
    
    
    }
    
}
