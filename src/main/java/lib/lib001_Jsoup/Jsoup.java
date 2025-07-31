package lib.lib001_Jsoup;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


//html파일을 java 객체로 받아서 element를 수정 할 수 있는 라이브러리

public class Jsoup {
    public static void main(String[] args) throws Exception {

        String htmlFilePath = "src/main/java/lib/lib001_Jsoup/testHtml.html";
        Path path = Paths.get(htmlFilePath);
        String htmlContent = Files.readString(path, StandardCharsets.UTF_8);

        // 4. 수정된 Document 객체를 다시 HTML 문자열로 변환합니다.
        htmlContent = htmlEdit(htmlContent);

        System.out.println(htmlContent);
  


    }

    private static String htmlEdit(String html) throws Exception {
		//div > style > display:none 이 포함된 요소를 제거하는 함수
		String editHtml=""; 
		String trgtHtml =html;

			Document htmlDoc = org.jsoup.Jsoup.parse(trgtHtml); 
			Elements divs = htmlDoc.select("div[style]");
			
			if(divs != null && divs.size() > 0){
				for (Element div : divs) {
					String styleAttr = div.attr("style");
					String normalizedStyle = styleAttr.replaceAll("\\s+", "");
					if (normalizedStyle.contains("display:none")) {
						div.remove();
					}
				}

				editHtml = 	htmlDoc.html(); 
			}
			
			return editHtml; 
			
	
	}
}
