package helloJava.personal.P001_algorithm;

public class P020_Algorithm {

	//^ xor 연산자

	public static void main(String[] args) {
		String htmlStr = "<p>안녕하세요. 한국표준협회 KS교육인증·운영센터입니다.</p><p>&nbsp;</p><p><b>2024.1.1.부터</b> 아래에 해당하는 이러닝과정은 실시간 비대면(ZOOM)으로 전환하여 운영합니다.</p><p>분야별 사례 중심의 교육내용 개편과 실시간 양방향 교육방식 적용으로 보다 나은 교육 서비스를 제공하겠습니다.&nbsp;</p><p>-&nbsp; 이러닝 과정은<b> <u>2023년 12월 31일까지만 수강신청</u></b> 가능합니다(24년 이러닝 교육 없음).</p><p>&nbsp;</p><p>○국문과정:</p><p>&nbsp;</p><p>-경영간부를 위한 품질경영</p><p>( ▶비대면교육 신청 링크: <a href=\"https://bit.ly/경영간부를위한품질경영\">https://bit.ly/경영간부를위한품질경영</a>&nbsp; &nbsp; &nbsp;</p><p>&nbsp;☎ 교육 문의 : KS교육인증운영센터 이상정 위원(02-6240-4627), sjlee@ksa.or.kr)</p><p>-품질관리담당자 정기교육</p><p>(▶ 비대면교육 신청 링크: <a href=\"https://bit.ly/품질관리담당자정기교육\">https://bit.ly/품질관리담당자정기교육</a>&nbsp; &nbsp; &nbsp;</p><p>&nbsp;☎ 교육 문의 : KS교육인증운영센터 김상진 위원(02-6240-4624), sjkim@ksa.or.kr)</p><p>---------------------------------------------------------------------------</p><p>&nbsp;</p><p>○영문과정&nbsp;</p><p>- Quality Management Training for Executives_경영간부를 위한 품질경영(영문)</p><p>- Regular Scheduled Training for KS Quality Engineers_품질관리담당자정기교육(제품)</p><table class=\"__se_tbl_ext\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"881\" style=\"border-collapse:\n" +
				" collapse;width:661pt;mso-yfti-tbllook:1056\">\n" +
				" <colgroup><col width=\"595\" style=\"mso-width-source:userset;width:446pt\">\n" +
				" <col width=\"91\" style=\"mso-width-source:userset;width:68pt\">\n" +
				" <col width=\"95\" style=\"mso-width-source:userset;width:71pt\">\n" +
				" <col width=\"100\" style=\"mso-width-source:userset;width:75pt\">\n" +
				" </colgroup><tbody><tr height=\"39\" style=\"mso-height-source:userset;height:29.2pt\">\n" +
				"  <td height=\"39\" class=\"oa1\" width=\"595\" style=\"border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:1px solid #70AD47;\n" +
				"\tbackground:#70AD47;\n" +
				"\tmso-pattern:auto none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; height:29.2pt;width:446pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size:12.0pt;font-family:'맑은 고딕';mso-ascii-font-family:'맑은 고딕';\n" +
				"  color:white;mso-color-index:0;mso-font-kerning:12.0pt;language:en-US;\n" +
				"  font-weight:bold;mso-style-textfill-type:solid;mso-style-textfill-fill-themecolor:\n" +
				"  background1;mso-style-textfill-fill-color:white;mso-style-textfill-fill-alpha:\n" +
				"  100.0%\">Course</span></p>\n" +
				"  </td>\n" +
				"  <td class=\"oa2\" width=\"91\" style=\"height:29.2pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tbackground:#70AD47;\n" +
				"\tmso-pattern:auto none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:68pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\">&nbsp;</p>\n" +
				"  </td>\n" +
				"  <td class=\"oa2\" width=\"95\" style=\"height:29.2pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tbackground:#70AD47;\n" +
				"\tmso-pattern:auto none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:71pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\">&nbsp;</p>\n" +
				"  </td>\n" +
				"  <td class=\"oa3\" width=\"100\" style=\"height:29.2pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:1px solid #70AD47;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tbackground:#70AD47;\n" +
				"\tmso-pattern:auto none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:75pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\">&nbsp;</p>\n" +
				"  </td>\n" +
				" </tr>\n" +
				" <tr height=\"19\" style=\"mso-height-source:userset;height:14.6pt\">\n" +
				"  <td height=\"19\" class=\"oa4\" width=\"595\" style=\"border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:1px solid #70AD47;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; height:14.6pt;width:446pt\">\n" +
				"  <p style=\"line-height: normal; margin: 0pt 0in; text-indent: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size: 12pt; font-family: 'Noto Sans KR'; font-weight: bold;\">Quality\n" +
				"  Management for Management Executives</span></p>\n" +
				"  </td>\n" +
				"  <td class=\"oa5\" width=\"91\" style=\"height:14.6pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:68pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size: 12pt; font-family: '맑은 고딕';\">4.15-17</span></p>\n" +
				"  </td>\n" +
				"  <td class=\"oa5\" width=\"95\" style=\"height:14.6pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:71pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size: 12pt; font-family: '맑은 고딕';\">7.2-4</span></p>\n" +
				"  </td>\n" +
				"  <td class=\"oa6\" width=\"100\" style=\"height:14.6pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:1px solid #70AD47;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:75pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size: 12pt; font-family: '맑은 고딕';\">10.29-31</span></p>\n" +
				"  </td>\n" +
				" </tr>\n" +
				" <tr height=\"19\" style=\"mso-height-source:userset;height:14.6pt\">\n" +
				"  <td height=\"19\" class=\"oa4\" width=\"595\" style=\"border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:1px solid #70AD47;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; height:14.6pt;width:446pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size: 12pt; font-family: 'Noto Sans KR'; font-weight: bold;\">Regular\n" +
				"  Scheduled Training for KS Quality Engineers</span></p>\n" +
				"  </td>\n" +
				"  <td class=\"oa5\" width=\"91\" style=\"height:14.6pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:68pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size: 12pt; font-family: '맑은 고딕';\">4.17-19</span></p>\n" +
				"  </td>\n" +
				"  <td class=\"oa5\" width=\"95\" style=\"height:14.6pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:none;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:71pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size: 12pt; font-family: '맑은 고딕';\">6.26-28</span></p>\n" +
				"  </td>\n" +
				"  <td class=\"oa6\" width=\"100\" style=\"height:14.6pt; border-top:1px solid #70AD47;\n" +
				"\tborder-right:1px solid #70AD47;\n" +
				"\tborder-bottom:1px solid #70AD47;\n" +
				"\tborder-left:none;\n" +
				"\tvertical-align:top;\n" +
				"\tpadding-bottom:3.6pt;\n" +
				"\tpadding-left:7.2pt;\n" +
				"\tpadding-top:3.6pt;\n" +
				"\tpadding-right:7.2pt; width:75pt\">\n" +
				"  <p style=\"margin-top: 0pt; margin-bottom: 0pt; margin-left: 0in; direction: ltr; unicode-bidi: embed;\"><span style=\"font-size: 12pt; font-family: '맑은 고딕';\">9.30-10.2</span></p>\n" +
				"  </td>\n" +
				" </tr>\n" +
				"</tbody></table><br><br><p>&nbsp;</p><p>* The course will be converted to non-face-to-face class(using Zoom) from <b>January 1st, 2024.</b></p><p>* In order to enhance the understanding of KS certification and quality control work, real-time two-way training is conducted through Korean-English consecutive interpretation.</p><p>&nbsp; (KS인증과 품질관리 업무에 대해 이해를 높이고자, 한-영 순차통역을 통한 실시간 양방향 교육으로 진행합니다.)&nbsp;</p><p>*&nbsp; Application period: From February 1st, 2024 ~ a week before the start of the training (교육 1주전 신청)</p><p>* Contact Information:</p><p>- Quality Management Training for Executives_경영간부를 위한 품질경영(영문) : sjlee@ksa.or.kr</p><p>- Regular Scheduled Training for KS Quality Engineers_품질관리담당자정기교육(제품): sjkim@ksa.or.kr</p>";

		System.out.println(htmlStr.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "").trim());


	}
}
