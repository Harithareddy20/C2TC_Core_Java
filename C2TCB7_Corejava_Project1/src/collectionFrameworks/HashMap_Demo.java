package collectionFrameworks;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		   //Creating HashMap   
		   map.put(1,"Guava");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"orange");   
		   map.put(4,"mango");   
		   map.put(null, null);
		   map.put(null, "mango");
		   map.put(5, null);
		       
		   System.out.println("Iterating Hashmap...");  
		   
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    

	}
	}
}
