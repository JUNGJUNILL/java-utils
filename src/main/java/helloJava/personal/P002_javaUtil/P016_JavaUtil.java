package helloJava.personal.P002_javaUtil;

import java.util.*;

public class P016_JavaUtil {
    public static void main(String[] args) {
        
        HelloVo vo1 =new HelloVo(); 
        vo1.setNm("정준일");
        vo1.setAge(19);
        vo1.setNickNm("감스트");

        Map<String,Object> map = new HashMap<>(); 
        map.put("nm", vo1.getNm());
        map.put("age", vo1.getAge());
        map.put("nickNm", "감스트");
        

        HelloVo vo2 =new HelloVo(); 
        vo2.setNm("정준이");
        vo2.setAge(20);

        Map<String,Object> map2 = new HashMap<>(); 
        map2.put("nm", vo2.getNm());
        map2.put("age", vo2.getAge());

    
        List<Map<String,Object>> mapList =new ArrayList<>(); 
        mapList.add(map);
        mapList.add(map2);
        
        for(int i=0; i<mapList.size(); i++){
            Map<String,Object> mapValue = mapList.get(i);
            System.out.println("nm="+mapValue.get("nm") + " : " + "age="+mapValue.get("age") + " : " +"nickNm="+mapValue.getOrDefault("nickNm", "") );
        }

    }
}

class HelloVo {
    private String nm;
    private int age;
    private String nickNm;

    // Getter & Setter for nm
    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    // Getter & Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter & Setter for nickNm
    public String getNickNm() {
        return nickNm;
    }

    public void setNickNm(String nickNm) {
        this.nickNm = nickNm;
    }
}