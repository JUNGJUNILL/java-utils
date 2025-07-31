package helloJava.personal.P002_javaUtil;

public class P015_JavaUtil {


    public static String nvl(String value, String defaultValue) {
        if (value == null || value.equals("")) {
            return defaultValue;
        } else {
            return value;
        }
    }


    public static String compNumberFomater(String number){
        String onlyDigits = number.replaceAll("\\D+", "");  
        boolean isBrnoFormat = checkCompNumber(onlyDigits); 
        String brno=""; 
        if(isBrnoFormat){
            brno = onlyDigits.substring(0,3)+"-"+onlyDigits.substring(3,5)+"-"+onlyDigits.substring(5); 
            return brno; 
        }else{
            return brno; 
        }
    }


    public static boolean checkCompNumber(String comp) {
		
		if(comp.length() != 10) return false;
		return checkCompNumber(comp.substring(0,3), comp.substring(3,5), comp.substring(5,10));
    }

     /**
     * <p>XXX - XX - XXXXX 형식의 사업자번호 앞,중간, 뒤 문자열 3개 입력 받아 유효한 사업자번호인지 검사.</p>
     *     
     * 
     * @param   3자리 사업자앞번호 문자열 , 2자리 사업자중간번호 문자열, 5자리 사업자뒷번호 문자열
     * @return  유효한 사업자번호인지 여부 (True/False)
     */
	public static boolean checkCompNumber(String comp1, String comp2, String comp3) {
	
		String compNumber = comp1 + comp2 + comp3;
		
		int hap = 0;
		int temp = 0;
		int check[] = {1,3,7,1,3,7,1,3,5};  //사업자번호 유효성 체크 필요한 수
	
		if(compNumber.length() != 10)    //사업자번호의 길이가 맞는지를 확인한다.
			return false;
	
		for(int i=0; i < 9; i++){
			if(compNumber.charAt(i) < '0' || compNumber.charAt(i) > '9')  //숫자가 아닌 값이 들어왔는지를 확인한다.
				return false; 
			
			hap = hap + (Character.getNumericValue(compNumber.charAt(i)) * check[temp]); //검증식 적용
			temp++;
		}
			
		hap += (Character.getNumericValue(compNumber.charAt(8))*5)/10;

		if ((10 - (hap%10))%10 == Character.getNumericValue(compNumber.charAt(9))) //마지막 유효숫자와 검증식을 통한 값의 비교
			return true;
		else
			return false;
 	}	

        public static void main(String[] args) {


            String brno = nvl("127-82-11109","-"); 
            brno = compNumberFomater(brno); 
            System.out.println("==brno==" + brno);

 
        }
}
