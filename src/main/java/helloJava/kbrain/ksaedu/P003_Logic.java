package helloJava.kbrain.ksaedu;

public class P003_Logic {

    static void checkValid(String input, int maxByte,int hangulPerByte, boolean required){
        StringBuilder hangulBuilder = new StringBuilder();
        StringBuilder nonHangulBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= '가' && c <= '힣') {
                hangulBuilder.append(c);
            } else {
                nonHangulBuilder.append(c);
            }
        }

        String hangul=hangulBuilder.toString();
        int hangulLen = hangul.length();
        String nonHangul = nonHangulBuilder.toString();
        int nonHangulLen = nonHangul.length();

        if(hangulLen > 0){
            int checkLen = (int) Math.floor(maxByte/hangulPerByte);

            if(checkLen < hangulLen){
                System.out.println("한글은 "+checkLen+"자 입력 할 수 없습니다.");

            }else if(maxByte <  ((hangulLen*3) + nonHangulLen)) {
                System.out.println("입력 가능한 바이트수를 초과하였습니다.");
            }else{
                System.out.println("완료!");
            }
        }else{

            int inputLen = input.length();
            if (maxByte < inputLen) {
                System.out.println(maxByte + "자 입력 가능합니다.");
            } else if (required && inputLen == 0) {
                System.out.println("필수값 입니다.");
            } else {
                System.out.println("가능충");
            }
        }

    }
    public static void main(String[] args) {
        checkValid("",10,3,true);
    }
    
}
