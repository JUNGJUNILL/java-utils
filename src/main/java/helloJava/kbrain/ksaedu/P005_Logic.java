package helloJava.kbrain.ksaedu;

import java.util.Map;

public class P005_Logic {

    private static String formatMsg(Map<String, String> data, String msg){
		for (String col : data.keySet()) {
			String val = data.get(col);
			if(val == null) val = "-";
			msg = msg.replaceAll("\\$" +col+ "\\$", val);
		}
		return msg;
	}
    

    public static void main(String[] args) {
        String msg = "[KSAEDU] 교육참여안내\r\n" + //
        "\r\n" + //
        "KSA 교육을 신청해주셔서 감사합니다.\r\n" + //
        "\r\n" + //
        "- 과정명:  $CRS_NM$\r\n" + //
        "- 교육기간: $EDU_BGNG_DT$ ~ $EDU_END_DT$($EDU_DAYCNT$일, $EDU_HR$시간)\r\n" + //
        "- 교육장소: $LECRM_ADDR$\r\n" + //
        "- 교육방법: $PARTCPT_MTHD_CD_NM$\r\n" + //
        "- 진행자 : $OPRTR_DEPT_NM$ $OPRTR_NM$($OPRTR_TELNO$)\r\n" + //
        "\r\n" + //
        "※ 출결 확인을 위해 시작 15분 전에 교육장소에 꼭 도착해주세요.\r\n" + //
        "▼ (필독)교육참여안내\r\n" + //
        "https://litt.ly/ksaedu\r\n" + //
        "\r\n" + //
        "감사합니다."; 
        System.out.println(msg);
    }
}
