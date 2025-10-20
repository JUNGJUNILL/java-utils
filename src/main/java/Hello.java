

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Hello{
    public static void main(String[] args) throws IOException {
      /*   
      **리플렉션(Reflection)**은 "반사, 투영"이라는 뜻입니다. 프로그래밍에서는 **이미 지어진 건물을 사용하는 것이 아니라, 프로그램 실행 중에 '설계도' 자체를 꺼내서 뜯어보는 행위**를 말합니다.
      마치 우리가 `LoginController`라는 건물의 설계도를 펼쳐놓고 다음과 같은 질문을 하는 것과 같습니다.
      *   "이 설계도(클래스)의 이름은 무엇인가?"
      *   "이 건물에는 'VIP룸'이라는 팻말(`@Controller` 어노테이션)이 붙어 있는가?"
      *   "이 건물 안에는 방(메소드)이 총 몇 개가 있는가?"
      *   "각 방의 이름은 무엇인가?"
      *   "혹시 '로그인실'이라는 팻말(`@RequestMapping("/login")`)이 붙은 방이 있는가?"
      *   "그 '로그인실'이라는 방을 강제로 열어볼 수 있는가? (`메소드를 실행시킬 수 있는가?`)"


      ### 왜 리플렉션이 필요한가요? (프레임워크의 입장)

      Spring 같은 프레임워크는 여러분이 어떤 이름으로 클래스를 만들지 미리 알 수 없습니다. `LoginController`를 만들지, `UserController`를 만들지 전혀 모릅니다.
      따라서 프레임워크는 이렇게 동작해야 합니다.
      "나는 어떤 클래스가 들어올지 모르지만, 그 클래스의 **설계도를 뜯어보고 `@Controller` 팻말이 있으면** 컨트롤러로 인정해주고, **`@RequestMapping` 팻말이 붙은 메소드를 찾아서** URL과 연결해 주겠다!"
      이 '설계도를 뜯어보는' 행위를 가능하게 해주는 도구가 바로 리플렉션입니다.


      이처럼, **실행 중인 프로그램이 자기 자신의 내부 구조(클래스, 메소드, 어노테이션 등)를 들여다보고, 심지어는 조작할 수 있게 해주는 기술**이 바로 리플렉션입니다.
      */

      StringBuffer bf = new StringBuffer(); 
      bf.append("");
    
  }
}	
