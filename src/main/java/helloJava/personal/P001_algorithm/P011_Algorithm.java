package helloJava.personal.P001_algorithm;


//배열의 가장 작은 값 없애기
public class P011_Algorithm {

	public static void main(String[] args) {

		int[] array={1,4,2,3}; 
		
		int minIndex=0; 
		for(int i=0; i<array.length; i++){
			// > 작은값 없애기
			// < 큰값 없애기
			if(array[minIndex] > array[i]){
				minIndex=i; 
				
			}
		}
		
		int[] newArray=new int[array.length-1]; 
		int count=0; 
		for(int i=0; i<array.length; i++){
			if(array[minIndex]==array[i]) continue; 
			newArray[count]=array[i];
			count++; 
		}
		
		for(int i : newArray){
			System.out.println(i);
		}
		

	}
}
