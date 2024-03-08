package helloJava.personal.P001_algorithm;


//배열 요소를 거꾸로 출력
public class P010_Algorithm {

	public static void main(String[] args) {

		int[] arr={1,2,3,4,5}; 
		//5,4,3,2,1 이렇게 출력 

		for(int i=0; i<arr.length; i++){
			
			int j=arr.length-i-1; 
			System.out.print(arr[j]);
		}

	}
}
