package helloJava.personal.P003_EIPTest;

public class P003_2024_06_exam {

    public static String fn(String str, int index, boolean[] seen){
        if(index < 0) return "";
        char c  =str.charAt(index);
        String result = fn(str,index-1,seen);
        if(!seen[c]){
            seen[c] = true;
            return c + result;
        }
        return result;
    }

    //출력결과를 작성하시오
    public static void main(String[] args) {
        String str = "abacabcd";
        int len = str.length();
        boolean[] seen = new boolean[256];
        System.out.print(fn(str,len-1,seen));

    }

}
