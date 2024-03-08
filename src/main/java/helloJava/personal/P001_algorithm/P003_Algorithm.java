package helloJava.personal.P001_algorithm;

//팩토리얼
public class P003_Algorithm {


	//0! 1 (1)
	//1! 1 (1*1)
	//3! 6 (3*2*1)
	//5! 120 (5*4*3*2*1)

	public static int factorial(int x){

		if(x==0){
			return 1;
		}else{
			return x * factorial(x-1); 
		}
	}

    public static void main(String[] args) {
        

		System.out.println(factorial(5));

    }
    
}
