package helloJava.personal.P002_javaUtil;

public class P013_JavaUtil {

        public static String getBirthday(String JuminNO){
              if(JuminNO == null) return "";
              if(JuminNO.length() == 0) return "";
              if(JuminNO.length() < 13) return "";
              
              JuminNO = JuminNO.replaceAll("-","");
              
              String retVal = "";
              
              // 1.생년월일 계산
              int gubun = toInt(JuminNO.substring(6, 7));
              String ssn1 = JuminNO.substring(0, 6);
              
              switch(gubun){
                case 1:
                case 2:
                case 5:
                case 6:
                  JuminNO = "19" + ssn1;
                  break;
                case 3:
                case 4:
                case 7:
                case 8:
                  JuminNO = "20" + ssn1;
                  break;
                default:
                  JuminNO = "-1";
                  break;
              }
              if(JuminNO.equals("-1")) return "";
              
              retVal = JuminNO;
              
              return retVal;
              
            }
    
        public static int toInt(String arg) {
            return new Integer(arg.trim()).intValue();
        }


        public static String fn_getDateOfBirth(String str1, String str2){
            int divisionCode = Integer.parseInt(str2.substring(0, 1));
            String dateOfBirth = null;

            // 한국인 1900~, 외국인 1900~
            if(divisionCode == 1 || divisionCode == 2 || divisionCode == 5 || divisionCode == 6){
                
                dateOfBirth = "19"+str1;

            // 한국인 2000~, 외국인 2000~
            }else if(divisionCode == 3 || divisionCode == 4 || divisionCode == 7 || divisionCode == 8){
              
                dateOfBirth = "20"+str1;

            // 한국인 1800~
            }else if(divisionCode == 9 || divisionCode == 0){
                
                dateOfBirth = "18"+str1;
            }

            if(dateOfBirth.length() == 8){
                return  dateOfBirth.subSequence(0, 4)+"-"+dateOfBirth.subSequence(4, 6)+"-"+dateOfBirth.subSequence(6, 8);
                
            }else{
                return "";
            }
        }

        public static String getGenderCd(String rrno2){
            int genderCode = Integer.parseInt(rrno2.substring(0, 1));
            String gender = null;
            if(genderCode % 2 > 0){
                gender = "M";
            }else if(genderCode % 2 == 0){
                gender = "F";
            }
            return gender;
        }
    
        public static void main(String[] args) {
            System.out.println(fn_getDateOfBirth("801233","1111111")); // 19801211
            System.out.println(fn_getDateOfBirth("901207","1785415")); // 19801211
            System.out.println(fn_getDateOfBirth("991207","3785415")); 
            System.out.println(getBirthday("900611-1124921")); // 19900611
            System.out.println(getBirthday("201232-3123527")); // 20210302

            String str = "19901207"; 
            System.out.println(str.length());
       
            ;
        }
}
