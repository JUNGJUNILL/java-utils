package lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
사용 라이브러리
json-smart  

jackson-databind
*/

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

class Person {
	
	private String name; 
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 

	
	
}

class EtTab {
    private String ort01;
    private String stcd1;
    private String stras;
    private String lifnr;
    private String smtpAddr;
    private String gbort;
    private String text40;
    private String sexkz;
    private String telf1;
    private String telf2;
    private String wtWithcd;
    private String stcd2;
    private String name1;
    private String pstlz;
    private String telfx;
	public String getOrt01() {
		return ort01;
	}
	public void setOrt01(String ort01) {
		this.ort01 = ort01;
	}
	public String getStcd1() {
		return stcd1;
	}
	public void setStcd1(String stcd1) {
		this.stcd1 = stcd1;
	}
	public String getStras() {
		return stras;
	}
	public void setStras(String stras) {
		this.stras = stras;
	}
	public String getLifnr() {
		return lifnr;
	}
	public void setLifnr(String lifnr) {
		this.lifnr = lifnr;
	}
	public String getSmtpAddr() {
		return smtpAddr;
	}
	public void setSmtpAddr(String smtpAddr) {
		this.smtpAddr = smtpAddr;
	}
	public String getGbort() {
		return gbort;
	}
	public void setGbort(String gbort) {
		this.gbort = gbort;
	}
	public String getText40() {
		return text40;
	}
	public void setText40(String text40) {
		this.text40 = text40;
	}
	public String getSexkz() {
		return sexkz;
	}
	public void setSexkz(String sexkz) {
		this.sexkz = sexkz;
	}
	public String getTelf1() {
		return telf1;
	}
	public void setTelf1(String telf1) {
		this.telf1 = telf1;
	}
	public String getTelf2() {
		return telf2;
	}
	public void setTelf2(String telf2) {
		this.telf2 = telf2;
	}
	public String getWtWithcd() {
		return wtWithcd;
	}
	public void setWtWithcd(String wtWithcd) {
		this.wtWithcd = wtWithcd;
	}
	public String getStcd2() {
		return stcd2;
	}
	public void setStcd2(String stcd2) {
		this.stcd2 = stcd2;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getTelfx() {
		return telfx;
	}

	public String getPstlz() {
		return pstlz;
	}
	public void setPstlz(String pstlz) {
		this.pstlz = pstlz;
	}
	public void setTelfx(String telfx) {
		this.telfx = telfx;
	}

    // 생성자, getter, setter 등 필요한 메서드 추가
    
    
}

public class Json {

	public static void main(String[] args) throws Exception{
		
		JSONObject param1 = new JSONObject(); 
		param1.put("hello1", 1); 
		param1.put("hello2", 2);
		
		JSONObject param2 = new JSONObject(); 
		param2.put("hello1", 11);
		param2.put("hello2", 22);
		
		System.out.println(param1.toJSONString());
		
		JSONArray jsonArray = new JSONArray(); 
		jsonArray.add(param1);
		jsonArray.add(param2);
		
		System.out.println(jsonArray);
		
		JSONObject person1 = new JSONObject(); 
		person1.put("name", "정준일"); 
		person1.put("age", 34);
		
		JSONObject person2 = new JSONObject(); 
		person2.put("name", "정준이"); 
		person2.put("age", 22);
		
		JSONArray personList =new JSONArray(); 
		personList.add(person1);
		personList.add(person2);
		
		//JSON 객체 문자열을 JAVA 객체로 변환
		ObjectMapper mapper =new ObjectMapper(); 
		Person newPerson = mapper.readValue(person1.toJSONString(), Person.class);
			System.out.println(newPerson.getName());
			System.out.println(newPerson.getAge());
	
		//JSON 배열을 JAVA 객체로 전환
		List<Person> persons = mapper.readValue(personList.toJSONString(), new TypeReference<List<Person>>() {});
		
		System.out.println(persons.size());
		
		for(Person p : persons) {
			System.out.println(p.getName()+" : "+p.getAge());
		}
		
        String json = "{\"etBank\":[{\"bankn\":\"64040204003087\",\"bankl\":\"004\",\"banka\":\"국민은행\",\"koinh\":\"김우현\",\"lifnr\":\"0000424741\"},{\"bankn\":\"110268415600\",\"bankl\":\"088\",\"banka\":\"신한은행\",\"koinh\":\"황태연\",\"lifnr\":\"E7032\"}],\"etTab\":[{\"ort01\":\"인천 연수구 컨벤시아대로 81\",\"stcd1\":\"8009111703711\",\"stras\":\"405\",\"lifnr\":\"0000424741\",\"smtpAddr\":\"\",\"gbort\":\"\",\"text40\":\"사업소득 (거주자 3%)\",\"sexkz\":\"\",\"telf1\":\"\",\"telf2\":\"0175229274\",\"wtWithcd\":\"01\",\"stcd2\":\"\",\"name1\":\"김우현\",\"pstlz\":\"21995\",\"telfx\":\"\"},{\"ort01\":\"서울 마포구 포은로2가길 36\",\"stcd1\":\"8009111024615\",\"stras\":\"102동 602호\",\"lifnr\":\"E7032\",\"smtpAddr\":\"\",\"gbort\":\"\",\"text40\":\"기타소득-필경60%(거주자 20%)\",\"sexkz\":\"\",\"telf1\":\"\",\"telf2\":\"01088609738\",\"wtWithcd\":\"07\",\"stcd2\":\"\",\"name1\":\"황태연\",\"pstlz\":\"04026\",\"telfx\":\"\"}],\"evMsg\":\"\"}";
        ObjectMapper objectMapper = new ObjectMapper(); 
        Map<String, Object> jsonData = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {});

        List<Map<String, Object>> etTabList = (List<Map<String, Object>>) jsonData.get("etTab");
        
        System.out.println(etTabList.size());
        List<EtTab> etTabObjects = new ArrayList<>();
        
        for (Map<String, Object> etTabData : etTabList) {
            EtTab etTab = objectMapper.convertValue(etTabData, EtTab.class);
            etTabObjects.add(etTab);
        }
        
        for (EtTab etTab : etTabObjects) {
            System.out.println(etTab.getLifnr()+" : "+etTab.getName1()+" : "+etTab.getOrt01()+" : "+etTab.getStras()+" : "+etTab.getTelf2()+" : "+etTab.getStcd2());
        }
        
	}

}
