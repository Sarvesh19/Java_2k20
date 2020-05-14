package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import exectuter.Hosting;


public class TestFinal {

	private final String str;
	
	protected String s = "cec";
	
	public String dr ="rrrr";
	String def = "def";
	

	public TestFinal(String st) {
		this.str = st;
	}

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<>();
		li.addLast("sarvesh");

		li.addLast("rvesh");

		li.addLast("arvesh");

		li.addLast("Parvesh");

		li.addFirst("Ramesh");

		li.addAtPosition(2, "At 2 sarvesh");
		
		li.addFirst("K ooo");


		//Iterator<String> itr = li.iterator();

		//while (itr.hasNext()) {
		//	System.out.println(itr.next().item);
		//}

		System.out.println(li.size());	}
	
	
	
	Map<String, Hosting> map = new HashMap<>();
	

}
