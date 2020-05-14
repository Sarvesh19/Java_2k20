package com.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;

public class TestArrayList {

	public static void main(String[] args) {

		List l = new ArrayList<>(); // allow null
		l.add(null);
		l.add(null);
		l.add(null);
		// System.out.println(l);

		Set s = new LinkedHashSet<>(); // allow null and combine all null to single null
		s.add(null);
		s.add(null);
		s.add(null);
		s.add(null);
		System.out.println(s);

		Set s1 = new TreeSet<>(); // deesnt allow even single null
//		s1.add(null);
//		s1.add(null);
//		s1.add("saf");

		System.out.println(s1);
		
		// Map m = new TreeMap<>();// deesnt allow even single null
		Map m = new HashMap<>();
		m.put(null, null);
		m.put(null, "karvesh");
		m.put("sarvesh", 3);
	
		m.put(null, "sarvesh");
		m.put("sarvesh", 4);
		m.put("sarvesh", 4);

		m.put("Parvesh", 4);
		m.put("arvesh", "sshaba");

		//m.put(null, null);
		
		System.out.println(m);
		
		
		Map m1Table = new Hashtable<>(); // not allowed null as we null is not object so cant perform equals and hashcode
		m1Table.put("sarvesh", 3);
		m1Table.put("sarvesh", 4);
		m1Table.put("arvesh", 3);
		//m1Table.put(null, 3);
		//m1Table.put(null, 3);
		//m1Table.put(null, null);
		//m1Table.put(null, null);

		m1Table.put("sarvesh", 3);


		System.out.println(m);
		
		//Queue q = new ArrayDeque<>(); // doesnt allow null 
		
		Queue q = new PriorityQueue();
		
		//q.add(null);
		//q.add(null);
		//q.add(null);

		
		//q.add(null);
		
		System.out.println(q);

		
		
		
		
		
		
		

	}
}
