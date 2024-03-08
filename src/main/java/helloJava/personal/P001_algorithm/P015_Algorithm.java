package helloJava.personal.P001_algorithm;

//문자열숫자검증
public class P015_Algorithm {

	public static void main(String[] args) {

		String abc = "12345";
		// String aaa ="12345k"; 

		
		if(abc.matches("[0-9]+")){
			System.out.println("숫자임");
		}else{
			System.out.println("숫자아님");
		}
		
	}
}
