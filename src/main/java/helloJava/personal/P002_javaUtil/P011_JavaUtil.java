package helloJava.personal.P002_javaUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TestVo {
    private String id;
    private String nm; 
    private int age;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNm() {
        return nm;
    }
    public void setNm(String nm) {
        this.nm = nm;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    } 

}

public class P011_JavaUtil {
    public static void main(String[] args) {
        TestVo vo1 = new TestVo();
        vo1.setId("1");
        vo1.setNm("정준일");
        vo1.setAge(30);

        TestVo vo2 = new TestVo();
        vo2.setId("2");
        vo2.setNm("정준일");
        vo2.setAge(31);

        List<TestVo> results = new ArrayList<>(); 
        results.add(vo1);
        results.add(vo2);

        List<String> distinctNm = results.stream().map(vo->vo.getNm()).distinct().collect(Collectors.toList()); 

        for(String nm : distinctNm){
            System.out.println(nm);
        }
    }
}

