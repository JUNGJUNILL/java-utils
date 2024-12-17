package helloJava.personal.P002_javaUtil;

import helloJava.personal.P002_javaUtil.P007.P007_Class01;
import helloJava.personal.P002_javaUtil.P007.P007_Class02;



public class P007_JavaUtil {
    public static void main(String[] args) {

        
        //추상 클래스에 대한 상세한 설명
        //https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%B6%94%EC%83%81-%ED%81%B4%EB%9E%98%EC%8A%A4Abstract-%EC%9A%A9%EB%8F%84-%EC%99%84%EB%B2%BD-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0

        // P007_Class02 abstractCass = new P007_Class02() : 추상 클래스는 인스턴스를 생성 할 수 없음.
        // 추상 클래스는 클래스의 일종이라고 하지만 new 생성자를 통해 인스턴스 객체로 직접 만들 수 없다. 
        // 왜냐하면 추상클래스는 상속 구조에서 부모 클래스를 나타내는 역할로만 이용 되기 때문이다.
        P007_Class01 a =new P007_Class01();
        a.test();
        a.test02();

        //익명 클래스에 대한 상세한 설명
        //https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%9D%B5%EB%AA%85-%ED%81%B4%EB%9E%98%EC%8A%A4Anonymous-Class-%EC%82%AC%EC%9A%A9%EB%B2%95-%EB%A7%88%EC%8A%A4%ED%84%B0%ED%95%98%EA%B8%B0
         
        // 익명 클래스는 클래스 정의와 동시에 객체를 생성할 수 있다.
        // 따로 클래스 정의 없이 메소드 내에서 바로 클래스를 생성해 인스턴스화 할 수 있으며, 
        // 이렇게 클래스의 선언과 객체의 생성을 동시에 하기 때문에 단 한 번만 사용될 수 있고, 
        // 익명으로 정의된 클래스는 일회용으로써 사용되고 버려진다. 
        // 그래서 만일 어느 메소드에서 부모 클래스의 자원을 상속받아 재정의하여 사용할 자식 클래스가 한번만 사용되고 버려질 자료형이면, 
        // 굳이 상단에 클래스를 정의하기보다는, 지역 변수처럼 익명 클래스로 정의하고 스택이 끝나면 삭제되도록 하는 것이 유지보수면에서나 프로그램 메모리면에서나 이점을 얻을 수 있다.
        
        // --익명 클래스는 전혀 새로운 클래스를 익명으로 사용하는 것이 아니라, 이미 정의되어 있는 클래스의 멤버들을 재정의 하여 사용할 필요가 있을때 그리고 그것이 일회성으로 이용될때 사용하는 기법이다.즉, 
        // 익명 클래스는 부모 클래스의 자원을 일회성으로 재정의하여 사용하기 위한 용도 인 것이다.
        
        // --익명 클래스는 이름이 없기 때문에 생성자를 가질 수 없으며, 가질 필요도 없다.
        P007_Class01 b = new P007_Class01(){
            @Override
            public void test(){
                System.out.println("hello 익명 클래스");
            }
        };

        b.test();



    }
}
