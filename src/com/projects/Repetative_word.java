package com.projects;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_word {
	public static void main(String[] args) {
		String s="kalai is cute and she is always cute kalai";
		 String[] words=s.split(" ");
		 
		 Map<String, Integer> map=new LinkedHashMap<String,Integer>();
		 for (String word : words) {
			
		
		 if (map.containsKey(word)) {
			 Integer value=map.get(word);
			 map.put(word, value+1);
			 
			}
		 else {
			map.put(word,1);
		}}
		System.out.println(map); 
		Set<Entry<String,Integer>> entryset=map.entrySet();
		System.out.println(entryset);
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue()>1) {
				System.out.println(entry);
				
			}
		}
	}

}
