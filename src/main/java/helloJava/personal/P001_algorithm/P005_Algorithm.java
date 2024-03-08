package helloJava.personal.P001_algorithm;


//배열의 중복값을 제외하고 출력
public class P005_Algorithm {

    public static void main(String[] args) {

		int[] arr ={0,0,1,1,1,2,2,3,3,4}; 
		int len = arr.length-1;
		int count=1; 

		for(int i=0; i<len; i++){
			
			if(arr[i] != arr[i+1]){
				arr[count++] = arr[i+1]; 
			}

			//i=0   (arr[0] != arr[1]) 0 != 0 false 
			//i=1   (arr[1] != arr[2]) 0 != 1 true arr[1] = arr[2] = {0,"1",1,1,1,2,2,3,3,4} count = 2
			//i=2   (arr[2] != arr[3]) 1 != 1 false
			//i=3   (arr[3] != arr[4]) 1 != 1 false
			//i=4   (arr[4] != arr[5]) 1 != 2 true arr[2] = arr[5] = {0,1,"2",1,1,2,2,3,3,4} count = 3
			//i=5   (arr[5] != arr[6]) 2 != 2 false
			//i=6   (arr[6] != arr[7]) 2 != 3 true arr[3] = arr[7] = {0,1,2,"3",1,2,2,3,3,4} count = 4
			//i=7   (arr[7] != arr[8]) 3 != 3 false
			//i=8   (arr[8] != arr[9]) 3 != 4 true arr[4] = arr[9] = {0,1,2,3,"4",2,2,3,3,4} count = 5

		}

		for(int i=0; i<count; i++){
			System.out.print(arr[i]+" ");
		}
	
	}
    
}
