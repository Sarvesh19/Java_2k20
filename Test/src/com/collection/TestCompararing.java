package com.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import exectuter.Hosting;

public class TestCompararing {

	//
	// private final List<String> books;

	public static void main(String[] args) {

		Comparator<Hosting> c = Comparator.comparing(Hosting::getId).thenComparing(h -> h.getName());

		TreeMap<Hosting, Integer> m1 = new TreeMap<Hosting, Integer>(c);

//Map<Integer, Hosting> m1 = new TreeMap<Integer, Hosting>((Hosting o1,Hosting o2)-> {
//			
//			
//			o1.getId().compare(o2.getId());
//					
//					});
// String

		m1.put(new Hosting(4, "sarvesh", 9l), 3);
		m1.put(new Hosting(4, "sarvesh", 9l), 5);

		m1.put(new Hosting(5, "arvesh", 97l), 63);
		m1.put(new Hosting(7, "rvesh", 69l), 27);
		m1.put(new Hosting(4, "Parvesh", 9l), 2);
		m1.put(new Hosting(4, "Parvesh", 9l), null);

		m1.entrySet().forEach(x -> System.out.println(x));

		Set s = new TreeSet<>();

		System.out.println(1203345564 >>> 8);

		List<Hosting> l = new ArrayList<>();

		l.add(new Hosting(4, "sarvesh", 9l));
		l.add(new Hosting(4, "sarvesh", 9l));

		l.add(new Hosting(5, "arvesh", 97l));
		l.add(new Hosting(7, "rvesh", 69l));
		l.add(new Hosting(4, "Parvesh", 9l));

		// l.removeAll(l);

		// l.sort((Hosting h1,Hosting h2) -> h1.getId().compareTo(h2.getId()));

		l.stream().forEach(x -> System.out.println("wef " + x));

		Collections.sort(l, (c1, c2) -> (c1.getId() < c2.getId()) ? -1 : (c1.getId() > c1.getId()) ? 1 : 0);

		l.stream().forEach(x -> System.out.println("Sorted wef " + x));

		List v = new Vector<>();
		v.add("");

		Stack s1 = new Stack();
		s1.add("sarves");
		s1.push("sed");
		s1.push("ed");
		s1.push("ooed");
		s1.push("uuued");

		s1.firstElement();
		System.out.println(s1.peek());

		LinkedList<String> l2 = new LinkedList();
		l2.add("sravehs");
		l2.add("ravehs");
		l2.add("desravehs"); // `
		l2.remove();

		System.out.println(l2);

		// TreeMap<K, V>

		Hashtable hashtable = new Hashtable<>();
		hashtable.put("sarvesh", 4);
		hashtable.put("sarvesh", 4);
		hashtable.put("arvesh", 4);
		// hashtable.put(null, 4); throw nullpointer

		HashMap m = new HashMap<>();
		m.put("sae", 2);
		m.put("sae", 2);
		m.put("WEae", 2);
		m.put(null, 2);
		m.put(null, null);
		m.put(3, 2);

		System.out.println(m);

		Queue<String> l1 = new ArrayDeque();

	}

}

class Engine {

}
