package helloJava.personal.P001_algorithm;

//YYYYMMDD 날짜 유효성 검증 로직
public class P016_Algorithm {

	public static boolean validationDay(String day){
		
		if(day.length()!=8){
			return false;
		}
		
		Integer iYear = Integer.parseInt(day.substring(0,4)); 
		Integer iMonth=Integer.parseInt(day.substring(4,6)); 
		Integer  iDay = Integer.parseInt(day.substring(6,8)); 		
		
		if(12  < iMonth){
			return false;
		}

		int[] aDaysInMonth ={31,28,31,30,31,30,31,31,30,31,30,31};

		int iDaysInMonth = (iMonth!=2)?aDaysInMonth[iMonth-1]:((iYear%4==0 && iYear%100!=0 || iYear % 400==0)?29:28);
		
		
		if( (iDay!=null && iMonth!=null && iYear!=null  && 
				iMonth<13 && 
				iMonth>0 && 
				iDay>0 && iDay<=iDaysInMonth) == false ){
			return false;
		}
		
		return true; 
	}

	public static void main(String[] args) {

		System.out.println(validationDay("20221231"));
		System.out.println(validationDay("20221232"));

	}
}
