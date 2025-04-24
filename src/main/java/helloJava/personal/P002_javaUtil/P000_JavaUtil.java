package helloJava.personal.P002_javaUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class P000_JavaUtil {

    private static String formatMsg(Map<String, String> data, String msg){
		for (String col : data.keySet()) {
			String val = data.get(col);
			if(val == null) val = "-";
			msg = msg.replaceAll("\\$" +col+ "\\$", val);
		}
		return msg;
	}

    private static void func0() {
        String msg = "[KSAEDU] 교육참여안내 \r\n" + //
                        "\r\n" + //
                        "KSA 교육을 신청해주셔서 감사합니다. \r\n" + //
                        "- 과정명: ISO 45001(안전보건경영시스템) 인증심사원 자격확대 [KAR/GPC 승인] \r\n" + //
                        "- 교육기간: 2025-04-04 09:30 ~ 2025-04-06 17:30(3일, 21시간) \r\n" + //
                        "- 교육장소: 퓨처밸류캠퍼스 강남 306호 \r\n" + //
                        "- 교육방법: 집합(대면) \r\n" + //
                        "- 진행자 : 교육총괄실 나수현 연구원(02-6240-5606) \r\n" + //
                        "\r\n" + //
                        "※ 출결 확인을 위해 시작 15분 전에 교육장소에 꼭 도착해주세요. \r\n" + //
                        "\r\n" + //
                        "▼ 교육참여안내 \r\n" + //
                        "https://litt.ly/ksaedu \r\n" + //
                        "$PRIVCY_AGRE_URL$\r\n" + //
                        "감사합니다.\r\n" + //
                        ""; 
        String newLine = System.lineSeparator();
        Map<String, String> msgEditMap = new HashMap<>(); 
        StringBuffer privcyAgreUrlMsgBuffer = new StringBuffer();
        privcyAgreUrlMsgBuffer.append(newLine).append(newLine);
        privcyAgreUrlMsgBuffer.append("▼ (필수) 교육생 개인정보동의서"); 
        privcyAgreUrlMsgBuffer.append(newLine);
        privcyAgreUrlMsgBuffer.append("http://www.naver.com"); 
        privcyAgreUrlMsgBuffer.append(newLine).append(newLine);
        String privcyAgreUrlMsg = privcyAgreUrlMsgBuffer.toString(); 
        
        msgEditMap.put("PRIVCY_AGRE_URL", privcyAgreUrlMsg);

        String editMsg = formatMsg(msgEditMap,msg); 
        System.out.println(editMsg);
    }

    public static void func1(){
        // 현재 날짜 가져오기
        LocalDate currentDate = LocalDate.now();

        // 원하는 형식 설정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // 날짜를 지정된 형식으로 출력
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
    }
    

    public static void func2(){
        List<String> results = new ArrayList<>();

        results.add("hello");
        results.add("world");

        String a =results.get(results.size()-1);
        System.out.println(a);
        results.remove(results.size()-1); 

        for(String str : results){
            

        }
        
    }

    public static void func3(){

        	String gbort ="2B(75000)";
			Pattern pattern = Pattern.compile("\\((\\d+)\\)");
			Matcher matcher = pattern.matcher(gbort);
			if (matcher.find()) {
				String numberStr = matcher.group(1);
				int number = Integer.parseInt(numberStr);
				if (number >= 1000) {
					NumberFormat formatter = NumberFormat.getNumberInstance(Locale.KOREA);
					String formattedNumber = formatter.format(number);
					gbort = gbort.replace("(" + numberStr + ")", "(" + formattedNumber + ")");
                    System.out.println(gbort.replace("(" + numberStr + ")", "(" + formattedNumber + ")"));
				}
			}
            System.out.println(gbort);
    }

    public static void func4(){
        int number =10000000;
        NumberFormat formatter = NumberFormat.getNumberInstance(Locale.KOREA);
        String formattedNumber = formatter.format(number);
        System.out.println(formattedNumber);
    }

    public static void func5(){
        StringBuffer msgEditBuffer = new StringBuffer();
        String newLine = System.lineSeparator();
        String crsNm = "과정명 과정명";
        String privcyAgreUrl = "https://www.naver.com";
        msgEditBuffer.append("[KSA/개인정보동의서]");
        msgEditBuffer.append(newLine);
        msgEditBuffer.append("안녕하십니까? 한국표준협회입니다.");
        msgEditBuffer.append(newLine).append(newLine);
        msgEditBuffer.append("교육 참여에 필요한 <개인정보동의서> 링크를 보내드립니다. 교육 전 까지 아래 URL을 통해 반드시 양식을 제출해주시기 바랍니다.");
        msgEditBuffer.append(newLine).append(newLine);
        msgEditBuffer.append("과정명: ").append(crsNm);
        msgEditBuffer.append(newLine).append(newLine);
        msgEditBuffer.append("▼ 동의서 링크");
        msgEditBuffer.append(newLine);
        msgEditBuffer.append(privcyAgreUrl);
        System.out.println(msgEditBuffer.toString());
    }

    public static void func6(){
        try {
            InputStream inputStream = new FileInputStream("C:\\nsispromotion_log.txt");
            // 파일 읽는 작업 수행
            inputStream.close(); // inputStream 닫기

            // inputStream이 닫힌 이후에 다시 작업을 시도하면 에러가 발생합니다.
            // 따라서 inputStream을 다시 생성해주면 됩니다.
            inputStream = new FileInputStream("C:\\nsispromotion_log.txt");

            // 다시 파일 읽는 작업 수행
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int func7(){
        int retVal=0;
        int check = 0;
        int a =10; 
        try {
            a /= 0; // ArithmeticException 발생
            check= 1;
        } catch (Exception e) {
            e.printStackTrace(); // 예외 출력
            check = 0;
        } finally {
            retVal=check;
        }
        System.out.println(retVal);
        return retVal; 
    }
    
    
    

    public static void main(String[] args) {
        // func0(); 
        // func1();
        // func2();
        func7();
        // func4();

    }

}
