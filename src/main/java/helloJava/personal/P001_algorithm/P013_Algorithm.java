package helloJava.personal.P001_algorithm;

import java.util.ArrayList;
import java.util.List;

//정수 배열의 구간의 합을 구하기
public class P013_Algorithm {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50}; 
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		list.add(0); 
		
		for(int i : arr){
			sum+=i; 
			list.add(sum); 
		}

		int left =1;
		int right=2;
		int count = list.get(right+1) - list.get(left);

		System.out.println(count);
	}
}
