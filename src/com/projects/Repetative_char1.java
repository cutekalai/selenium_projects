package com.projects;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repetative_char1 {

	public static void main(String[] args) {
		String s="kalaiselvi";
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (map.containsKey(c)) {
		    Integer value = map.get(c);
		    map.put(c, value+1);
		  } else {
		    map.put(c, 1);
		   
		  }
		}
		System.out.println(map); 
		
		Set<Entry<Character,Integer>> entryset=map.entrySet();
		System.out.println(entryset);
	
		for (Entry<Character,Integer> entry : entryset) {
			if (entry.getValue()>1) {
				System.out.println(entry);
				
			}
		}
	}

	

	}

