package com.collection;

import java.util.concurrent.LinkedBlockingDeque;

public class TestLinkedList {

	public static void main(String[] args) throws InterruptedException {
		
		LinkedBlockingDeque<String> li = new LinkedBlockingDeque<>();
		
		li.offer("sarvesh");
		li.offer("arvesh");
		li.offer("rvesh");
		li.offer("vesh");
		li.put("sarvesj");
		li.put("sarvesj");
		li.put("rvesj");
		
		

		System.out.println(li);


	}

}
