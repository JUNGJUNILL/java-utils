package helloJava.personal.P002_javaUtil;

//쉬프트 연산자
public class P003_JavaUtil {
    
	static String toBinaryString(int x){
		
		String str = "00000000000000000000000000000000"; 
		String tmp = str + Integer.toBinaryString(x); 
		return tmp.substring(tmp.length()-32); 
	}

    public static void main(String[] args) {

		//x << n 은 x * 2^n의 결과와 같다. 
		//x >> n 은 x / 2^n의 결과와 같다.
		int x = 8; 
		int n = 4;
		System.out.println(x << n);

		System.out.printf("%d << %d = %4d \t%s%n",x, 1 , x<<1, toBinaryString(x<<1));
		
		System.out.printf("%d >> %d = %4d \t%s%n",x, 0 , x>>0, toBinaryString(x>>0));
		
		System.out.printf("%d >> %d = %4d \t%s%n",x, 1 , x>>1, toBinaryString(x>>1));
    }

}
