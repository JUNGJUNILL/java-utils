package helloJava.personal.P001_algorithm;

import java.util.ArrayList;

//소수판별
public class P004_Algorithm {

	static ArrayList<Integer> list=new ArrayList<>(); 
	static int isPrime02(int x){
		
		int[] array=new int[x+1];
		
		int count=0; 
		
		for(int i=2; i<=x; i++){
			
			if(array[i]==0){
				
				for(int j=2; j*i<=x; j++){
					array[i*j]=j; 
				}
				list.add(i); 
				count++; 
			}
		}
		
		return count;
		
		
	}

    public static void main(String[] args) {
    
		int isPrimeCount=isPrime02(10); 
		System.out.println("소수의 개수="+isPrimeCount);
		for(int i : list){
			System.out.println(i);
		}

    }
    
}
