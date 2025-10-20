package helloJava.personal.P002_javaUtil;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import helloJava.personal.P002_javaUtil.P018.Lamda000;
import helloJava.personal.P002_javaUtil.P018.Lamda001;

/* 
 * 자바 람다식 (Java Lambda Expression) 완벽 정리
 *  - **람다식(Lambda Expression)**이란 간단히 말해 메서드를 하나의 '식(expression)'으로 표현하는 방법입니다. 이름이 없기 때문에 **익명 함수(Anonymous Function)**라고도 불립니다.
 * 
 * 스트림 (Stream API)
 *  - **스트림(Stream)**이란, 데이터 소스(컬렉션, 배열 등)를 직접 변경하지 않고, 데이터의 흐름을 통해 다양한 연산을 수행할 수 있도록 하는 추상화된 개념입니다.[1] 스트림은 '데이터 처리'에 초점을 맞춘 기능입니다.
 * 
 * 
 * 
 * 
 * 
 * 
*/


public class P018_JavaUtil {
    public static void main(String[] args) {

        Lamda000 add = (a,b)-> a+b;
        int a = add.calculate(1,2); 
        System.out.println(a);


        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();
        stream.filter(param -> param.startsWith("a"))
        .forEach(System.out::println);
        System.out.println("==================================================================================================");

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Melon", "Apple", "Grape");
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 9, 1, 7, 5);

        //filter() : Predicate(참/거짓을 반환하는 함수)를 인자로 받아, 조건이 참인 요소만으로 구성된 새로운 스트림을 반환합니다.
        fruits.stream().filter(item -> item.equals("Apple")).forEach(System.out::println);
        System.out.println("==================================================================================================");
        
        //map() : Function(입력을 출력으로 매핑하는 함수)을 인자로 받아, 각 요소를 새로운 값으로 변환한 스트림을 반환합니다.
        List<String> filteredList = fruits.stream().map(fruit -> fruit.toUpperCase()).collect(Collectors.toList()); 
        filteredList.forEach(item-> System.out.println("filteredList of item= "+item));
        System.out.println("==================================================================================================");

        //sorted() : 스트림의 요소를 정렬합니다. 인자 없이 사용하면 기본 오름차순으로 정렬되며, Comparator를 인자로 제공하여 정렬 기준을 직접 지정할 수도 있습니다.
        numbers.stream().sorted().forEach(System.out::println); //오름차순 numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //내림차순
        System.out.println("==================================================================================================");

        //distinct() : 스트림 내의 중복된 요소들을 제거하고 고유한 요소만으로 구성된 스트림을 반환합니다.
        fruits.stream().distinct().forEach(item->System.out.println(item));
        System.out.println("==================================================================================================");
        
        //limit() : 스트림의 처음부터 지정된 개수만큼의 요소만으로 구성된 새로운 스트림을 반환합니다.
        numbers.stream().limit(3).forEach(System.out::println);
        System.out.println("==================================================================================================");
        
        //skip() : 스트림의 처음부터 지정된 개수의 요소를 건너뛴 후, 나머지 요소들로 구성된 새로운 스트림을 반환합니다.
        numbers.stream().skip(3).forEach(System.out::println);
        System.out.println("==================================================================================================");
        
        //reduce() : 초기값에서 시작하여 각 숫자에 할당
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum0 = num.stream().filter(item->item % 2 == 0).reduce(0, (x, y) -> x + y);
        int sum1 = num.stream().mapToInt(Integer::intValue).sum(); 
        System.out.println("sum0="+sum0+" sum1="+sum1);
        System.out.println("==================================================================================================");

        //collect() : 스트림의 요소들을 모아서 List, Set, Map 등 다른 종류의 컬렉션으로 변환하는 매우 중요한 최종 연산입니다. 
        List<Integer> filtered = num.stream().filter(item -> item % 2 == 0).collect(Collectors.toList()); 
        filtered.stream().forEach(System.out::println);
        System.out.println("==================================================================================================");

        //anyMatch() : 조건을 만족하는 요소가 아나라도 있는지 확인
        boolean isTrue = num.stream().anyMatch(item->item % 2 == 0); 
        System.out.println("isTrue="+isTrue);
        System.out.println("=================================================================================================");

        //나이가 30세 이상인 고객의 이름을 출력하세요.
        List<Lamda001> results = Arrays.asList(new Lamda001("Alice", 25), new Lamda001("Bob", 32), new Lamda001("Charlie", 25), new Lamda001("David", 40));
        results.stream().filter(item-> item.getAge() >= 30).forEach(item->System.out.println(item.getName()+" : "+item.getAge()));
        System.out.println("=================================================================================================");
        
        List<Lamda001> overAge30_0 = results.stream().filter(item->item.getAge() >=30).map(item->new Lamda001(item.getName(), item.getAge())).collect(Collectors.toList()); 
        overAge30_0.forEach(item-> System.out.println(item.getName()+" : "+ item.getAge()));
        System.out.println("=================================================================================================");
        List<String> overAge30_1 = results.stream().filter(item->item.getAge() >=30).map(item-> item.getName()).collect(Collectors.toList()); 
        overAge30_1.forEach(System.out::println);
        System.out.println("=================================================================================================");

        //고객의 평균 나이를 구하십시오
        double ageAvg = results.stream().mapToInt(item->item.getAge()).average().orElse(0.0); 
        System.out.println("ageAvg=" +ageAvg);

        


    }
}
