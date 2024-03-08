package helloJava.personal.P001_algorithm;


//투포인터를 활용한 문자열 뒤집기
public class P012_Algorithm {

	public static void main(String[] args) {

		String str = "정준일";
		char[] s = str.toCharArray(); 

		int start=0; 
		int end=s.length-1;  

		while(start<end){
			
			char first = s[start]; 
			s[start] = s[end]; 
			s[end] = first; 
			
			start++;
			end--;
		}

		//start=0, end=2 | 0 < 2 true first=정 | s[0] = s[2] {일,준,일} | s[2] = 정 {일,준,정} | start=1 , end=1
		//start < end false 종료

		
		for(char c : s){
			System.out.print(c);
		}

	}
}
