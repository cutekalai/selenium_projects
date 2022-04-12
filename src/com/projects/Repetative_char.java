package com.projects;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_char {
public static void main(String[] args) {
	String s="kalaiselvi";

	
	Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	for (int i = 0; i < s.length(); i++) {
	  char c = s.charAt(i);
	  if (map.containsKey(c)) {
	    int cnt = map.get(c);
	    map.put(c, ++cnt);
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
