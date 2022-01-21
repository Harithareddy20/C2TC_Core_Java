package collectionFrameworks;
import java.util.*;

public class TreeMap_Ex {

	public static void main(String[] args) {
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
	      map.put(100,"Arun");    
	      map.put(102,"arjun");    
	      map.put(101,"aakash");    
	      map.put(103,"akhil");    
	     // map.put(null, "Xaviour");
	     map.put(105, null);
	        //removing entry based on key
	     //get an entry
	     //replace an entry
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());  

	}

}
}
