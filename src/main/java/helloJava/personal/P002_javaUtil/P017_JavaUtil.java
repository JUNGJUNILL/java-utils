package helloJava.personal.P002_javaUtil;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class P017_JavaUtil {
    

    public static boolean fn_getDateOfBirth(String str1, String str2) {
        int divisionCode = Integer.parseInt(str2.substring(0, 1));
        String dateOfBirth = null;

        // 한국인 1900~
        if (divisionCode == 1 || divisionCode == 2) {
            dateOfBirth = "19" + str1;

            // 한국인 2000~
        } else if (divisionCode == 3 || divisionCode == 4) {
            dateOfBirth = "20" + str1;

        } 
        //2100 년이 되면 로직을 추가하면된다.
        // else if () {

        // } 
        try {

            if (dateOfBirth != null && dateOfBirth.length() == 8) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String checkDate = dateOfBirth.subSequence(0, 4) + "-" + dateOfBirth.subSequence(4, 6) + "-"
                        + dateOfBirth.subSequence(6, 8);
                        System.out.println(checkDate);
                LocalDate.parse(checkDate, formatter);
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
           return false;
            
        }

    }


    public static void main(String[] args) {
        // System.out.println(fn_getDateOfBirth("901231",""));

        String str ="5"; 
        String a = str.substring(0,1);
        System.out.println(a);

        	 List<String> genderCd = Arrays.asList("1", "2", "3", "4");
             System.out.println(genderCd.contains(a));
    }
    
}