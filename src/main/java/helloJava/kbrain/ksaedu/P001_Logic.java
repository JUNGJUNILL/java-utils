package helloJava.kbrain.ksaedu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P001_Logic {
	
	public static void main(String[] args) {
	

		
		List<Map<String, Object>> idMapList = new  ArrayList<>();
		
		   Map<String, Object> idMap1 = new HashMap<>(); 
		   idMap1.put("id", 1);
		   
		   idMapList.add(idMap1); 
		   
		   Map<String, Object> idMap2 = new HashMap<>(); 
		   idMap2.put("id", 2);
		   
		   idMapList.add(idMap2); 
		   
		   Map<String, Object> idMap3 = new HashMap<>(); 
		   idMap3.put("id", 3);
		   
		   idMapList.add(idMap3); 
		   
		   List<Map<String, Object>> listMap = new ArrayList<>();
        
	       Map<String, Object> map1 = new HashMap<>(); 
	       map1.put("id", 1);
	       map1.put("q", 11);
       
	       Map<String, Object> map2 = new HashMap<>(); 
	       map2.put("id", 1);
	       map2.put("q", 22);
      
		   Map<String, Object> map3 = new HashMap<>(); 
		   map3.put("id", 1);
		   map3.put("q", 33);

	        listMap.add(map1); 
	        listMap.add(map2); 
	        listMap.add(map3); 
        
        
	       Map<String, Object> map4 = new HashMap<>(); 
	       map4.put("id", 2);
	       map4.put("q", 111);
    
	       Map<String, Object> map5 = new HashMap<>(); 
	       map5.put("id", 2);
	       map5.put("q", 222);
   
		   Map<String, Object> map6 = new HashMap<>(); 
		   map6.put("id", 2);
		   map6.put("q", 333);
	
		     listMap.add(map4); 
		     listMap.add(map5); 
		     listMap.add(map6); 

        
     
     Map<String, Object> map7 = new HashMap<>(); 
     map7.put("id", 3);
     map7.put("q", 1111);

     Map<String, Object> map8 = new HashMap<>(); 
     map8.put("id", 3);
     map8.put("q", 2222);

	   Map<String, Object> map9 = new HashMap<>(); 
	   map9.put("id", 3);
	   map9.put("q", 3333);
	
	listMap.add(map7); 
	listMap.add(map8); 
	listMap.add(map9); 


        List<Map<String, Object>> resultMapList = new ArrayList<>();

        
    	for(int j=0; j<idMapList.size(); j++) {
    		
    	 int index=0; 
    	 Integer id= (int) idMapList.get(j).get("id"); 
      	 
    	 Map<String, Object> resultMap = new LinkedHashMap<>(); 
    	 resultMap.put("id", id); 
    	 
   	     for(int i=0; i<listMap.size(); i++) {
   	    	 
   	 
       		if(listMap.get(i).get("id").equals(idMapList.get(j).get("id"))) {
        			
       		
       			resultMap.put("q"+index, listMap.get(i).get("q")); 
       			 
       				index++;
   
        		}
   	    	 
   	        }
   	  resultMapList.add(resultMap); 
   	     
    	}
    	
    	
    	for(Map<String, Object> map : resultMapList) {
    		System.out.println(map.toString());
    	}
		
		
	}

}
