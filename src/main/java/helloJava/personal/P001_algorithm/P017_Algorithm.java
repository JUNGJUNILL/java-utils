package helloJava.personal.P001_algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//N번째 큰 수, N번째 작은 수
public class P017_Algorithm {


	public static int maxRank(int[] numbers , int count){

		Arrays.sort(numbers);
		Stack<Integer> stack = new Stack<>();

		for(int i : numbers){

			if(!stack.contains(i)){
				stack.push(i); 
			}
		}

		if(stack.size() < count){

			int max = stack.pop();
			return max; 

		}else{
			int cnt=0;
			int result=0;
			while (cnt != count) {
				result = stack.pop();
				cnt++;
			}
			return result; 
			//4 3 2 1
			// 0 != 2 | result = 4 | cnt=1
			// 1 != 2 | result = 3 | cnt=2
			// 2 != 2
		}
	}
	
	public static int minRank(int[] numbers , int count){

		Arrays.sort(numbers);
		Queue<Integer> q = new LinkedList<>(); 
		for(int i : numbers){

			if(!q.contains(i)){
				q.add(i); 
			}
		}

		if(q.size() < count){

			int min = q.poll(); 
			return min; 

		}else{
			int cnt=0;
			int result=0;
			while (cnt != count) {
				result = q.poll();
				cnt++;
			}
			return result; 
		}
	}

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,-1,999};
		//가장 큰 수 뽑기 
		System.out.println(maxRank(arr, 1));
		
		//가장 작은 수 뽑기
		System.out.println(minRank(arr, 1));

	}
}
