package helloJava.personal.P002_javaUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P012_JavaUtil {
    public static void main(String[] args) {
        List<Map<String, Object>> results = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("id", "1");
        map1.put("nm", "정준일");
        map1.put("age", 30);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", "2");
        map2.put("nm", "정준일");
        map2.put("age", 31);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("id", "3");
        map3.put("nm", "김민수");
        map3.put("age", 25);

        results.add(map1);
        results.add(map2);
        results.add(map3);


        List<Map<String, Object>> distinctList = results.stream()
                .collect(Collectors.toMap(
                        map -> (String) map.get("nm"), // "nm" 값을 key로 사용
                        map -> map, // Map 객체 자체를 value로 사용
                        (existing, replacement) -> existing // 중복된 key가 있을 경우 기존 값 유지
                ))
                .values()
                .stream()
                .collect(Collectors.toList());

        // 결과 출력
        for (Map<String, Object> map : distinctList) {
            System.out.println(map);
        }

        // Map<String,String> map = new HashMap<>(); 

        // map.put("1", "일");
        // map.put("1", "이");
        // map.put("1", "삼");

        // System.out.println(map.get("1").toString());

    }
}
