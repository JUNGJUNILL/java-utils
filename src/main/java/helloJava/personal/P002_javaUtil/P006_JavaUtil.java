package helloJava.personal.P002_javaUtil;

import java.nio.file.Path;
import java.nio.file.Paths;

public class P006_JavaUtil {

    public static void main(String[] args) {

        String uploadPath = "C://_DEV_/upload";

        Path path = Paths.get(uploadPath).toAbsolutePath().normalize(); 
        /**
         * 경로의 안정성과 정확성을 보장하고, 운영체제 간 경로 처리의 차이를 최소화하기 위함입니다. 
         * 
         * Paths.get(uploadPath) : 문자열로 주어진 경로(originUploadPath)를 Path 객체로 변환합니다.
         * .toAbsolutePath() : 상대 경로를 절대 경로로 변환합니다. 작업 디렉토리에 의존하지 않고 경로를 명확하게 지정하기 위함입니다. 상대 경로가 upload/../upload와 같은 형태라면, 이를 명확한 경로(/home/user/project/upload)로 바꿉니다.운영체제 간 경로 처리 방식의 차이를 줄입니다.
         * .normalize() : 경로를 표준화합니다. 불필요한 경로 요소(. 또는 ..)를 제거합니다. 예: /home/user/../docs/./file.txt → /home/docs/file.txt
         * 
         * 운영체제 간 호환성 : Windows, macOS, Linux 등의 경로 체계를 일관되게 처리.
         * 입력된 경로를 절대적이고 표준화된 형태로 변환하여 명확성, 안전성, 운영체제 호환성을 보장하려는 의도입니다. 특히, 파일 시스템 작업의 안정성과 보안을 강화하는 데 유용합니다.
         * 
         */
        System.out.println(path.toString());
        
    }
    
}
