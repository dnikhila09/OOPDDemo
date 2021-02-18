package com.valuemomentum.training.collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1,"java");
		languages.put(2,"phython");
		languages.put(3,"javascript");
		System.out.println("hashmap:"+languages);
		
		//get() method to get value
		String value = languages.get(1);
		System.out.println("value at index 1:"+value);
		
		System.out.println("value at index 1:"+languages.get(3));

		System.out.println("Keys: "+languages.keySet());
        System.out.println("Values: "+languages.values());
        
        System.out.println("key/value mappings: "+languages.entrySet());

 

        languages.replace(2, "C++");
        
        //iterate through keys only
        System.out.println("keys:");
        for(Integer key: languages.keySet()) {
        	System.out.println(key+" -"+languages.get(key));
        	System.out.println(",");
        	
        	// iterate through key/value entries
            System.out.print("\nEntries: ");
            for (Entry<Integer, String> entry : languages.entrySet()) {
              System.out.print(entry);
              System.out.print(", ");
            }
        }
	}

}
