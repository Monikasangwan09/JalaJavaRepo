package org.jala.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Collection {

	public static void main(String[] args) {
		LinkedList<String> ll =  new LinkedList<String>();
		ll.add("monika");
		ll.addFirst("kaju");
		ll.contains("nisha");
		System.out.println(ll);
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("aaysha");
		ar.isEmpty();
		System.out.println(ar);
		HashMap<String, String> hs= new HashMap<String,String>();
		
		hs.put("t", "m");
		System.out.println(hs);
		
	}

}
