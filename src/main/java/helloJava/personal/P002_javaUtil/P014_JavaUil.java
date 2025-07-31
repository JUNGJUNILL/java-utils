package helloJava.personal.P002_javaUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class P014_JavaUil {
    public static void main(String[] args) throws IOException {
        FileRead();

    }    

    static void FileRead() throws IOException {
        File file =new File("C:\\stream.txt"); 

        FileInputStream fileInput = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInput, StandardCharsets.UTF_8)); 
        
        String line;
        while ((line = br.readLine()) != null) { 
            System.out.println(line);
        }
        br.close();

        //close()
        //결론부터 말하면, 가장 바깥쪽 스트림(br)만 close()하면 그 스트림이 감싸고 있던 내부의 모든 스트림들(InputStreamReader, FileInputStream)이 연쇄적으로 close() 됩니다.
        //이것이 말로만듣던 데코레이션 패턴

        //close()를 하는 진짜 이유:
        //new FileInputStream(file) 코드가 실행될 때, 프로그램은 운영체제에게 "이 파일을 사용하겠습니다"라고 요청하고 **파일 핸들(File Handle)**이라는 자원을 할당받습니다. 
        //이 자원은 개수가 한정되어 있습니다. close()는 운영체제에게 "이제 이 파일 다 썼으니 자원을 반납하겠습니다"라고 알려주는 신호입니다. 
        //만약 close()를 해주지 않으면, 프로그램이 종료될 때까지 파일 자원을 계속 붙잡고 있게 되어 **자원 누수(Resource Leak)**가 발생할 수 있습니다.

    }
}
