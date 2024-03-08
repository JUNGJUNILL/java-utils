package helloJava.personal.P001_algorithm;
import java.util.LinkedList;
import java.util.Queue;

//중복문자 하나만 남기기
public class P006_Algorithm {

    public static void main(String[] args) {

		String str05 = "영영영일일일이이이삼사오"; 
		Queue<Character> q= new LinkedList<Character>(); 
		
		for(int i=0; i<str05.length(); i++){
			
			if(q.contains(str05.charAt(i))){
				q.remove(str05.charAt(i)); 
				q.add(str05.charAt(i)); 
			}else{
				q.add(str05.charAt(i)); 
			}
		}
		
		while(!q.isEmpty()){
			System.out.print(q.poll());
		}
		
	}
    
}
