package helloJava.personal.P001_algorithm;


//10_100_1000고르기
public class P008_Algorithm {

	public static void main(String[] args) {

		int length=10; 
		for(int i=1; i<=1000; i++){
			
			if(i==length){
				System.out.println(length);
				length*=10; 
			}
		}
	}
    
}
