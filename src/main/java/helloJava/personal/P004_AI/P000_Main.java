package helloJava.personal.P004_AI;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;


public class P000_Main {
    public static void main(String[] args) throws Exception {

        
 Client client = Client.builder()
                .apiKey("AIzaSyDrEgHVCBFt02gJAs37Xf1t2bX9EUMLesU") // "YOUR_API_KEY" 부분을 실제 발급받은 키로 교체하세요.
                .build();

        GenerateContentResponse response =
            client.models.generateContent(
                "gemini-2.5-flash",
                "그냥 사과를 먹고 있는 원숭이 사진을 얻고 싶어",

                null);

        System.out.println(response.text());
    }    
}
