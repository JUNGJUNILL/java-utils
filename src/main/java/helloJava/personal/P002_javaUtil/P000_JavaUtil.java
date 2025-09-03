package helloJava.personal.P002_javaUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
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
    
    public static void func8(){
        String str = "010-9839-8544|010-9053-7084";
        String abc = "정-준-일";
        String[] arr = str.split("\\|"); 
        String[] arr2 = abc.split("\\-"); 

        for(String hello : arr2){
            System.out.println(hello);
        }
    }

    public static void func9(){

        Map<String,Object> map = new HashMap<>(); 
        if( map.get("hello") == null){
            map.put("hello", "world"); 
        }

        System.out.println(map.get("hello").toString());

    }

    public static void func010(){
        Map<String,Object> map1 =new HashMap<>(); 
        Map<String,Object> map2 =new HashMap<>(); 
        map2.put("1", "hello"); 
        map2.put("1", "world"); 
        map1.put("1", map2); 

        Map<String,Object> dd = (Map) map1.get("1"); 
        System.out.println(dd.get("1").toString());
    }

    public static void func011(){


    String[] arr = new String[5];

    arr[0] = "1";
    arr[1] = "1";
    arr[2] = "1";
    arr[3] = "2";
    arr[4] = "2";

    Set<String> processedGroups = new HashSet<>();

    for (String value : arr) {
        if (!processedGroups.contains(value)) {
            System.out.println("Processing group " + value);
            processedGroups.add(value);
        }
    }
}


    public static void func012(){
        
        @Data
        class Test{
             private String nm; 
             private String id;
             private int age; 
             private String flag; 
        }

        Test vo1 = new Test(); 
        vo1.setNm("정준일"); 
        vo1.setFlag("F"); 

        Test vo2 = new Test(); 
        vo2.setNm("정준일"); 
        vo2.setFlag("O"); 

        Test vo3 = new Test(); 
        vo3.setNm("정준일"); 
        vo3.setFlag("O"); 

        List<Test> result = new ArrayList<>();
        result.add(vo1);
        result.add(vo2);
        result.add(vo3);

        Iterator<Test> iterator = result.iterator();
        while (iterator.hasNext()) {
            Test vo = iterator.next();
            if (vo.getNm().equals("정준일") && vo.getFlag().equals("O")) {
                iterator.remove(); // 안전한 제거 방법
            }
        }

        for(Test vo : result){
            System.out.println("오잉? - > "+vo.getFlag());
        }
    }
    

    static void func013() {

        Map<String, Object> item = new HashMap<>();
        Map<String, String> data = new HashMap<>();
        
        String userNm = (String) item.get("USER_NM");
        
        // NULL 체크 후 빈 문자열 반환
        

    

    }

    static void func014(){
        String str = null; 
        if(str != null){
            System.out.println("not null");
        }else{
            System.out.println("null");
        }
    }


    

    public static void main(String[] args) throws Exception {
        // func0(); 
        // func1();
        // func2();
        // func4();
        // func012();

        func014();


    }

}
