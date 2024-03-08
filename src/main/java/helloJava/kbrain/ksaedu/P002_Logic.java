package helloJava.kbrain.ksaedu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P002_Logic {

    public static void main(String[] args) throws ParseException {
        String startDateStr = "2024-01-01";
        String endDateStr = "2024-03-21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse(startDateStr);
        Date endDate = sdf.parse(endDateStr);

        String result = getDaysDifference(startDate, endDate);
        System.out.println(result);
    }

    public static String getDaysDifference(Date startDate, Date endDate) {
        // 1일의 밀리초 수 (24시간 * 60분 * 60초 * 1000밀리초)
        long oneDay = 24 * 60 * 60 * 1000;

        // 두 날짜 간의 차이를 밀리초 단위로 계산하고 일 수로 변환하여 반환
        long differenceInMillis = Math.abs(endDate.getTime() - startDate.getTime());
        long differenceInDays = differenceInMillis / oneDay;

        // 1달의 평균 일 수는 약 30.44일로 가정
        double daysInMonth = 30.44;
        if (differenceInDays > daysInMonth) {
            double months = differenceInDays / daysInMonth;
            return String.format("%.1f", months) + "개월";
        } else {
            return differenceInDays + "일";
        }
    }
    
}
