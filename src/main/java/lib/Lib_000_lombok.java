package lib;

import lombok.*;

public class Lib_000_lombok {

    public static void main(String[] args) {

        //@Builder : Builder 패턴을 손쉽게 해준다.
        TestVo vo1 = TestVo.builder()
                .nm("정준일")
                .nickNm("준일짱")
                .age(10)
                .build();

        TestVo vo2 = TestVo.builder()
                .nm("정준이")
                .age(22)
                .build();

        System.out.println(vo1.toString());
        System.out.println(vo2.toString());

        //@AllArgsConstructor : 어노테이션은 파라미터가 없는 기본 생성자를 생성
        TestVo vo3 = new TestVo("정","정정",1);

        //@NoArgsConstructor :  파라미터가 없는 기본 생성자를 생성
        TestVo vo4 = new TestVo();

        //@RequiredArgsConstructor : https://velog.io/@sssungjin/Spring-RequiredArgsConstructor
        TestVo2 vo5 = new TestVo2(vo4);
        TestVo vo = vo5.getVo();
        System.out.println(vo.toString());

    }
}


@AllArgsConstructor
@NoArgsConstructor
@Builder
class TestVo {

    private String nm;

    private String nickNm;

    private Integer age;

}

@RequiredArgsConstructor
@Getter
@Setter
class TestVo2 {
    private String val1;
    private String val2;
    private String val3;

    private final TestVo vo;

}