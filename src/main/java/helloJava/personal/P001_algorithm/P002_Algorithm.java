package helloJava.personal.P001_algorithm;

//정수의 자리수 구하기
public class P002_Algorithm {

    public static void main(String[] args) {
        
		int numbers=123456789; 
		int count=0; 

		while(numbers>0){

			numbers =numbers/10; 
			count++;
			
		}

		System.out.println("count="+count);
    
    }
    
}
